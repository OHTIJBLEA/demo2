package com.example.demo.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequiredArgsConstructor
public class UserRestController {
    String users;

    @GetMapping("/fucking-present")
    public String getJsonFormat() {
        getUsersFromJson2();
        return users;
    }

    public void getUsersFromJson2() {
        try {
            users = Files.readString(Paths.get("src/main/java/com/example/demo/DTO/users.json"), StandardCharsets.UTF_8);
            System.out.println(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

