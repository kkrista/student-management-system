package com.example.studentmanagement.service.impl;
import com.example.studentmanagement.service.StudentService;
import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    
     public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAlStudents() {
        
        return studentRepository.findAll();
    }
}
