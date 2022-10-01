package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrms.bean.Department;
import com.hrms.exceptions.DeptException;
import com.hrms.utility.DBConnect;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public String deptAdd(String name, String location) throws DeptException {
		
		
		String message = "Department not Added";
		
		try(Connection conn = DBConnect.connection()) {
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO department values(?,?)");
			ps.setInt(1, Integer.parseInt(name));
			ps.setString(2, location);
			
			int x = ps.executeUpdate();
			if(x > 0) {
				message = "New Department "+name+" Added successfully..";
			}
				
		} catch (SQLException e) {
				throw new DeptException(e.getMessage());
			
		}
		
		return message;
		
		
	}

	@Override
	public List<Department> deptAllList() throws DeptException {

		List<Department> list = new ArrayList<>();
		
		try(Connection conn = DBConnect.connection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM department");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("deptId");
				String name = rs.getString("deptName");
				String location = rs.getString("deptLocation");
				
				Department dep = new Department(id, name,location);
				list.add(dep);
				
			}
			
			
		} catch (SQLException e) {
			throw new DeptException(e.getMessage());
		}
		
		if(list.size() == 0) {
			throw new DeptException("Department table is Empty..!!");
		}
		
		return list;
	}

	@Override
	public String deptUpdate(String name,String location) throws DeptException {

		String message = "Not Updated";
	
		try(Connection conn = DBConnect.connection()){
			
			
			PreparedStatement ps = conn.prepareStatement("UPDATE department SET deptLocation = ? where deptName=?");
			ps.setString(1, location);
			ps.setString(2, name);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Department Updated Successfully..";
			}
		} catch (SQLException e) {
			throw new DeptException(e.getMessage());
		}
		
		return message;
	}

}
