<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container main-container">
	<form method="post" action="<%=request.getContextPath()%>/AdminController/updatedepartment">
		<h5 class="card-header info-color white-text text-center py-4">
        	<strong>Update Department</strong>
    	</h5>
		
			<div class="form group">
				<label>Department Id</label>
     			<input type="text" class="form-control mb-4 " name="deptId" value="${dept.deptId}"readonly="readonly">
			</div>
			
			<div class="form-group">
			<lable>Department Name</lable>
      			<input type="text" class="form-control mb-4" name="departmentName" value="${dept.departmentName }">
    		</div>
    		
    		<button class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0" type="submit">Update Department</button>
	</form>
	</div>
	
<jsp:include page="admin-footer.jsp" /> 
