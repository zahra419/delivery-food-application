package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.demo.Constant;
import com.example.demo.dto.Item;
import com.example.demo.dto.OrderResponse;
import com.example.demo.model.OrderItem;
import com.example.demo.model.Orders;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repository.OrderItemRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository; 
    private final OrderItemRepository orderItemRepository; 
    private final ProductRepository productRepository;    
    @Autowired
    public OrderService(OrderRepository orderRepository, UserRepository userRepository, OrderItemRepository orderItemRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.orderItemRepository = orderItemRepository;
        this.productRepository = productRepository;
    }
    public void createOrder( String address, List<Item> items,String phone) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findUserByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
        double subtotal=0;
         for(Item item:items){
            Product product=productRepository.findById(item.getProductId()).orElseThrow(() -> new RuntimeException("Product not found"));
            subtotal+=product.getPrice()*item.getQuantity();
        }
        double total=subtotal+Constant.DELIVERY_FEE;
        Orders order = new Orders( user, total,  address,  "received", phone, subtotal, Constant.DELIVERY_FEE);
        orderRepository.save(order);
        for(Item item:items){
            Product product=productRepository.findById(item.getProductId()).orElseThrow(() -> new RuntimeException("Product not found"));
            System.out.println("check product" + product);
            OrderItem orderItem =new OrderItem(order, product, item.getQuantity());
            orderItemRepository.save(orderItem);
        }

    }
  
   public List<OrderResponse> getLatestOrders() {

    String email =SecurityContextHolder.getContext().getAuthentication().getName();
    User user =userRepository.findUserByEmail(email).orElseThrow(() -> new RuntimeException("User not found") );
    List<Orders> orders =orderRepository.findLastestOrder(user.getId());

    return orders.stream().map(order -> {
            OrderResponse response =
                new OrderResponse();

            response.setAddress(order.getAddress());
            response.setPhone(order.getPhone());
            response.setStatus(order.getStatus());
            response.setSubtotal(order.getSubtotal());
            response.setDeliveryFee(order.getDeliveryFee());
            response.setTotal(order.getTotal());

            List<OrderResponse.ProductsInfo>
                items =order.getOrderItems().stream()
                .map(item ->
                    new OrderResponse.ProductsInfo(item.getQuantity(),item.getProduct().getTitle(),item.getProduct().getPrice()))
                .toList();

            response.setItems(items);

            return response;

        })
        .toList();
}  

}
