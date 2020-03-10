package com.example.productservice.repository;

import com.example.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepo productRepo;

    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/products")
    public List<Product> retrieveAllUsers() {
        return productRepo.findAll();
    }

    @GetMapping("/hello")
    public String greet() {
        return "Hello";
    }
}
