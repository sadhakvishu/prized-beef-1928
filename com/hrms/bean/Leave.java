package com.hrms.bean;

import java.util.Objects;

public class Leave {

	private int leaveId;
	private String leaveEmpName;
	private int leaveEmpId;
	private int leaveDuration;
	private String leavePermission;
	private String leaveReason;
	
	public Leave() {
		super();
	}

	public Leave(int leaveId, String leaveEmpName, int leaveEmpId, int leaveDuration, String leavePermission,
			String leaveReason) {
		super();
		this.leaveId = leaveId;
		this.leaveEmpName = leaveEmpName;
		this.leaveEmpId = leaveEmpId;
		this.leaveDuration = leaveDuration;
		this.leavePermission = leavePermission;
		this.leaveReason = leaveReason;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getLeaveEmpName() {
		return leaveEmpName;
	}

	public void setLeaveEmpName(String leaveEmpName) {
		this.leaveEmpName = leaveEmpName;
	}

	public int getLeaveEmpId() {
		return leaveEmpId;
	}

	public void setLeaveEmpId(int leaveEmpId) {
		this.leaveEmpId = leaveEmpId;
	}

	public int getLeaveDuration() {
		return leaveDuration;
	}

	public void setLeaveDuration(int leaveDuration) {
		this.leaveDuration = leaveDuration;
	}

	public String getLeavePermission() {
		return leavePermission;
	}

	public void setLeavePermission(String leavePermission) {
		this.leavePermission = leavePermission;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	


	
}
