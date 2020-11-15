<jsp:include page="admin-header.jsp" /> 
<%@page import="com.cybage.model.Department"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<a href="<%=request.getContextPath()%>/admin/admin-addDepartment.jsp" class="btn btn-info" role="button">add Department</a>
	<div class="container">
	<table class="table table-striped table-hover">
		<thead>
		<tr>
			<th>Dept Id</th>
			<th>Department Name</th>
			<th></th>
			<th></th>
			
		</tr></thead>
		<tbody>
			<c:forEach var="dept" items="${department}">
			<tr>
			<!-- user.getUsername(); user.getUserrole() -->
			<td><c:out value="${dept.deptId}"></c:out></td>  
			<td><c:out value="${dept.departmentName}"></c:out></td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/deletedepartment?deptId=${dept.deptId}">delete</a>
			</td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/editdepartment?deptId=${dept.deptId}">update</a>
			</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
	</div>
<jsp:include page="admin-footer.jsp" /> 
