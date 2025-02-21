package com.firstHelloapp.helloapp;

import com.firstHelloapp.helloapp.dto.Dto;
import com.firstHelloapp.helloapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellojava")
    public String greetHello()
    {
        return "<h1> Hello java application </h1>";
    }
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Dto> getEmployee(@PathVariable Integer id)
    {
        Dto dto = employeeService.getEmployee(id);
        return   ResponseEntity.ok(dto);
    }



}
