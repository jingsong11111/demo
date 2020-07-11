package com.example.demo.bean;

import org.apache.ibatis.type.Alias;

public class StudentResult {

    private String name;
    private int result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "StudentResult{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
