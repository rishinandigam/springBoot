package com.spbootprojects.mydairy.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spbootprojects.mydairy.myapp.entities.Employee;
import com.spbootprojects.mydairy.myapp.services.EmployeeService;
@RestController
public class HomeController {

	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
	@GetMapping("/insert")
	public String insertEmployee()
	{
		
		Employee employee  = new Employee();
		employee.setName("rishi");
		employee.setDepartment("information");
		employee.setExperience("50");
		employee.setDesignation("all");
		employee.setDescription("this is rishi");
		Employee emp = employeeService.saveEmployee(employee);
		
		return "The employee name is  : "+emp.getName()+"with the id : "+emp.getId()+" is saved successfully";
		
	}
	
	@PostMapping("/insertemp")
	public String insertEmployee1()
	{
		
		Employee employee  = new Employee();
		employee.setName("rishi");
		employee.setDepartment("information");
		employee.setExperience("50");
		employee.setDesignation("all");
		employee.setDescription("this is rishi");
		Employee emp = employeeService.saveEmployee(employee);
		
		return "The employee name is  : "+emp.getName()+"with the id : "+emp.getId()+" is saved successfully";
		
	}
	
}
