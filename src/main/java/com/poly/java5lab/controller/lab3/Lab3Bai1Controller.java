package com.poly.java5lab.controller.lab3;

import com.poly.java5lab.entity.Genre;
import com.poly.java5lab.entity.ProductEntity;
import com.poly.java5lab.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.Part;
import java.io.File;
import java.nio.file.Path;
import java.util.*;

@Controller
public class Lab3Bai1Controller {
    @Autowired
    ServletContext servletContext;

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
    @ResponseBody
    public List<String> bai1Save(@Validated @ModelAttribute("student") Student student,
                           BindingResult result,
                           Model model
                          ) {
        System.out.println(student.toString());
        List<String> errorMessages = new ArrayList<>();
        if (!result.hasErrors()) {
//            model.addAttribute("success", "Lưu thành công");
//            try {
//                String path = servletContext.getRealPath("/files");
//                File dir = new File(path);
//                if (!dir.exists()) {
//                    dir.mkdirs();
//                }
//                File photoFile = new File(dir, file.getSubmittedFileName());
//                System.out.println(photoFile.getAbsolutePath());
//                file.write(photoFile.getAbsolutePath());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        } else {
            ResourceBundle message = ResourceBundle.getBundle("message");

            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError objectError : errors) {
                errorMessages.add(message.getString(objectError.getDefaultMessage()));
                System.out.println(message.getString(objectError.getDefaultMessage()));
            }
            Collections.reverse(errorMessages);

//            model.addAttribute("messages", errorMessages);
        }
        return errorMessages;
    }
}

