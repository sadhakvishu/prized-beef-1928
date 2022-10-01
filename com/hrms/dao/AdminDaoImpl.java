package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hrms.bean.Admin;
import com.hrms.exceptions.AdmException;
import com.hrms.utility.DBConnect;

public class AdminDaoImpl implements AdminDao{

	@Override
	public Admin admLogin(String mail, String password) throws AdmException {
		Admin admin = null;
		
		try(Connection conn = DBConnect.connection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select * from admin where admPassword = ? AND admMail = ?");
			
			ps.setString(1, password);
			ps.setString(2, mail);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("empId");
				String n = rs.getString("empName");
				
				
				admin = new Admin(id, n,mail,password);
			}else {
				
				throw new AdmException(" Invalid Password Or Email...");
				
			}
			
		}catch(SQLException e) {
			throw new AdmException(e.getMessage());
		}
		
		return admin;
	}

	@Override
	public String updateProfile(int id,String pass) throws AdmException {
		String res = "Old password remains";
		
		try(Connection conn = DBConnect.connection()){
			
			
			PreparedStatement ps = conn.prepareStatement("update admin set admPassword = ? where admId = ?");
			ps.setString(1, pass);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) res = "Password updates successfully";
		}catch(SQLException e) {
			throw new AdmException(e.getMessage());
		}
	
		return res;
	}

}
