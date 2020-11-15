package com.cybage.model;

import java.sql.ResultSet;

public class DepartmentHead {
	private String deptHeadId;
	private String name;
	private String email;
	private String contact;
	private String username;
	private String password;
	private String departmentName;
	private String role;
	
	public DepartmentHead() {
		// TODO Auto-generated constructor stub
	}




	public DepartmentHead(String deptHeadId, String name, String email, String contact, String username,
			String password, String departmentName, String role) {
		super();
		this.deptHeadId = deptHeadId;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.departmentName = departmentName;
		this.role = role;
	}




	public String getDeptHeadId() {
		return deptHeadId;
	}



	public void setDeptHeadId(String deptHeadId) {
		this.deptHeadId = deptHeadId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	@Override
	public String toString() {
		return "DepartmentHead [deptHeadId=" + deptHeadId + ", name=" + name + ", email=" + email + ", contact="
				+ contact + ", username=" + username + ", password=" + password + ", departmentName=" + departmentName
				+ ", role=" + role + "]";
	}






	
}
