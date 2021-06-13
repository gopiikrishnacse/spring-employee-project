package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Address;
import com.example.employee.model.Dept;
import com.example.employee.model.Employees;

public interface IEmployeeService {
  List<Dept> getDepartments();
  List<Employees> getEmployees();
  Dept getDepartmentByID(String deptId);
  List<Address>  getEmployeeAddress(String deptName, String empName);
}
