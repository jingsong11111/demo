package com.example.demo.service.impl;

import com.example.demo.bean.Student;
import com.example.demo.bean.StudentResult;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }

    @Override
    public List<StudentResult> getStudentValue(){
        List <StudentResult> studentResults = new ArrayList<>();
        Map<String,String> map = new HashMap();
        List <Student> studentList = findAllStudent();
        for (Student student : studentList) {
            String sql = student.getSql();
            map.put("sql",sql);
            studentResults.add(studentDao.findStudentResult(map));
        }
        return studentResults;
    }
}
