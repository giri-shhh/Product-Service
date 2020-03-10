package com.example.productservice.bootstrap;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class Bootstrap implements CommandLineRunner {

    private ProductRepo productRepo;

    public Bootstrap(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void run(String... args) {
        Stream.of("Bike", "Car", "Auto").map(Product::new).forEach(productRepo::save);
    }
}
