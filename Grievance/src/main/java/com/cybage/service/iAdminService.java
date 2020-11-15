package com.cybage.service;

import java.util.List;

import com.cybage.model.Complaint;
import com.cybage.model.Department;
import com.cybage.model.DepartmentHead;

public interface iAdminService {

	List<Department> getDepartment() throws Exception;

	int addDepartment(Department dept) throws Exception;

	int deleteDepartment(String parameter) throws Exception;

	Department getDepartment(String parameter) throws Exception;

	int updateDepartment(Department dept) throws Exception;

	//=================================================================
	
	List<DepartmentHead> getDepartmentHead() throws Exception;

	
	  int addDepartmentHead(DepartmentHead depthead) throws Exception;
	  
	  int deleteDepartmentHead(String headId) throws Exception;
	  
	  DepartmentHead getDepartmentHead(String headId) throws Exception;
	  
	  int updateDepartmentHead(DepartmentHead deptHead) throws Exception;

	List<Complaint> getComplaint() throws Exception;
	 

}
