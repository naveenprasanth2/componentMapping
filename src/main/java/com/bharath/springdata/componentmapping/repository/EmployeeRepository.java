package com.bharath.springdata.componentmapping.repository;

import com.bharath.springdata.componentmapping.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
