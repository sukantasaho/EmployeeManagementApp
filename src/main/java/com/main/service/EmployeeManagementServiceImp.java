package com.main.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Employee;
import com.main.repository.IEmployeeRepository;

@Service
public class EmployeeManagementServiceImp implements IEmployeeManagementService {

	private static final String PREFIX = "E";
	@Autowired
	private IEmployeeRepository  repo;
	
	@Override
	public String create(Employee employee) {
		String status = null;
		String uniqueID = PREFIX+generateRandomNumber();
		employee.setEmployeeId(uniqueID);
		Employee emp = repo.save(employee);
		 if(emp.getEmployeeId()!=null) {
			 status = "Record Saved Successfully With Id-"+emp.getEmployeeId();
		 }
		 else {
			 status = "Record not saved";
		 }
		return status;
	}
	private Integer generateRandomNumber() {
		Random random = new Random();
        int min = 100000; // Minimum 6-digit number
        int max = 999999; // Maximum 6-digit number
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
	}
	@Override
	public List<Employee> getAllEmployess() {
		return repo.findAll();
	}

}
