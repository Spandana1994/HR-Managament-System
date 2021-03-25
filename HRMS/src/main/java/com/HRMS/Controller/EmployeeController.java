package com.HRMS.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.HRMS.Entity.Employee;
import com.HRMS.Serivce.Employeeservice;

@Controller
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	Employeeservice es;
	
	@PostMapping(value="/Employee/add",produces="application/json",consumes="application/json")
	public String addEmployee(@RequestBody Employee ep) {
		log.info("Entering into addEmployee method");
		 String emp = es.saveEmployee(ep);	
		log.info("Exiting a addEmployee method");
		return emp;
	}
	@GetMapping(value="/allEmployeeData", produces="application/json")
	public ResponseEntity<List<Employee>>  findAllEmployess() {
		log.info("Entering into findallemployesslist method");
		List<Employee>  employeeList=es.getEmployeeList();
		 ResponseEntity<List<Employee>> rs = new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
		 log.info("Existing into findallemployesslist method");
		 return rs;
	}

}
