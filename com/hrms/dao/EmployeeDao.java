package com.hrms.dao;

import java.util.List;

import com.hrms.bean.Employee;
import com.hrms.exceptions.DeptException;
import com.hrms.exceptions.EmpException;

public interface EmployeeDao {

	public Employee empLogin(String mail, String password) throws EmpException;
	public String empRegister(Employee e) throws EmpException;
	public String transferEmployee(int empId,int deptId) throws DeptException;
	public Employee viewProfile(int id) throws EmpException;
	public String updateProfile(int id,String pass) throws EmpException;
	public List<Employee> empAllList() throws EmpException;
	
}
