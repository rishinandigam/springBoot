package com.spbootprojects.mydairy.myapp.services;

import com.spbootprojects.mydairy.myapp.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {

  public Employee saveEmployee(Employee emp);
  public Employee   updateEmployee(Employee emp);
  public void   deleteEmployee(Employee emp);
  public Employee  findById(long id);
  public  List<Employee> selectAll();
}
