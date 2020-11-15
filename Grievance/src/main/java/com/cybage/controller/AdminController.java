package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Complaint;
import com.cybage.model.Department;
import com.cybage.model.DepartmentHead;
import com.cybage.service.AdminServiceImpl;
import com.cybage.service.iAdminService;

public class AdminController extends HttpServlet {
	iAdminService adminservice = new AdminServiceImpl();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		System.out.println(path);
		if(path.equals("/departmentlist")) {			
			try {
				List<Department> list =  adminservice.getDepartment();
				request.setAttribute("department", list);
				request.getRequestDispatcher("/admin/admin-departmentlist.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/addDepartment")) {			
			try {
				Department dept = new Department();
				dept.setDeptId(request.getParameter("deptId"));
				dept.setDepartmentName(request.getParameter("departmentName"));
				
				
				adminservice.addDepartment(dept);
				response.sendRedirect("departmentlist");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/deletedepartment")) {			
			try {
				adminservice.deleteDepartment(request.getParameter("deptId"));
				request.setAttribute("deletemsg", "Department deleted successfully");
				response.sendRedirect("departmentlist");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/editdepartment")) {			
			try {
				Department dept = adminservice.getDepartment(request.getParameter("deptId"));
				request.setAttribute("dept", dept);
				request.getRequestDispatcher("/admin/admin-updateDepartment.jsp").forward(request, response);								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/updatedepartment")) {			
			try {
				Department dept = new Department();
				dept.setDeptId(request.getParameter("deptId"));
				dept.setDepartmentName(request.getParameter("departmentName"));
				
				adminservice.updateDepartment(dept);
				response.sendRedirect("departmentlist");										
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//=================================================================================
		if(path.equals("/departmentHeadlist")) {			
			try {
				List<DepartmentHead> list =  adminservice.getDepartmentHead();
				System.out.println(list);
				request.setAttribute("departmentHead", list);
				request.getRequestDispatcher("/admin/admin-departmentheadlist.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		  if(path.equals("/addDepartmentHead")) { 
			  try {
				  DepartmentHead depthead = new DepartmentHead();
				  depthead.setDeptHeadId(request.getParameter("deptHeadId"));
				  depthead.setName(request.getParameter("name"));
				  depthead.setContact(request.getParameter("contact"));
				  depthead.setEmail(request.getParameter("email"));
				  depthead.setUsername(request.getParameter("username"));
				  depthead.setPassword(request.getParameter("password"));
				  depthead.setDepartmentName(request.getParameter("departmentName"));
		  
		  
				  adminservice.addDepartmentHead(depthead);
				  response.sendRedirect("departmentHeadlist"); } catch (Exception e) {
				  e.printStackTrace(); 
				  }
			  }
		  
		  if(path.equals("/deletedepartmentHead")) {
			  try {
				  adminservice.deleteDepartmentHead(request.getParameter("deptHeadId"));
				  request.setAttribute("deletemsg", "DepartmentHead deleted successfully");
				  response.sendRedirect("departmentHeadlist"); } catch (Exception e) {
				  e.printStackTrace();
				  } 
			  } 
		  
		  if(path.equals("/editdepartmentHead")) {
			  try {
				  DepartmentHead dept =adminservice.getDepartmentHead(request.getParameter("deptHeadId"));
				  request.setAttribute("deptHead", dept);
				  request.getRequestDispatcher("/admin/admin-updateDepartmentHead.jsp").forward (request, response); } catch (Exception e) { e.printStackTrace(); 
				  }
			  }
		  
		  
		  if(path.equals("/updatedepartmentHead")) { 
			  try 
			  { 
				  DepartmentHead dept = new DepartmentHead(); dept.setDeptHeadId(request.getParameter("deptHeadId"));
		  		  adminservice.updateDepartmentHead(dept);
				  response.sendRedirect("departmentHeadlist");
				  } 
			  catch (Exception e) {
					  	e.printStackTrace();
					  	}
			  }
		  
		  //================================================================================================
		  
		  if(path.equals("/viewcomplaint")) {
				try {
					List<Complaint> comp=adminservice.getComplaint();
					request.setAttribute("complaint", comp);
					request.getRequestDispatcher("/admin/viewcomplaint.jsp").forward(request, response);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
					 
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
