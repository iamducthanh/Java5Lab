package com.poly.java5lab.controller.lab3;

import com.poly.java5lab.entity.Genre;
import com.poly.java5lab.entity.ProductEntity;
import com.poly.java5lab.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.*;

@Controller
public class Lab3Bai1Controller {
    @GetMapping("/lab3/bai1")
    public String bai1Page(@ModelAttribute("student") Student student) {
        student.setName("helle");
        return "views/lab3/lab3bai1";
    }
    @ModelAttribute("genders")
    public List<Genre> getGenders(){
       List<Genre> genres = new ArrayList<>();
       genres.add(new Genre(true, "Male"));
       genres.add(new Genre(false, "Female"));
        return genres;
    }

    @ModelAttribute("faculties")
    public List<String> getFaculties(){
        return Arrays.asList("CNTT", "DLNHKS", "QTDN");
    }

    @ModelAttribute("hobbies")
    public List<String> getHobbies(){
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Travelling");
        hobbies.add("Music");
        hobbies.add("Food");
        hobbies.add("Other");
        return hobbies;
    }


}
