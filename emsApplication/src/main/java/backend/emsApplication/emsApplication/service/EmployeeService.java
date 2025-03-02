package backend.emsApplication.emsApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import backend.emsApplication.emsApplication.entity.Employee;
import backend.emsApplication.emsApplication.exception.ResourceNotFoundException;
import backend.emsApplication.emsApplication.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
		
	}
	
	
	
	public Employee getEmployeeById(Integer id)
	{
		Employee employee =  employeeRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee is not existing with the id "+id));
				
		return employee;
	}
	
	 
	public List<Employee>  getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	
	
	public Employee updateEmployeeById(Integer id , Employee updateEmployee)
	{
		Employee employee =  employeeRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee is not existing with the id "+id));
		
		
		employee.setFirstName(updateEmployee.getFirstName());
		
		employee.setLastName(updateEmployee.getLastName());
		
		employee.setEmail(updateEmployee.getEmail() );
		
		Employee employeeobj  = employeeRepository.save(employee);
		
		return employeeobj;
		
	}
	
	
	public void deleteEmployeeById(Integer id)
	{
		Employee employee =  employeeRepository.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Employee is not existing with the id "+id));
		
		
	 employeeRepository.delete(employee);
		
	
		
	}
}
