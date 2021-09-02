package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

//    @Autowired
//    StudentService studentService;

    public StudentService studentService = new StudentService();

    @GetMapping("/get/all")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        return studentService.add(student);
    }

    //@PutMapping("/edit")
    //public String edit(@RequestBody Student student) {
        //return studentService.edit(student);
    //}

    @RequestMapping("/getClass/{id}")
    public String getClass(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PutMapping({"/update/{id}"})
    public Student updateStudent(@PathVariable("Id") int id, @RequestBody Student student) {
       return studentService.updateStudent(id, student);
    }


}
