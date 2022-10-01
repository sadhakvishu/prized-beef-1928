package com.hrms.dao;

import com.hrms.bean.Admin;
import com.hrms.exceptions.AdmException;

public interface AdminDao {

	public Admin admLogin(String mail, String password) throws AdmException;
	public String admRegister(Admin a) throws AdmException;
	public Admin viewProfile(int id) throws AdmException;
	public Admin updateProfile(int id) throws AdmException;
	
}
