package com.employee.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.sample.service.EmployeeService;

@RestController
public class UserController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/api/users/{userId}")
	public ResponseEntity<String> getUserEmail(@PathVariable("userId") int userId) {
		
		return new ResponseEntity<>(employeeService.getEmailId(userId), HttpStatus.OK);
		
	}

}
