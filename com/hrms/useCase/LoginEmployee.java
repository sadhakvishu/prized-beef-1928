package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.EmpException;


public class LoginEmployee {

	public static void main(String[] args) {
		EmployeeDao e = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
	

		System.out.println("Enter employeee Email: ");
		String mail = sc.nextLine();
		
		System.out.println("Enter employee password : ");
		String pass = sc.nextLine();
		
		
		
		try {
			Employee employee = e.empLogin(mail, pass);
			System.out.println(employee);
		} catch (EmpException t) {
			System.out.println(t.getMessage());
		}
	}

}
