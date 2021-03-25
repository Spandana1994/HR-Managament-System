package com.HRMS.Serivce;

import java.util.List;

import com.HRMS.Entity.Employee;

public interface Employeeservice {
	public List<Employee> getEmployeeList();

	String saveEmployee(Employee emp);

}
