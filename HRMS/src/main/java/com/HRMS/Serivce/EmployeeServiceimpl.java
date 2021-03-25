package com.HRMS.Serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.Dao.EmployeeRepo;
import com.HRMS.Entity.Employee;
@Service
public class EmployeeServiceimpl implements Employeeservice {

	@Autowired
	EmployeeRepo er;

	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> lst = er.findAll();
		return lst;
	}

	@Override
	public String saveEmployee(Employee emp) {
		Employee e = er.save(emp);
		return "employee data will be inserted"+e.getEmployeeName();

	}

}
