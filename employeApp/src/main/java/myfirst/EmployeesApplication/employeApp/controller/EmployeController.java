package myfirst.EmployeesApplication.employeApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import myfirst.EmployeesApplication.employeApp.entity.Employee;
import myfirst.EmployeesApplication.employeApp.service.EmployeeService;

@RestController
public class EmployeController {

	private final EmployeeService employeeService;
	
	public EmployeController(EmployeeService employeeService)
	
	{
		this.employeeService = employeeService;
	}
	
	
	
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		boolean savedEmployee = employeeService.addEmployee(employee);
		if (savedEmployee)
		{
			return ResponseEntity.ok(employee);
			
		}
		return ResponseEntity.ok(null);
	}
	
	
	
}
