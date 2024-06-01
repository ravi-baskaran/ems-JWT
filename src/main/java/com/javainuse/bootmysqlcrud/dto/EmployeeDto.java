package com.javainuse.bootmysqlcrud.dto;

public class EmployeeDto {

	private Long id;
	private String name;
	private String department;
	private String joiningDate;
	private int salary;
	private String phoneNumber;
	
	
	public EmployeeDto(Long id, String name, String department, String joiningDate, int salary, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	public EmployeeDto() {

	}

	

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}