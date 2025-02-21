package myfirst.EmployeesApplication.employeApp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myfirst.EmployeesApplication.employeApp.entity.Employee;
import myfirst.EmployeesApplication.employeApp.repository.EmployeRepository;

@Service
public class EmployeeService {

	@Autowired
	 EmployeRepository employeRepository ;
	
	
	ArrayList<Employee> employees = new ArrayList<>();
	public boolean addEmployee(Employee employee)
	{
		for(Employee temp : employees)
		{
			if (temp.getId() == employee.getId())
			{
				System.err.println("Given employee is already inside the list");
				return false;
			}
		}
		employees.add(employee);
		employeRepository.save(employee);
		
		return true;
		
	}
	
}
