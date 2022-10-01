package com.hrms.dao;

import java.util.List;

import com.hrms.bean.Employee;
import com.hrms.exceptions.DeptException;
import com.hrms.exceptions.EmpException;

public interface EmployeeDao {

	public Employee empLogin(String mail, String password) throws EmpException;
	public String empRegister(Employee e) throws EmpException;
	public String transferEmployee(int id) throws DeptException;
	public Employee viewProfile(int id) throws EmpException;
	public Employee updateProfile(int id) throws EmpException;
	public List<Employee> empAllList() throws EmpException;
	
}
