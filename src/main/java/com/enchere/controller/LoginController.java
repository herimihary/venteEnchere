package com.enchere.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/user/me")
    public String Login(){
        return String.format("Mandela ilay projet");
    }
}
