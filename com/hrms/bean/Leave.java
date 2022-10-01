package com.hrms.bean;

import java.util.Objects;

public class Leave {

	private int leaveId;
	private String empName;
	private int empId;
	private int leaveDuration;
	private String approveDeny;
	
	public Leave() {
		super();
	}

	public Leave(int leaveId, String empName, int empId, int leaveDuration, String approveDeny) {
		super();
		this.leaveId = leaveId;
		this.empName = empName;
		this.empId = empId;
		this.leaveDuration = leaveDuration;
		this.approveDeny = approveDeny;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getLeaveDuration() {
		return leaveDuration;
	}

	public void setLeaveDuration(int leaveDuration) {
		this.leaveDuration = leaveDuration;
	}

	public String getApproveDeny() {
		return approveDeny;
	}

	public void setApproveDeny(String approveDeny) {
		this.approveDeny = approveDeny;
	}

	@Override
	public int hashCode() {
		return Objects.hash(approveDeny, empId, empName, leaveDuration, leaveId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leave other = (Leave) obj;
		return Objects.equals(approveDeny, other.approveDeny) && empId == other.empId
				&& Objects.equals(empName, other.empName) && leaveDuration == other.leaveDuration
				&& leaveId == other.leaveId;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", empName=" + empName + ", empId=" + empId + ", leaveDuration="
				+ leaveDuration + ", approveDeny=" + approveDeny + "]";
	}
	
	
	
		
	
}
