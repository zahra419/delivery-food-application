package com.example.demo.model;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.example.demo.dto.Item;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    @Column(name = "orderDate")
    private Date orderDate;
    @Column(name = "total")
    private Double total;
    @Column(name = "address")   
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "status")
    private String status;
    @Column(name="subtotal")
    private double subtotal;
    @Column(name="delivery_fee")
    private double deliveryFee;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
    public Orders() {
    }
    public Orders(Long id, Date orderDate, Double total, String address, User user,String status,String phone,double subtotal,double deliveryFee) {
        this.id = id;
        this.orderDate = orderDate;
        this.total = total;
        this.address = address;
        this.user = user;
        this.status = status;
        this.phone=phone;
        this.deliveryFee=deliveryFee;
        this.subtotal=subtotal;
    }
    public Orders(User user,Double total, String address, String status,String phone,double subtotal,double deliveryFee) {
        this.total = total;
        this.address = address;
        this.user = user;
        this.status = status;
        this.phone=phone;
        this.subtotal=subtotal;
        this.deliveryFee=deliveryFee;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getStatus() {
        return status;
    }   
    public void setStatus(String status) {
        this.status = status;
    }
     public double getSubtotal() {
        return subtotal;
    }   
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
      public double getDeliveryFee() {
        return deliveryFee;
    }   
    public void setDelivery(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
    public Orders(User user,Double total, String address, String status,String phone,double subtotal,double deliveryFee,List<OrderItem> orderItems) {
        this.total = total;
        this.address = address;
        this.user = user;
        this.status = status;
        this.phone=phone;
        this.subtotal=subtotal;
        this.deliveryFee=deliveryFee;
        this.orderItems=orderItems;
    }
     public List<OrderItem> getOrderItems() {
        return orderItems;
    }   
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
}
