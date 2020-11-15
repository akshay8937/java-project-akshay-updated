<jsp:include page="admin-header.jsp" /> 
<%@page import="com.cybage.model.Complaint"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<div class="container ">
<h5 class="card-header info-color white-text text-center py-4">
        <strong>View Complaints</strong>
    </h5>

	<table class="table table-hover table-bordered ">
		<thead>
			<tr>
				<th scope="row">Complaint Id</th>
				<th scope="row">Citizen Name</th>
				<th scope="row">Department Name</th>
				<th scope="row">Description</th>
				<th scope="row">Status</th>
				<th scope="row">Remark</th>
				<th scope="row">Date</th>
			</tr>
		</thead>
	<c:forEach var="comp" items="${complaint }">
		<tr>
		<td><c:out value="${comp.compId}"></c:out></td>
		<td><c:out value="${comp.citizenName }"></c:out></td>
		<td><c:out value="${comp.deptName }"></c:out></td>
		<td><c:out value="${comp.description }"></c:out></td>
		<td><c:out value="${comp.status }"></c:out></td>
		<td><c:out value="${comp.remark }"></c:out></td>
		<td><c:out value="${comp.date }"></c:out></td>
		</tr>
	</c:forEach>
	</table>
</div>
<jsp:include page="admin-footer.jsp" /> 
