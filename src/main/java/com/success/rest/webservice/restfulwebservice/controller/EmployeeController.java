package com.success.rest.webservice.restfulwebservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.success.rest.webservice.restfulwebservice.entity.Employee;
import com.success.rest.webservice.restfulwebservice.repository.EmployeeRepository;
import com.success.rest.webservice.restfulwebservice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	
	private EmployeeService employeeService;
	private EmployeeRepository employeeRepository;
// Add Employee
	@PostMapping("/AddEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
	   return employeeService.newEmployeeService(employee);	
    }
	
//All Employee	
	@GetMapping("/allEmployee")
	public List<Employee> findAllEmployee()
	{
	 return	employeeService.allEmployee();
	}
	
//Single Employee
	@GetMapping("/oneEmployee/{empId}")
	public ResponseEntity<Optional<Employee>> findSingEmployee(@PathVariable Integer empId)
	{
		Optional<Employee> emp=employeeService.singleEmployee(empId);
		if(emp==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}
	

	
//Update Employee
	@PutMapping("/updateEmployee/{empId}")
	public ResponseEntity<Employee> updateEmployeeController(@PathVariable Integer empId,@RequestBody Employee employee)
	{
		Employee emp=employeeService.updateEmployee(empId);
		if(emp==null)
		{
			return ResponseEntity.notFound().build();
		}
		//emp.setEmpName(employee.getEmpName());
		emp.setEmpAddress(employee.getEmpAddress());
		
		
		Employee empUpdate=employeeService.newEmployeeService(emp);
		return ResponseEntity.ok().body(empUpdate);
	}
	
	
}
