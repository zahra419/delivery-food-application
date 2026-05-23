package com.example.demo.controller;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.service.RegisterService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/register")
public class RegisterController {
    private final RegisterService registerService;
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }
    @PostMapping
    public void registerUser(@RequestBody RegisterRequest user) {
        registerService.registerUser(user);
    }
    
    
}
