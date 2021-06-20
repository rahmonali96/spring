package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String mainPage(){
        return "index";
    }
    @GetMapping("/secured")
    public String securedPage(){
        return "secured";
    }

}
