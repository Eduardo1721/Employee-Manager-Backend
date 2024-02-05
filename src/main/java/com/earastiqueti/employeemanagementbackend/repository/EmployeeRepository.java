package com.earastiqueti.employeemanagementbackend.repository;

import com.earastiqueti.employeemanagementbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
