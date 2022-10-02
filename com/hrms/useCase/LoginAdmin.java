package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.bean.Admin;
import com.hrms.dao.AdminDao;
import com.hrms.dao.AdminDaoImpl;
import com.hrms.exceptions.AdmException;

public class LoginAdmin {

	public static void main(String[] args) {

		AdminDao a = new AdminDaoImpl();
		Scanner sc = new Scanner(System.in);
		
	

		System.out.println("Enter admin Email: ");
		String mail = sc.nextLine();
		
		System.out.println("Enter admin password : ");
		String pass = sc.nextLine();
		
		
		
		try {
			Admin admin = a.admLogin(mail, pass);
			System.out.println(admin);
		} catch (AdmException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
