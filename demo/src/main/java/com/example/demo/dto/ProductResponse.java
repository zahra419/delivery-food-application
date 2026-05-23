package com.example.demo.dto;

import com.example.demo.model.Product;

public class ProductResponse {

    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    private Double discount;
    private Long categoryId;
    private String categoryName;
    private String categoryImage;

    public ProductResponse() {}

    public ProductResponse(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.image = product.getImage();
        this.discount = product.getDiscount();

        this.categoryId = product.getCategory().getId();
        this.categoryName = product.getCategory().getName();
        this.categoryImage = product.getCategory().getImage();
    }

    // ======================
    // GETTERS
    // ======================

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public Double getDiscount() {
        return discount;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    // ======================
    // SETTERS
    // ======================

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }
}