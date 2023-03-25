package com.example.demo.DTO;

import lombok.Data;

import java.util.List;

@Data
public class Friends {
    private int id;
    private String name;
    private String email;
    private List<Company> companyList;
}
