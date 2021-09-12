package com.poly.java5lab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String name;
    String email;
    Double marks;
    Boolean gender;
    String faculty;
    String hobbies;
}
