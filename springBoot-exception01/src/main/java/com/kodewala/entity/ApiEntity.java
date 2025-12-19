package com.kodewala.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeInfo_DB1")
public class ApiEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empWorkforceId;
	private String empName;
	@Column(unique = true,nullable = false)
	private String empContact;
	@Column(unique = true)
	private String empMail;
	private String empDep;
	private String empRole;
	private Double empSalary;
	
	public Integer getEmpWorkforceId() {
		return empWorkforceId;
	}
	public void setEmpWorkforceId(Integer empWorkforceId) {
		this.empWorkforceId = empWorkforceId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpContact() {
		return empContact;
	}
	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
}
