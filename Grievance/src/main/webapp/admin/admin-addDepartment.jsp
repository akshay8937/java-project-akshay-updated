<jsp:include page="admin-header.jsp" /> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
		<div class="container main-container">
	<form method="post" action="<%=request.getContextPath()%>/AdminController/addDepartment">
		<h5 class="card-header info-color white-text text-center py-4">
        	<strong>Add Department</strong>
    	</h5>
		
			<div class="form group">
     			<input type="text" class="form-control mb-4 " name="deptId" placeholder="Department ID">
			</div>
			
			<div class="form-group">
      			<input type="text" class="form-control mb-4" name="departmentName" placeholder="Department Name">
    		</div>
    		
    		<button class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0" type="submit">Add Department</button>
	</form>
	</div>
<jsp:include page="admin-footer.jsp" /> 
