package com.poly.java5lab.controller.lab4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lab4Bai2 {
    @GetMapping("/lab4/login")
    public String loginPage(){
        return "views/lab4/login";
    }

    @PostMapping("/lab4/login")
    @ResponseBody
    public String checkLogin(){
        return  "";
    }
}
