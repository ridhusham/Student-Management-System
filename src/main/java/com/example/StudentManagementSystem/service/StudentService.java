package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {

//    @Autowired
//    StudentRepository studentRepository;

    StudentRepository studentRepository=new StudentRepository();

    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public String add(Student student) {
        return studentRepository.add(student);
    }

    public String edit(Student student) {
        return studentRepository.edit(student);
    }

    public String getStudent(Integer Id){
        return studentRepository.getStudentById(Id);
    }
}
