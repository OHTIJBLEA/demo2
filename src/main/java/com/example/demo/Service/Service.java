package com.example.demo.Service;

import com.example.demo.DTO.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public String getUsersFromJson() {
        String users;
        try {
            users = Files.readString(Paths.get("src/main/java/com/example/demo/DTO/users.json"), StandardCharsets.UTF_8);
            return users;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<User> getListUser(String users) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> list;
        try {
            list = objectMapper.readValue(users, new TypeReference<List<User>>(){});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
