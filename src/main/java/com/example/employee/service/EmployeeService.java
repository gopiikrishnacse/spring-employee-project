package com.example.employee.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.employee.model.Address;
import com.example.employee.model.Data;
import com.example.employee.model.Dept;
import com.example.employee.model.Employees;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeService implements IEmployeeService{

	@Override
	public List<Dept> getDepartments() {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<Data> typeReference = new TypeReference<Data>(){};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/dept.json");
		Data depts = null;
		try {
			depts = mapper.readValue(inputStream,typeReference);
			System.out.println("depts:" + depts.toString());
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
		}
		return depts.getDept();
	}

	@Override
	public List<Employees> getEmployees() {
		return null;
	}

	@Override
	public Dept getDepartmentByID(String deptId) {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<Data> typeReference = new TypeReference<Data>(){};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/dept.json");
		Data depts = null;
		try {
			depts = mapper.readValue(inputStream,typeReference);
			System.out.println("depts:" + depts.toString());
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
		}
		for (Dept dept : depts.getDept()) {
			if(dept.getDeptId().equalsIgnoreCase(deptId)) {
				return dept;
			}
		}
		return null;
	}

	@Override
	public List<Address> getEmployeeAddress(String deptName, String empName) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<Data> typeReference = new TypeReference<Data>(){};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/dept.json");
		Data depts = null;
		try {
			depts = mapper.readValue(inputStream,typeReference);
			System.out.println("depts:" + depts.toString());
		} catch (IOException e){
			System.out.println("Unable to save users: " + e.getMessage());
		}
		for (Dept dept : depts.getDept()) {
			if(dept.getDepartment().toLowerCase().contains(deptName.toLowerCase())) {
				 
				 for(Employees emp: dept.getEmployees()) {
					 if(emp.getFirstName().contains(empName)) {
						 return emp.getAddress();
					 }
				 }
				 
			}
		}
		Stream<Dept> deptartment =  depts.getDept().stream().filter(dept -> (dept.getDepartment().toLowerCase()).contains(deptName.toLowerCase()));
		//Stream<Dept> employee = (deptartment.findFirst() as Dept).filter(emp -> (emp.getFirstName()).contains(empName));
		
		if(deptartment.count()>0) {
		Stream<Employees> employee = deptartment.findFirst().get().getEmployees().stream().filter(emp -> (emp.getFirstName().toLowerCase()).contains(empName.toLowerCase()));
		return employee.count()>0 ? employee.findFirst().get().getAddress() : null;
		}else {
			return null;
		}
		
		
	}

}
