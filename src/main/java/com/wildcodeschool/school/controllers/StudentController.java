package com.wildcodeschool.school.controllers;

import com.wildcodeschool.school.repositories.StudentRepository;

public class StudentController {

    private static final String SCHOOL_NAME = "South Park Elementary";

    // use this to load students
    private StudentRepository studentRepository = new StudentRepository();

    // TODO : create a route "/" and send the school name to the index

    // TODO : create a route "/list" to the student list

    // TODO : create a route "/student?id=$id" to one student infos
}
