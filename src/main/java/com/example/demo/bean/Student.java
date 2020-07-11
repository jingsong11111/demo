package com.example.demo.bean;

public class Student {
    private int id;
    private String name;
    private int age;
    private String sql;

    //添加注释
    public int getId() {
        return id;
    }
    //测试冲突。。。。。。
    public void setId(int id) {
        this.id = id;
    }
    //测试更新
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
