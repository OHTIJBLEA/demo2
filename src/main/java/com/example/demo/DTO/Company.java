package com.example.demo.DTO;

import lombok.Data;

@Data
public class Company {
    private int id;
    private String name;
    private Address address;
}
