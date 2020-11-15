package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminDao;
import com.cybage.model.Complaint;
import com.cybage.model.Department;
import com.cybage.model.DepartmentHead;

public class AdminServiceImpl implements iAdminService{
	AdminDao dao = new AdminDao();
	public List<Department> getDepartment() throws Exception {
			return dao.getDepartmentList();
	}
	public int addDepartment(Department dept) throws Exception {
		return dao.addDepartment(dept);
		
	}
	public int deleteDepartment(String deptId) throws Exception {
		return dao.deleteDepartment(deptId);
		
	}
	public Department getDepartment(String deptId) throws Exception {
		return dao.getDepartment(deptId);
	}
	public int updateDepartment(Department dept) throws Exception {
		return dao.updateDepartment(dept);
		
	}
	
	//==========================================================================
	public String generateDeptHeadNumber(){
		return "D"+ Math.round(Math.random()*99999);
	}
	public List<DepartmentHead> getDepartmentHead() throws Exception {
		return dao.getDepartmentHeadList();
	}
	
	  public int addDepartmentHead( DepartmentHead depthead) throws Exception { 
		  System.out.println(depthead);
		  return dao.addDepartmentHead(generateDeptHeadNumber(),depthead);
		  }
	  
	  public int deleteDepartmentHead(String deptHeadId) throws Exception {
		  return dao.deleteDepartmentHead(deptHeadId);
		  }
	  
	  public DepartmentHead getDepartmentHead(String deptHeadId) throws Exception{
		  return dao.getDepartmentHead(deptHeadId);
		  } 
	  
	  public int updateDepartmentHead(DepartmentHead deptHead) throws Exception {
		  return dao.updateDepartmentHead(deptHead);
	  	  }
	 //=====================================================================
	  public List<Complaint> getComplaint()throws Exception {
			
			return dao.getComplaint();
		}

}
