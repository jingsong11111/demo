package com.example.demo.service;

import com.example.demo.bean.Student;
import com.example.demo.bean.StudentResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAllStudent();

    List<StudentResult> getStudentValue();
}
