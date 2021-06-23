package com.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;

@RestController
public class EmplSummaryController {

	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	public Employee firstPage() {
		System.out.println("inside getdata - > controller");
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		
		return emp;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("inside / - > controller");
		return "Controller Response blank Value";
	}

}
