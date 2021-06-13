package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.employee.model.Address;
import com.example.employee.model.Dept;

import com.example.employee.service.IEmployeeService;

@RestController
public class EmployeeController {
	  @Autowired
	    private IEmployeeService employeeService;

	    @GetMapping("/depts")
	    public List<Dept> getDepartments() {

	        return employeeService.getDepartments();
	    }
	    
	    @GetMapping("/depts/getDepartment")
	    @ResponseBody
	    public Dept getDepartmentByID(@RequestParam String deptID) {

	        return employeeService.getDepartmentByID(deptID);
	    }
	    
	    @GetMapping("/depts/getEmployeeAddress")
	    @ResponseBody
	    public List<Address> getDepartmentByID(@RequestParam String deptName,@RequestParam String empName) {

	        return employeeService.getEmployeeAddress(deptName, empName);
	    }
}
