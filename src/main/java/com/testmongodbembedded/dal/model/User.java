package com.testmongodbembedded.dal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "order_DB")
public class User {
    @Id
    private Integer id;
    private String name;
    private String gender;
    private List<Product> products;
    private Address address;
}
