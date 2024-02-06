package com.earastiqueti.employeemanagementbackend.model;

import jakarta.persistence.*;

// This class represents an Employee entity and is mapped to a database table.
@Entity
public class Employee {

    // @Id indicates that this field is the primary key in the database.
    @Id
    // @GeneratedValue specifies the generation strategy for the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Fields representing attributes of an employee.
    private String firstName;
    private String lastName;
    private String email;

    // Default constructor required by JPA (Java Persistence API).
    public Employee() {
    }

    // Getter and Setter methods for each attribute.

    // Getter method for retrieving the employee's ID.
    public int getId() {
        return id;
    }

    // Setter method for setting the employee's ID.
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for retrieving the employee's first name.
    public String getFirstName() {
        return firstName;
    }

    // Setter method for setting the employee's first name.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for retrieving the employee's last name.
    public String getLastName() {
        return lastName;
    }

    // Setter method for setting the employee's last name.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter method for retrieving the employee's email.
    public String getEmail() {
        return email;
    }

    // Setter method for setting the employee's email.
    public void setEmail(String email) {
        this.email = email;
    }
}
