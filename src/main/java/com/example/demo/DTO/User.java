package com.example.demo.DTO;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private String email;
    private List<Friends> friendsList;
}