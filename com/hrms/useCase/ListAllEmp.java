package com.hrms.useCase;

import java.util.List;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.EmpException;

public class ListAllEmp {

	public static void main(String[] args) {
		
		EmployeeDao em = new EmployeeDaoImpl();
		
		try {
			List<Employee> list = em.empAllList();
			
			for(Employee e : list) {
				
				System.out.println("Employee Id is :  "+e.getEmpId());
				System.out.println("Employee name is :  "+e.getEmpName());
				System.out.println("Employee working in Deparment :  "+e.getEmpDeptId());
				System.out.println("Employee Salary is :  "+e.getEmpSalary());
				System.out.println("Employee role is :  "+e.getEmpRole());
				System.out.println("========================================================");
				
			}
			
		} catch (EmpException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
