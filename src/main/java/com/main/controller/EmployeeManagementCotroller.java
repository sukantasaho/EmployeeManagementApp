package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Employee;
import com.main.service.IEmployeeManagementService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class EmployeeManagementCotroller {
	
	@Autowired
	 private IEmployeeManagementService service;
	 
	@PostMapping("/employees")
	public ResponseEntity<String> create(@Valid @RequestBody Employee employee){
		String response = service.create(employee);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> empList = service.getAllEmployess();
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}

}
