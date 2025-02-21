package myfirst.EmployeesApplication.employeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myfirst.EmployeesApplication.employeApp.entity.Employee;

@Repository
public interface  EmployeRepository extends JpaRepository<Employee,Integer> {

}
