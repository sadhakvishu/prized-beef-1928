package com.hrms.useCase;

import java.util.List;
import java.util.Scanner;

import com.hrms.bean.Department;
import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;
import com.hrms.exceptions.DeptException;

public class ListAllDept {

	public static void main(String[] args) {
		
		DepartmentDao d = new DepartmentDaoImpl();
		Scanner sc = new Scanner( System.in);
		
		try {
			List<Department> list = d.deptAllList();
			
			if(list.size() != 0) {
				
				for(Department ds : list) {
					
					System.out.println("Department Id is :  "+ ds.getDeptId());
					System.out.println("Department Name is :  "+ds.getDeptName());
					System.out.println("Department Location is :  "+ds.getDeptLocation());
					System.out.println("=======================================");
					
				}

			}
			
		} catch (DeptException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
