package com.firstHelloapp.helloapp.repository;

import com.firstHelloapp.helloapp.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployee(Integer id )
    {
    return new Employee(1 , "hell0 rishi" , "it" , 45);

    }

}
