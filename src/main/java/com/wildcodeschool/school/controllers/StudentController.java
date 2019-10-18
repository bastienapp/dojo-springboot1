package com.wildcodeschool.school.controllers;

import com.wildcodeschool.school.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    // use this to load students
    private StudentRepository repository = new StudentRepository();

    // TODO : send the school name to the index page
    @GetMapping("/")
    public String index() {
        String schoolName = "South Park Elementary";
        return "index";
    }

    // TODO : create a route "/list" to the student list

    // TODO : create a route "/student?id=$id" to one student infos
}
