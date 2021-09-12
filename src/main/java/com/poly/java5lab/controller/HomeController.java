package com.poly.java5lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homePage(){
        return "views/home";
    }

    @GetMapping("/")
    public String homePage1(){
        return "redirect:/home";
    }
}
