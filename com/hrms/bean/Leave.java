package com.hrms.bean;

import java.util.Objects;

public class Leave {

	private int leaveId;
	private String leaveEmpName;
	private int leaveEmpId;
	private int leaveDuration;
	private String approveDeny;
	
	public Leave() {
		super();
	}

	public Leave(int leaveId, String leaveEmpName, int leaveEmpId, int leaveDuration, String approveDeny) {
		super();
		this.leaveId = leaveId;
		this.leaveEmpName = leaveEmpName;
		this.leaveEmpId = leaveEmpId;
		this.leaveDuration = leaveDuration;
		this.approveDeny = approveDeny;
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

	public String getApproveDeny() {
		return approveDeny;
	}

	public void setApproveDeny(String approveDeny) {
		this.approveDeny = approveDeny;
	}

	@Override
	public int hashCode() {
		return Objects.hash(approveDeny, leaveDuration, leaveEmpId, leaveEmpName, leaveId);
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
		return Objects.equals(approveDeny, other.approveDeny) && leaveDuration == other.leaveDuration
				&& leaveEmpId == other.leaveEmpId && Objects.equals(leaveEmpName, other.leaveEmpName)
				&& leaveId == other.leaveId;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", leaveEmpName=" + leaveEmpName + ", leaveEmpId=" + leaveEmpId
				+ ", leaveDuration=" + leaveDuration + ", approveDeny=" + approveDeny + "]";
	}
	
	
}
