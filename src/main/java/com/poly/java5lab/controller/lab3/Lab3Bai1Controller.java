package com.poly.java5lab.controller.lab3;

import com.poly.java5lab.entity.Genre;
import com.poly.java5lab.entity.ProductEntity;
import com.poly.java5lab.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Controller
public class Lab3Bai1Controller {
    @GetMapping("/lab3/bai1")
    public String bai1Page(@ModelAttribute("student") Student student) {
        return "views/lab3/lab3bai1";
    }

    @ModelAttribute("genders")
    public List<Genre> getGenders() {
        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre(true, "Male"));
        genres.add(new Genre(false, "Female"));
        return genres;
    }

    @ModelAttribute("faculties")
    public List<String> getFaculties() {
        return Arrays.asList("CNTT", "DLNHKS", "QTDN");
    }

    @ModelAttribute("hobbies")
    public List<String> getHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Travelling");
        hobbies.add("Music");
        hobbies.add("Food");
        hobbies.add("Other");
        return hobbies;
    }

    @PostMapping("/lab3/bai1")
    public String bai1Save(@Validated @ModelAttribute("student") Student student,
                           BindingResult result,
                           Model model,
                           @RequestParam("lab3File") MultipartFile file) {
        System.out.println(file.getSize());
        System.out.println(student.toString());
        if (!result.hasErrors()) {
            model.addAttribute("success", "Lưu thành công");
        } else {
            ResourceBundle message = ResourceBundle.getBundle("message");
            List<String> errorMessages = new ArrayList<>();
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError objectError : errors) {
                errorMessages.add(message.getString(objectError.getDefaultMessage()));
            }
            Collections.reverse(errorMessages);
            model.addAttribute("messages", errorMessages);
            model.addAttribute("eee","eee");
        }
        return"views/lab3/lab3bai1";
    }
}

