package com.example.demo.dto;

import java.util.List;

public class OrderResponse {

    public static class ProductsInfo {

        private int quantity;
        private String title;
        private double price;

        public ProductsInfo() {}

        public ProductsInfo(int quantity,String title,double price) {
            this.quantity = quantity;
            this.title = title;
            this.price=price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getTitle() {
            return title;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }

    }

    private String address;

    private String phone;

    private double total;

    private double subtotal;

    private String status;

    private double deliveryFee;

    private List<ProductsInfo> items;

    public OrderResponse() {}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public List<ProductsInfo> getItems() {
        return items;
    }

    public void setItems(
        List<ProductsInfo> items
    ) {
        this.items = items;
    }
}
