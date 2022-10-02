package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.dao.LeaveDao;
import com.hrms.dao.LeaveDaoImpl;
import com.hrms.exceptions.LeaveException;

public class ApplyLeave {

	public static void main(String[] args) {
		
		LeaveDao le = new LeaveDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yout id: ");
		int id = sc.nextInt();
		System.out.println("How many days? ");
		int day= sc.nextInt();
		System.out.println("Your name: ");
		String name = sc.next();

		try {
			String s = le.leaveApply(id, day, name);
			System.out.println(s);
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
		}
	}

}
