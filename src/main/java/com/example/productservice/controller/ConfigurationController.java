package com.example.productservice.controller;

import com.example.productservice.model.Configuration;
import com.example.productservice.model.ProdConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    private Configuration configuration;

    public ConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping(path = "/prod-config")
    public String getProdServiceConfig() {
        return new ProdConfiguration(configuration).toString();
    }
}
