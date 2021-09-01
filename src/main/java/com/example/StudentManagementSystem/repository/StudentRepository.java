package com.example.StudentManagementSystem.repository;

import com.example.StudentManagementSystem.entity.Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public static List<Student> studentList = new ArrayList<Student>();

    public List<Student> getAll() {
        return studentList;
    }

    public String add(Student student) {
        studentList.add(student);
        return "Successfully added";
    }

    public String edit(Student student) {

//        boolean flag= studentList.contains(student);
        Integer indexVal = studentList.indexOf(student);
//        /studentList.edit(student);
        return indexVal.toString();
    }

    public String getStudentById(Integer Id){

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId()==Id){
                return studentList.get(i).toString();
            }
        }
        return null;

    }

}



