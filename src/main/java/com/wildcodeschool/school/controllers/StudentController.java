package com.wildcodeschool.school.controllers;

import com.wildcodeschool.school.entities.Student;
import com.wildcodeschool.school.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private static final String SCHOOL_NAME = "South Park Elementary";

    // use this to load students
    private StudentRepository studentRepository = new StudentRepository();

    // TODO : create a route "/" to the home page
    // TODO : and send the school name : South Park Elementary
    @GetMapping("/")
    public String homepage(Model out) {
        out.addAttribute("schoolName", SCHOOL_NAME);
        return "index";
    }

    // TODO : create a route "/list" to the student list
    @GetMapping("/list")
    public String showList(Model out) {
        List<Student> students = studentRepository.findAll();
        out.addAttribute("studentList", students);
        return "student-list";
    }

    // TODO : create a route "/student?id=$id" to one student infos
}
