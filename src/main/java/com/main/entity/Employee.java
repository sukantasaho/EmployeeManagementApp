package com.main.entity;

import java.time.LocalDate;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "EMP_DETAILS2")
public class Employee {
    
	@Id
	@Column(name = "EMP_ID")
	private String employeeId;
	
	@Column(name = "FIRST_NAME", length = 50)
	@NotBlank(message = "FirstName is mandatory")
	private String firstName;
	
	@Column(name = "LAST_NAME", length = 50)
	@NotBlank(message = "LastName is mandatory")
	private String lastName;
	
	@Column(name = "EMAIL", length = 80)
	@Email(message = "Email should be valid")
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	@ElementCollection
    @CollectionTable(name = "EMP_PHONE_NUMBERS1", joinColumns = @JoinColumn(referencedColumnName = "EMP_ID"))
    @Column(name = "PHONE_NUMBERS")
	@NotBlank(message = "PhoneNumber is mandotory")
	@Max(value = 10, message = "Mobile number should be 10 digits")
	private  Set<Long> phoneNumbers;
	
	@Column(name="DOJ")
	@NotBlank(message = "Date of Joining is mandotory")
	private LocalDate doj;
	
	@Column(name = "SALARY")
	private Double salary;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
