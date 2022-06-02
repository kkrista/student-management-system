package com.example.studentmanagement.service;

import java.util.List;

import com.example.studentmanagement.entity.Student;

public interface StudentService {
    List<Student> getAlStudents();

    Student saveStudent(Student student);
    
}
