package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrms.bean.Employee;
import com.hrms.exceptions.DeptException;
import com.hrms.exceptions.EmpException;
import com.hrms.utility.DBConnect;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee empLogin(String mail, String password) throws EmpException {
		Employee employee = null;
		
		try(Connection conn = DBConnect.connection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where empPassword = ? AND empMail = ?");
			
			ps.setString(1, password);
			ps.setString(2, mail);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("empId");
				String n = rs.getString("empName");
				String r = rs.getString("empRole");
				String s = rs.getString("empSalary");
				int did = rs.getInt("empDeptId");
				int l = rs.getInt("empLeavesAvailable");
				
				
				employee = new Employee(id,did, n,r,s,mail,password, l);
			}else {
				
				throw new EmpException(" Invalid Password Or Email...");
				
			}
			
		}catch(SQLException e) {
			throw new EmpException(e.getMessage());
		}
		
		return employee;
	}

	@Override
	public String empRegister(Employee emp) throws EmpException {
		
		String res = "Not added";
		
		try(Connection conn = DBConnect.connection()){
			
			PreparedStatement ps = conn.prepareStatement ("INSERT INTO employee(empName,empSalary,empRole,empPassword,empMail,empDeptId,empLeavesAvailable) values(?,?,?,?,?,?.?)" );
			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getEmpSalary());
			ps.setString(3, emp.getEmpRole());
			ps.setString(4, emp.getEmpPassword());
			ps.setString(5, emp.getEmpEmail());
			ps.setInt(6, emp.getEmpDeptId());
			ps.setInt(7, emp.getEmpLeavesAvaialable());
			
			int x = ps.executeUpdate();
			if(x > 0) {
				res = "Employee is  Successfully Added";
			}
		} catch (SQLException e) {
			
			throw new EmpException(e.getMessage());
		}
		
		
		return res;
	}

	@Override
	public String transferEmployee(int empId,int deptId) throws DeptException {
		
		String res = "Not transfered";
		
		try(Connection conn = DBConnect.connection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set empDeptId=? where empId = ?");
			ps.setInt(1, empId);
			ps.setInt(2, deptId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				res = "Employee transfered successfully..!!";
			}else {
				res = "Enter valid employee id";
			}
			
		} catch (SQLException e) {
			
			throw new DeptException(e.getMessage());
		}
		
		
		
		return res;
	}

	@Override
	public Employee viewProfile(int id) throws EmpException {
		
		Employee employee = null;
		
		try(Connection conn = DBConnect.connection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select * from empId = ?");
			
			ps.setInt(1, id);
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int i = rs.getInt("empId");
				String n = rs.getString("empName");
				String r = rs.getString("empRole");
				String s = rs.getString("empSalary");
				int did = rs.getInt("empDeptId");
				int l = rs.getInt("empLeavesAvailable");
				String mail = rs.getString("empMail");
				String password = rs.getString("empPassword");
				
				
				employee = new Employee(i,did, n,r,s,mail,password, l);
			}else {
				
				throw new EmpException(" No record found with id "+id);
				
			}
			
		}catch(SQLException e) {
			throw new EmpException(e.getMessage());
		}
		
		return employee;
		
	}

	@Override
	public String updateProfile(int id,String pass) throws EmpException {

		
		String res = "Old password remains";
		
		try(Connection conn = DBConnect.connection()){
			
			
			PreparedStatement ps = conn.prepareStatement("update employee set empPassword = ? where empId = ?");
			ps.setString(1, pass);
			ps.setInt(2, id);
			
			
			int x = ps.executeUpdate();
			if(x>0) res = "Password updates successfully";
		}catch(SQLException e) {
			throw new EmpException(e.getMessage());
		}
	
		return res;
	}

	@Override
	public List<Employee> empAllList() throws EmpException {
		
		List<Employee> list = new ArrayList<>();
		
		try(Connection conn = DBConnect.connection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int i = rs.getInt("empId");
				String n = rs.getString("empName");
				String r = rs.getString("empRole");
				String s = rs.getString("empSalary");
				int did = rs.getInt("empDeptId");
				int l = rs.getInt("empLeavesAvailable");
				String mail = rs.getString("empMail");
				String password = rs.getString("empPassword");
				
				list.add(new Employee(i,did, n,r,s,mail,password, l));
			}
			
			
		} catch (SQLException e) {
			throw new EmpException(e.getMessage());
		}
		
		if(list.size() == 0) {
			throw new EmpException("Table is Empty..");
		}
		
		return list;
	}

}
