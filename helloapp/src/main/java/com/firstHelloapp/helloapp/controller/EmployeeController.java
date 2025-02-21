package com.firstHelloapp.helloapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller + @ResponseBody
public class EmployeeController {

    @RequestMapping(path = "/getemp" ,method = RequestMethod.GET)

    public String getEmp()
    {
        return  "Employee";
    }

}
