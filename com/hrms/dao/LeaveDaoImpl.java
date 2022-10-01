package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrms.bean.Leave;
import com.hrms.exceptions.EmpException;
import com.hrms.exceptions.LeaveException;
import com.hrms.utility.DBConnect;

public class LeaveDaoImpl implements LeaveDao{

	@Override
	public String leaveApply(int id, int days, String name) throws LeaveException {
		String res = "Not applied yet";
		
		try(Connection conn = DBConnect.connection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into leaves(leaveEmpId,leaveEmpName,leaveDuration) values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, days);
			
			int x = ps.executeUpdate();
			if(x>0) {
				res = "Apllied for leave for "+days+" days";
			}
			
		}catch (SQLException e) {
			throw new LeaveException(e.getMessage());
		}
		
		return res;
	}

	@Override
	public String leaveApprove(int id) throws LeaveException {
		String res = "Not 	approved";
		
		try(Connection conn = DBConnect.connection()){
			
			
				PreparedStatement ps = conn.prepareStatement("update leaves set leavePermission=? where empId = ?");
				ps.setString(1, "Approved");
				ps.setInt(2, id);
				
				int x = ps.executeUpdate();
				
				if(x>0) {
					res = "Leave Approved successfully..!!";
				}else {
					res = "Enter valid employee id";
				}
			
			
		}catch (SQLException e) {
			throw new LeaveException(e.getMessage());
		}
		
		return res;
	}

	@Override
	public List<Leave> leaveAllList() throws LeaveException {
		List<Leave> list = new ArrayList<>();
		
		try(Connection conn = DBConnect.connection()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM leaves");
			
			ResultSet rs =  ps.executeQuery();
			
			
			while(rs.next()) {
				
				int leaveID = rs.getInt("leaveId");
				int empId = rs.getInt("leaveEmpId");
				int dur = rs.getInt("leaveDuration");
				String empName = rs.getString("leaveEmpName");
				String p = rs.getString("leavePermission");
				String r = rs.getString("leaveReason");
				
				list.add(new Leave(leaveID, empName, empId, dur,p,r));
				
			}
			
			
			
		} catch (SQLException e) {
			throw new LeaveException(e.getMessage());
		}
		
		if(list.size() == 0) {
			throw new LeaveException("Nothing here in the table");
		}
		
		return list;
	}

}
