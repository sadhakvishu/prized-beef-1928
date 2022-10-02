package com.hrms.useCase;

import java.util.Scanner;


import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.DeptException;

public class TransferEmp {

	public static void main(String[] args) {
		
		EmployeeDao em = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter new department id: ");
		int did = Integer.parseInt(sc.nextLine());
		
		try {
			String e = em.transferEmployee(id, did);
			System.out.println(e);
		} catch (DeptException e) {
			System.out.println(e.getMessage());
		}

	}

}
