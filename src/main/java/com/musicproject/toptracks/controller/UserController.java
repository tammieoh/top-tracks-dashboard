package com.musicproject.toptracks.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class UserController {

    @PostMapping("/login")
    public String createToken(){
        // return a token string
        return "token: " + UUID.randomUUID().toString();
    }
}
