package com.earastiqueti.employeemanagementbackend.service;

import com.earastiqueti.employeemanagementbackend.model.Employee;

import java.util.List;
import java.util.Optional;

// This interface defines the contract for Employee service methods.
public interface EmployeeServiceInterface {

    // Service method to save an employee.
    public Employee saveEmployee(Employee employee);

    // Service method to get an employee by their ID.
    public Optional<Employee> getEmployeeById(int id);

    // Service method to get all employees.
    List<Employee> getAllEmployee();

    // Service method to update an employee by their ID.
    Employee updateEmployee(int id, Employee employee);

    // Service method to delete an employee by their ID.
    void deleteEmployee(int id);
}
