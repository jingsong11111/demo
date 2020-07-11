package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test")
public class test {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "hello")
    @ResponseBody
    public String helloWorld(){
        return "helloworld!!!";
    }

    @RequestMapping(value = "findAllStudent")
    @ResponseBody
    public String findAllStudent(){
        return studentService.findAllStudent().toString();
    }

    @RequestMapping(value = "getStudentValue")
    @ResponseBody
    public String getStudentValue(){
        return studentService.getStudentValue().toString();
    }



}
