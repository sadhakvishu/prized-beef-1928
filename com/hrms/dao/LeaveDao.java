package com.hrms.dao;

import java.util.List;

import com.hrms.bean.Leave;
import com.hrms.exceptions.LeaveException;

public interface LeaveDao {

	public String leaveApply(int id, int days, String reason) throws LeaveException;
	public String leaveApprove(int id) throws LeaveException;
	public List<Leave> leaveAllList() throws LeaveException;
	
}
