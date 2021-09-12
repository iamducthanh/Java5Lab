package com.poly.java5lab.controller.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lab2Bai1Controller {
    @GetMapping("/lab2/bai1")
    public String lab2Bai1(Model model) {
        model.addAttribute("ketqua", "m0");
        System.out.println("m0");
        return "views/lab2/lab2Bai1";
    }

    @PostMapping("/lab2/bai1/ok")
    public String m1(Model model) {
        model.addAttribute("ketqua", "m1");
        System.out.println("m1");
        return "views/lab2/lab2Bai1";
    }

    @GetMapping("/lab2/bai1/ok")
    public String m2(Model model) {
        model.addAttribute("ketqua", "m2");
        System.out.println("m2");
        return "views/lab2/lab2Bai1";
    }

    @PostMapping("/lab2/bai1/okx")
    public String m3(Model model, @RequestParam("x") String x) {
        System.out.println("x = " + x);
        model.addAttribute("ketqua", "m3");
        System.out.println("m3");
        return "views/lab2/lab2Bai1";
    }
}
