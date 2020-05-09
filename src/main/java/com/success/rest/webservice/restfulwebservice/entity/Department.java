package com.success.rest.webservice.restfulwebservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

	@Id @GeneratedValue
	private int deptId;
	private String deptName;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department() {
		
		// TODO Auto-generated constructor stub
	}
	public Department(int deptId, String deptName) {
		
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	
}
