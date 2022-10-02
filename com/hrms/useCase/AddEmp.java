package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.EmpException;

public class AddEmp {

	public static void main(String[] args) {
		EmployeeDao em = new EmployeeDaoImpl();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Employee Name ");
		String name = s.nextLine();
		
		System.out.println("Enter Salary ");
		String salary = s.nextLine();
		
		System.out.println("Enter Employee Role");
		String role = s.nextLine();
		
		System.out.println("Enter Employee email ");
		String email = s.nextLine();
		
		System.out.println("Enter Employee password ");
		String password = s.nextLine();
		
		System.out.println("Enter Employee password ");
		int deptid = Integer.parseInt(s.nextLine());
		Employee emp = new Employee(deptid, name,  role,salary,  email,password);
		String res;
		try {
			res = em.empRegister(emp);
		} catch (EmpException e) {
			res=e.getMessage();
		}
		System.out.println(res);
	}

}
