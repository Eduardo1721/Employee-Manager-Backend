package com.earastiqueti.employeemanagementbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation indicates that this class is the main application class and enables auto-configuration.
@SpringBootApplication
public class EmployeemanagementbackendApplication {

	// The main method, starting point of the application.
	public static void main(String[] args) {
		// This line launches the Spring Boot application, starting the application context and initializing the necessary components.
		SpringApplication.run(EmployeemanagementbackendApplication.class, args);
	}

}
