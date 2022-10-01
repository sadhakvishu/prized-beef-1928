package com.hrms.bean;

import java.util.Objects;

public class Admin {

	private int admId;
	private String admName;
	private String admEmail;
	private String admPassword;
	
	public Admin() {
		super();
	}

	public Admin(int admId, String admName, String admEmail, String admPassword) {
		super();
		this.admId = admId;
		this.admName = admName;
		this.admEmail = admEmail;
		this.admPassword = admPassword;
	}

	public int getAdmId() {
		return admId;
	}

	public void setAdmId(int admId) {
		this.admId = admId;
	}

	public String getAdmName() {
		return admName;
	}

	public void setAdmName(String admName) {
		this.admName = admName;
	}

	public String getAdmEmail() {
		return admEmail;
	}

	public void setAdmEmail(String admEmail) {
		this.admEmail = admEmail;
	}

	public String getAdmPassword() {
		return admPassword;
	}

	public void setAdmPassword(String admPassword) {
		this.admPassword = admPassword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admEmail, admId, admName, admPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(admEmail, other.admEmail) && admId == other.admId
				&& Objects.equals(admName, other.admName) && Objects.equals(admPassword, other.admPassword);
	}

	@Override
	public String toString() {
		return "Admin [admId=" + admId + ", admName=" + admName + ", admEmail=" + admEmail + ", admPassword="
				+ admPassword + "]";
	}
	
	
	
}
