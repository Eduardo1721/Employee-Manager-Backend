package com.earastiqueti.employeemanagementbackend.repository;

import com.earastiqueti.employeemanagementbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This interface is a Spring Data JPA repository for Employee entities.
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

//    The @Repository annotation marks this interface as a Spring bean managed by the Spring container.

//    EmployeeRepository extends the JpaRepository interface, indicating that it will handle CRUD operations for
//    the Employee entity.

//    The generic types specify the entity type (Employee) and the type of its primary key (Integer).
//    This means the repository will be working with Employee entities, and their primary key is of type Integer.