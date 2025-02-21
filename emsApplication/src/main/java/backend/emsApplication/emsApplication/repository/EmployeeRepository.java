package backend.emsApplication.emsApplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import backend.emsApplication.emsApplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
