package com.example.demo.dao;

import com.example.demo.bean.Student;
import com.example.demo.bean.StudentResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface StudentDao {

    List <Student> findAllStudent ();

    StudentResult findStudentResult(Map map );

}
