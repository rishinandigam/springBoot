package com.firstHelloapp.helloapp.dto;

import com.firstHelloapp.helloapp.entity.Employee;

public class Dto {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    String name;
    String dept;
    Integer age;


    public Dto EmployeeMapper(Employee emp)
    {
    this.setName(emp.getName());
    this.setAge(emp.getAge());
    this.setDept(emp.getDept());
    return this;
    }
}
