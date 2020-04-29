package com.example.productservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProdConfiguration {

    private int min;
    private int max;

    public ProdConfiguration(Configuration configuration) {
        this.min = configuration.getMinimum();
        this.max = configuration.getMaximum();
    }
}
