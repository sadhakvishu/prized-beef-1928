package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;
import com.hrms.exceptions.DeptException;

public class UpdateDept {

	public static void main(String[] args) {
		
		
		DepartmentDao d = new DepartmentDaoImpl();
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter department Name: ");
		String deptName = sc.nextLine();
		
		System.out.println("Enter department Location: ");
		String deptLocation = sc.nextLine();
		
		String res;
		try {
			res = d.deptUpdate(deptName, deptLocation);
		} catch (DeptException e) {
			res = e.getMessage();
		}
		
		System.out.println(res);
		

	}

}
