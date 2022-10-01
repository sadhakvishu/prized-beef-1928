package com.hrms.dao;

import com.hrms.bean.Admin;
import com.hrms.exceptions.AdmException;

public interface AdminDao {

	public Admin admLogin(String mail, String password) throws AdmException;
	public String updateProfile(int id,String pass) throws AdmException;
	
}
