package com.hrms.useCase;

import java.util.Scanner;

import com.hrms.dao.LeaveDao;
import com.hrms.dao.LeaveDaoImpl;
import com.hrms.exceptions.LeaveException;

public class ApproveLeave {

public static void main(String[] args) {
		
		LeaveDao le = new LeaveDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yout id: ");
		int id = sc.nextInt();
	

		try {
			String s = le.leaveApprove(id);
			System.out.println(s);
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
