package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"admin", "department", "citizen"}
				)
		)

public class AppController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.isUserInRole("admin")) {
			request.getRequestDispatcher("/admin/admin-home.jsp").forward(request, response);
		}
		if(request.isUserInRole("department")) {
			request.getRequestDispatcher("/departmentHead/department-home.jsp").forward(request, response);
		}
		if(request.isUserInRole("citizen")) {
			request.getRequestDispatcher("/citizen/citizen-home.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
