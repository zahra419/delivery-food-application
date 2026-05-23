package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OrderItemRepository;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;
    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public void insertOrderItem() {
        
        // Implement the logic to insert an order item into the database
    }

    public void getAllOrderItems() {
        // Implement the logic to retrieve all order items from the database
    }   
    
}
