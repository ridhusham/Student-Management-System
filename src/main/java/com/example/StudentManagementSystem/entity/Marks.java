package com.example.StudentManagementSystem.entity;

public class Marks {
    private Integer id;
    private String Subject;
    private String Mark;
    private String Grade;  // pass or fail

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", Subject='" + Subject + '\'' +
                ", Mark='" + Mark + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}

