package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Product;
import com.example.demo.model.Categories;

import com.example.demo.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/products")
public class ProdcutController {
    
    private final ProductService productService;
    public ProdcutController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
     @GetMapping("/categories")
    public List<Categories> getCategories(){
        return productService.getAllCategories();
    }
    
}
