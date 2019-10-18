package com.wildcodeschool.school.controllers;

import com.wildcodeschool.school.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private static final String SCHOOL_NAME = "South Park Elementary";

    // use this to load students
    private StudentRepository studentRepository = new StudentRepository();

    // TODO : send the school name to the index page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // TODO : create a route "/list" to the student list

    // TODO : create a route "/student?id=$id" to one student infos
}
