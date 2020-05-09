package com.success.rest.webservice.restfulwebservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.success.rest.webservice.restfulwebservice.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {




}
