package com.example.demo.dto;
import java.util.List;

public class OrderRequest {
    private String address;
    private String phone;
    private List<Item> items;
    public OrderRequest() {
        }
    public OrderRequest( String address,String phone, List<Item> items) {
        this.address = address;
        this.items = items;
        this.phone=phone;
    }
     public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
  
    public String getAddress() {
        return address;
    }
    public List<Item> getItems() {
        return items;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
