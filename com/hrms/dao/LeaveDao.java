package com.hrms.dao;

import java.util.List;

import com.hrms.bean.Leave;
import com.hrms.exceptions.LeaveException;

public interface LeaveDao {

	public String leaveApply() throws LeaveException;
	public String leaveApprove() throws LeaveException;
	public List<Leave> leaveAllList() throws LeaveException;
	
}
