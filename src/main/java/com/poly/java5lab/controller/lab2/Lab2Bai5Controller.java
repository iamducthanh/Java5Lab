package com.poly.java5lab.controller.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Lab2Bai5Controller {
    @GetMapping("/lab2/bai5")
    public String bai5Page(){
        return "views/lab2/lab2bai5";
    }

    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        return "forward:/lab2/bai5";
    }

    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        return "redirect:/lab2/bai5";
    }
    @ResponseBody
    @RequestMapping("/d")
    public String m4() {
        return "<h1>I come from d</h1>";
    }

}
