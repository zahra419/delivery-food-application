package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductResponse;
import com.example.demo.model.Product;
import com.example.demo.model.Categories;
import com.example.demo.repository.CategoriesRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoriesRepository categoriesRepository;
  
    @Autowired
    public ProductService(ProductRepository productRepository,CategoriesRepository categoriesRepository) {
        this.productRepository = productRepository;
        this.categoriesRepository= categoriesRepository;
      
    }
    public List<Product> getAllProducts(){
        return productRepository.findAllWithCategories();
    }
    public List<Categories> getAllCategories(){
        return categoriesRepository.findAll();
    }
}
