package com.firstHelloapp.helloapp.service;

import com.firstHelloapp.helloapp.dto.Dto;
import com.firstHelloapp.helloapp.entity.Employee;
import com.firstHelloapp.helloapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
public Dto getEmployee(Integer id)
{
    Employee employee = employeeRepository.getEmployee(id);
    Dto dto = new Dto();
   return dto.EmployeeMapper(employee);

}

}
