package com.earastiqueti.employeemanagementbackend.service;

import com.earastiqueti.employeemanagementbackend.model.Employee;
import com.earastiqueti.employeemanagementbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This class provides service methods to interact with Employee entities.
@Service
public class EmployeeService implements EmployeeServiceInterface {

    // Autowired annotation is used for automatic dependency injection of EmployeeRepository.
    @Autowired
    private EmployeeRepository employeeRepository;

    // Service method to save an employee.
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Service method to get an employee by their ID.
    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    // Service method to get all employees, sorted by ID in descending order.
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    // Service method to update an employee by their ID.
    @Override
    public Employee updateEmployee(int id, Employee employee) {
        // Find the employee by ID or throw an exception if not found.
        Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();

        // Update the attributes of the existing employee with the new values.
        employeeToUpdate.setFirstName(employee.getFirstName());
        employeeToUpdate.setLastName(employee.getLastName());
        employeeToUpdate.setEmail(employee.getEmail());

        // Save the updated employee and return the result.
        return employeeRepository.save(employeeToUpdate);
    }

    // Service method to delete an employee by their ID.
    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
