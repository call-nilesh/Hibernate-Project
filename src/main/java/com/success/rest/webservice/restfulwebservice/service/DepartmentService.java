package com.success.rest.webservice.restfulwebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.success.rest.webservice.restfulwebservice.entity.Department;
import com.success.rest.webservice.restfulwebservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public void addDepartmentService(Department department)
	{
		departmentRepository.save(department);
	}
	

}
