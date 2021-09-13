package com.poly.java5lab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @NotBlank(message = "NotBlank.student.name")
    String name;
    @NotBlank(message = "NotBlank.student.email")
    @Email(message = "Email.student.email")
    String email;
    @NotNull(message = "NotNull.student.marks")
    @Min(value = 0, message = "Min.student.marks")
    @Max(value = 10, message = "Max.student.marks")
    Double marks;
    @NotNull(message = "NotNull.student.gender")
    Boolean gender;
    @NotBlank(message = "NotBlank.student.faculty")
    String faculty;
    @NotEmpty(message = "NotEmpty.student.hobbies")
    List<String> hobbies;
    String image;
}
