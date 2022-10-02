package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.EmpException;

public class ViewProfileEmp {

	public static void main(String[] args) {
		EmployeeDao em = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		try {
			Employee e = em.viewProfile(id);
			System.out.println(e);
		} catch (EmpException e) {
			System.out.println(e.getMessage());
		}

	}

}
