package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Complaint;
import com.cybage.model.Department;
import com.cybage.model.DepartmentHead;

public class AdminDao {

	public List<Department> getDepartmentList() throws Exception {
		String sql = "select * from department";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Department> dept = new ArrayList<Department>();
		while(rs.next()) {
			dept.add(new Department(rs.getString(1), rs.getString(2)));
		}
		return dept;
	}

	public int addDepartment(Department dept) throws Exception {
		String sql = "insert into department values(?, ?)";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);

		ps.setString(1, dept.getDeptId());
		ps.setString(2, dept.getDepartmentName());
		


		return ps.executeUpdate();
	}

	public int deleteDepartment(String deptId) throws Exception {
		String sql = "delete from department where deptId = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);		
		ps.setString(1, deptId);			
		return ps.executeUpdate();
	}

	public Department getDepartment(String deptId) throws Exception {
		String sql = "select * from department where deptId = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, deptId);
		ResultSet rs = ps.executeQuery();
		Department  dept = null;
		if(rs.next()) {
			dept = new Department(rs.getString(1), rs.getString(2));
		}
		return dept;
	}

	public int updateDepartment(Department dept) throws Exception {
		String sql = "update department set departmentname = ? where deptId = ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);		
		ps.setString(1, dept.getDepartmentName());
		ps.setString(2, dept.getDeptId());
		
		return ps.executeUpdate();
	}

	//=========================================================
	
	
	public List<DepartmentHead> getDepartmentHeadList() throws Exception {
		String sql1 = "select * from departmenthead dh inner join user u on dh.userId=u.userId inner join department d on dh.deptId=d.deptId";
		String sql ="select dh.deptheadId, dh.name, dh.email, dh.contact,u.username,u.password, d.departmentname,u.role from departmenthead dh inner join user u on dh.userId=u.userId inner join department d on dh.deptId=d.deptId";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<DepartmentHead> depthead = new ArrayList<DepartmentHead>();
		while(rs.next()) {
			depthead.add(new DepartmentHead(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
		}
		return depthead;
	}

	
	  public int addDepartmentHead(String uid,DepartmentHead depthead) throws Exception {
		  String sql1 = "insert into user(username,password,role) values(?, ?, ?)"; 
		  Connection connection1 = DbUtil.getConnection(); 
		  PreparedStatement ps1 = connection1.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);
		  ps1.setString(1, depthead.getUsername());
		  ps1.setString(2, depthead.getPassword());
		  ps1.setString(3, "department");
		  int uidd = ps1.executeUpdate();
		  int userid=0;
		  ResultSet generatedKeys = ps1.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                userid=(int) generatedKeys.getLong(1);
	            }
//		  System.out.println("uid"+user);
//		  int uidd=user.getInt(arg0)
		  String sql="select deptId from department where departmentname=?"; 
		  Connection connection = DbUtil.getConnection();
		  PreparedStatement ps = connection.prepareStatement(sql);
		  ps.setString(1, depthead.getDepartmentName());
		  ResultSet rs = ps.executeQuery();
		  String deptid="";
		while(rs.next()) {
			   deptid=rs.getString("deptId");
		}
		  System.out.println("deptid"+deptid);
		  
		  String sql2 = "insert into departmenthead  values(?, ?, ?, ?,?,?)"; 
		  Connection connection2 = DbUtil.getConnection();
		  PreparedStatement ps2 = connection2.prepareStatement(sql2);
		  ps2.setString(1, uid);
		  ps2.setString(2, depthead.getName());
		  ps2.setString(3, depthead.getEmail());
		  ps2.setString(4, depthead.getContact());
		  ps2.setString(5, deptid);
		  ps2.setInt(6, userid);
		  
		  return ps2.executeUpdate();
		   
		  }
	  
	  public int deleteDepartmentHead(String deptHeadId) throws Exception { String
	  sql = "delete from departmenthead where deptheadId = ?"; Connection connection =
	  DbUtil.getConnection(); PreparedStatement ps =
	  connection.prepareStatement(sql); ps.setString(1, deptHeadId); return
	  ps.executeUpdate(); }
	  
	  public DepartmentHead getDepartmentHead(String deptHeadId) throws Exception {
	  String sql = "select * from department where deptId = ?"; Connection
	  connection = DbUtil.getConnection(); PreparedStatement ps =
	  connection.prepareStatement(sql); ps.setString(1, deptHeadId); ResultSet rs =
	  ps.executeQuery(); DepartmentHead dept = null; if(rs.next()) { dept = new
	  DepartmentHead(rs.getString(1), rs.getString(2), rs.getString(3),
	  rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8)); } return
	  dept; } public int updateDepartmentHead(DepartmentHead deptHead) throws
	  Exception { String sql =
	  "update department set deptId = ?,departmentName = ?"; Connection connection
	  = DbUtil.getConnection(); PreparedStatement ps =
	  connection.prepareStatement(sql);
	  
	  ps.setString(1, deptHead.getDeptHeadId());
	  
	  
	  return ps.executeUpdate(); 
	  }
	  //============================================================
	  
	  public List<Complaint> getComplaint() throws Exception{
			String sql="select complaint.compId,citizen.name,department.departmentname,complaint.description,complaint.status,complaint.dremark,complaint.date from complaint inner join citizen on complaint.citizenId = citizen.citizenId inner join department on department.deptId = complaint.deptId";
			Connection connection = DbUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Complaint> complaint = new ArrayList<Complaint>();
			while(rs.next()) {
				complaint.add(new Complaint(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7)));
			}
			return complaint;
		}
	 
}
