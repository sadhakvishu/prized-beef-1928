package com.hrms.dao;

import java.util.List;

import com.hrms.bean.Department;
import com.hrms.exceptions.DeptException;

public interface DepartmentDao {

	public String deptAdd(String name, String location) throws DeptException;
	public List<Department> deptAllList() throws DeptException;
	public Department deptUpdate(String name) throws DeptException;
	
}
