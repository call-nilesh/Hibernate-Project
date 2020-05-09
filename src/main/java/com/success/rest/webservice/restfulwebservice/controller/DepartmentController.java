package com.success.rest.webservice.restfulwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.success.rest.webservice.restfulwebservice.entity.Department;
import com.success.rest.webservice.restfulwebservice.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("AddDepartment")
	public void addDepartment(@RequestBody Department department)
	{
		departmentService.addDepartmentService(department);
	}

}
