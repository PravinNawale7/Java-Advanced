package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private String Designation;
	

	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}

}
