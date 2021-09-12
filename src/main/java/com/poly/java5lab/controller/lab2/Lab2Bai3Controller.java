package com.poly.java5lab.controller.lab2;

import com.poly.java5lab.entity.ProductEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Lab2Bai3Controller {
    @GetMapping("/lab2/bai3")
    public String bai3Page() {
//        model.addAttribute("product", new ProductEntity());
        return "views/lab2/lab2bai3";
    }

    @PostMapping("/lab2/bai3/save")
    public String bai3Save(ProductEntity product, Model model) {
        model.addAttribute("product", product);
        return "views/lab2/lab2bai3";
    }
}
