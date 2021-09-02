package com.example.StudentManagementSystem.repository;

import com.example.StudentManagementSystem.entity.Marks;
import com.example.StudentManagementSystem.entity.Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public static List<Student> studentList = new ArrayList<Student>();
    List<Marks> listmark= new ArrayList<>();

    public List<Student> getAll() {
        return studentList;
    }

    public String add(Student student) {

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId()==student.getId()){
                return "Failed to add";
            }
        }
        //studentList.stream().filter();
        studentList.add(student);
        return "Successfully added";
    }


    public String getStudentById(Integer Id){

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId()==Id){
                return studentList.get(i).toString();
            }
        }
        return null;

    }


    public String updateStudent(Integer id, Student student) {

        for(int i = 0;i < studentList.size(); i++)
        {
            if(studentList.get(i).getId()==id){
                 studentList.set(i,student);
                 return "Student Updated";
            }
        }
        return "Student not found";
    }

    public String add(Marks marks) {

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId()== marks.getId()){
                listmark.add(marks);
                return "Marks successfully added";

            }
        }
        return "Student Id not valid";

    }

    public List<Marks> getAllMarks() {
        return listmark;
    }
}



