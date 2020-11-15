package com.cybage.model;

public class Department {
	private String deptId;
	private String departmentName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String deptId) {
		super();
		this.deptId = deptId;
	
	}


	public Department(String deptId, String departmentName) {
		super();
		this.deptId = deptId;
		this.departmentName = departmentName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", departmentName=" + departmentName + "]";
	}
	
}
