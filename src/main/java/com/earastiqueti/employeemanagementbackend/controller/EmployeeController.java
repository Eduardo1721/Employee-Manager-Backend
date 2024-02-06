package com.earastiqueti.employeemanagementbackend.controller;

import com.earastiqueti.employeemanagementbackend.model.Employee;
import com.earastiqueti.employeemanagementbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// This class is a controller for handling HTTP requests related to Employee management.
@RestController
@RequestMapping("/Employee")
@CrossOrigin("*")
public class EmployeeController {

    // Autowired annotation is used for automatic dependency injection of EmployeeService.
    @Autowired
    private EmployeeService employeeService; // we are bringing in Employee Service instance

    /** This is a post Request, here we are gonna be saving an employee */
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        // Call the saveEmployee method from EmployeeService and return the result.
        return employeeService.saveEmployee(employee);
    }

    /** Here, we are getting all employees */
    @GetMapping
    public List<Employee> getAllEmployee() {
        // Call the getAllEmployee method from EmployeeService and return the result.
        return employeeService.getAllEmployee();
    }

    /** Here, we are getting one employee by their ID */
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id) {
        // Call the getEmployeeById method from EmployeeService and return the result.
        return employeeService.getEmployeeById(id);
    }

    /** Here, we are updating an employee by their ID */
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        // Call the updateEmployee method from EmployeeService and return the result.
        return employeeService.updateEmployee(id, employee);
    }

    /** Here, we are deleting an employee by their ID */
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        // Call the deleteEmployee method from EmployeeService to delete the employee.
        employeeService.deleteEmployee(id);
    }
}
