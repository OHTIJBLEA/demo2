package com.example.demo.Controller;


import com.example.demo.DTO.User;
import com.example.demo.Service.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final Service service;

    @GetMapping("/fucking-present")
    public List<User> getJsonFormat() {
        return service.getListUser(service.getUsersFromJson());
    }
}

