package com.hrms.useCase;

import java.util.List;

import com.hrms.bean.Leave;
import com.hrms.dao.LeaveDao;
import com.hrms.dao.LeaveDaoImpl;
import com.hrms.exceptions.LeaveException;

public class ListAllLeave {

	public static void main(String[] args) {
		
		LeaveDao le = new LeaveDaoImpl();
		
		try {
			List<Leave> list = le.leaveAllList();
			
			for(Leave l : list) {
				System.out.println("Leave Number is :  "+l.getLeaveId());
				System.out.println("Employee Id is :  "+l.getLeaveEmpId());
				System.out.println("Employee Name is :  "+l.getLeaveEmpName());
				System.out.println("Leave Duration in days :  "+l.getLeaveDuration());
				
				System.out.println("=================================================");
			}
			
		} catch (LeaveException e) {
			System.out.println(e.getMessage());
		}
	}

}
