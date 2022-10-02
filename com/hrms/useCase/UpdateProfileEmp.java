package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.EmpException;

public class UpdateProfileEmp {

	public static void main(String[] args) {
		EmployeeDao em = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome!!  You are about to change the password.....");

		System.out.println("Enter employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter new password : ");
		String pass = sc.nextLine();
		
		
		String s="";
		try {
			 s = em.updateProfile(id, pass);
		} catch (EmpException e) {
			s=e.getMessage();
		}
		
		System.out.println(s);

	}

}
