package com.example.productservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("todo-application")
public class Configuration {
    private int minimum;
    private int maximum;
}
