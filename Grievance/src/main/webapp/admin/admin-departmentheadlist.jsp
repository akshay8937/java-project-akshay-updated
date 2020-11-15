<jsp:include page="admin-header.jsp" /> 
<%@page import="com.cybage.model.DepartmentHead"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<a href="<%=request.getContextPath()%>/admin/admin-addDepartmentHead.jsp" class="btn btn-info" role="button">add department head</a>

<table  class="table table-striped table-hover">

		<thead>
			<tr>
			<th>DeptHead Id</th>
			<th>DeptHead Name</th>
			<th>Email</th>
			<th>Contact</th>
			<th>Username</th>
			<th>Department Name</th>
			<th>Dept head role</th>
			<th></th>
			
		</tr>
		</thead>
		<tbody>
			<c:forEach var="deptHead" items="${departmentHead}">
			<tr>
			
			<td><c:out value="${deptHead.deptHeadId}"></c:out></td>  
			<td><c:out value="${deptHead.name}"></c:out></td>
			<td><c:out value="${deptHead.email}"></c:out></td>
			<td><c:out value="${deptHead.contact}"></c:out></td>
			<td><c:out value="${deptHead.username}"></c:out></td>
			<td><c:out value="${deptHead.departmentName}"></c:out></td>
			<td><c:out value="${deptHead.role}"></c:out></td>
			<td>
			<a href="<%=request.getContextPath()%>/AdminController/deletedepartmentHead?deptHeadId=${deptHead.deptHeadId}">delete</a>
			</td>
		
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
<jsp:include page="admin-footer.jsp" /> 
