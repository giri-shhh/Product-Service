package com.example.productservice.controller;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepo;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepo productRepo;
    private Environment environment;


    public ProductController(ProductRepo productRepo, Environment environment) {
        this.productRepo = productRepo;
        this.environment = environment;
    }

    @GetMapping("/products")
    public List<Product> retrieveAllUsers() {
        String port = environment.getProperty("local.server.port");
        List<Product> products = productRepo.findAll();
        products.forEach(p -> p.setPort(port));
        return products;
    }

    @GetMapping("/hello")
    public String greet() {
        return "Hello";
    }
}
