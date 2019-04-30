package com.example.studentsystem.controllers;

import com.example.studentsystem.model.StudentProfile;
import com.example.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StduentController {
    @Autowired
    private StudentRepository srepo;
    @GetMapping("/all")
    public List<StudentProfile> getAllStudents()
    {
        List<StudentProfile> list=new ArrayList<>();
        srepo.findAll().forEach(list::add);
        return list;
    }
    @GetMapping("/{id}")
    public Object getStudentById(@PathVariable Long id)
    {
        return srepo.findById(id);
    }
    @PostMapping("/add")
    public StudentProfile addStudent(@RequestBody StudentProfile sp)
    {
        return srepo.save(sp);
    }
}
