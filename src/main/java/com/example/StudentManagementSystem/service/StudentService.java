package com.example.StudentManagementSystem.service;

import com.example.StudentManagementSystem.entity.Marks;
import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import com.fasterxml.jackson.databind.util.EnumValues;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentService {

//    @Autowired
//    StudentRepository studentRepository;

    StudentRepository studentRepository=new StudentRepository();


    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public List<Student>getAllStudentsPaginated(int start, int size){
       List<Student> list=this.getAll();
        if(start+size> list.size())
            return new ArrayList<Student>();
        return list.subList(start,size);
    }

    public String add(Student student) {
        return studentRepository.add(student);
    }

    public String add(Marks marks) {
        return studentRepository.add(marks);
    }

    public String getStudent(Integer Id){
        return studentRepository.getStudentById(Id);
    }

    public String updateStudent(Integer Id, Student student) {
        return studentRepository.updateStudent(Id,student);
    }

    public List<Marks> getAllMarks() {
        return studentRepository.getAllMarks();
    }


    //public String addMark(Marks marks) { return studentRepository.addMarks(marks);
    //}

}
