package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.entity.Marks;
import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/getpage")
    public List<Student> getStudent(@RequestParam("start")Integer start,
                                    @RequestParam("size")Integer size){
        if (start >= 0 && size > 0) {
           return studentService.getAllStudentsPaginated(start, size);
        }
        return studentService.getAll();

    }

        @PostMapping("/addstudent")
    public String add(@RequestBody Student student) {
        return studentService.add(student);
    }


    @RequestMapping("/getstudent/{id}")
    public String getstudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }


    @PutMapping({"/update/{id}"})
    public String updateStudent(@PathVariable("Id") int id, @RequestBody Student student) {
       return studentService.updateStudent(id, student);
    }

    //@PostMapping("/addMarks")
    //public String addMarks(@RequestBody Marks marks) {
       // return studentService.addMark(marks);
   // }



}
