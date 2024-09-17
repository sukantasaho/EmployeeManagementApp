package com.main.service;

import java.util.List;

import com.main.entity.Employee;

public interface IEmployeeManagementService {

	public String create(Employee employee);
	public List<Employee> getAllEmployess();
}
