package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> 
{
    
}
