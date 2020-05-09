package com.success.rest.webservice.restfulwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.success.rest.webservice.restfulwebservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
