package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.entity.Marks;
import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/mark")
public class MarksController {

    public StudentService studentService = new StudentService();

    @PostMapping("/addmark")

    public String add(@RequestBody Marks marks) {
        return studentService.add(marks);
    }
    @GetMapping("/getmark")
    public List<Marks> getAll() {
        return studentService.getAllMarks();
    }
}
