package com.spbootprojects.mydairy.myapp.services;
import com.spbootprojects.mydairy.myapp.entities.Employee;
import com.spbootprojects.mydairy.myapp.repositories.EmployeeRepository;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public void deleteEmployee(Employee emp) {
    	employeeRepository.delete(emp);
    }

    
	@Override
    public Employee findById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> selectAll() {
        return employeeRepository.findAll();
    }
}
