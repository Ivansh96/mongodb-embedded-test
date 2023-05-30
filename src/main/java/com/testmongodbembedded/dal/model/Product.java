package com.testmongodbembedded.dal.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Product {

    private String name;
    private Integer quantity;
    private Integer price;
}
