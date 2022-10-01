package com.hrms.bean;

import java.util.Objects;

public class Employee {

	private int empId;
	private int empDeptId;
	private String empName;
	private String empRole;
	private int empSalary;
	private String empEmail;
	private String empPassword;
	
	public Employee() {
		super();
	}

	public Employee(int empId, int empDeptId, String empName, String empRole, int empSalary, String empEmail,
			String empPassword) {
		super();
		this.empId = empId;
		this.empDeptId = empDeptId;
		this.empName = empName;
		this.empRole = empRole;
		this.empSalary = empSalary;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpDeptId() {
		return empDeptId;
	}

	public void setEmpDeptId(int empDeptId) {
		this.empDeptId = empDeptId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empDeptId, empEmail, empId, empName, empPassword, empRole, empSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empDeptId == other.empDeptId && Objects.equals(empEmail, other.empEmail) && empId == other.empId
				&& Objects.equals(empName, other.empName) && Objects.equals(empPassword, other.empPassword)
				&& Objects.equals(empRole, other.empRole) && empSalary == other.empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empDeptId=" + empDeptId + ", empName=" + empName + ", empRole=" + empRole
				+ ", empSalary=" + empSalary + ", empEmail=" + empEmail + ", empPassword=" + empPassword + "]";
	}

	
	
	
	
}
