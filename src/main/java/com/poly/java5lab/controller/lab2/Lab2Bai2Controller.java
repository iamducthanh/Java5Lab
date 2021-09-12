package com.poly.java5lab.controller.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lab2Bai2Controller {
    @GetMapping("/lab2/bai2")
    public String bai2Page() {
        return "views/lab2/lab2bai2";
    }

    @PostMapping("/lab2/bai2/{x}")
    public String bai2Save(@PathVariable("x") String x, @RequestParam("y") String y, Model model) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "views/lab2/lab2bai2";
    }
}
