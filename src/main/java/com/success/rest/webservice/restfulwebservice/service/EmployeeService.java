package com.success.rest.webservice.restfulwebservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.success.rest.webservice.restfulwebservice.entity.Employee;
import com.success.rest.webservice.restfulwebservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee newEmployeeService(Employee employee)
	{		
		return employeeRepository.save(employee);
	}
	
	public List<Employee> allEmployee()
	{
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> singleEmployee(Integer empid)
	{
		return employeeRepository.findById(empid);
	}
	
	
	public Employee updateEmployee(Integer empId)
	{
		return employeeRepository.getOne(empId);
	}
}
