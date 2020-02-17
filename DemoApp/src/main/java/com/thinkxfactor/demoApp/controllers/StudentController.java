package com.thinkxfactor.demoApp.controllers;

import com.thinkxfactor.demoApp.entity.Admin;
import com.thinkxfactor.demoApp.entity.Student;
import com.thinkxfactor.demoApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/getAll")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}