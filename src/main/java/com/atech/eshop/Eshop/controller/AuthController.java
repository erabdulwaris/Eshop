package com.atech.eshop.Eshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/")
    public String register(){
        return "Welcome to Eshop! Dear users!";
    }
}
