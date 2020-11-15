<jsp:include page="admin-header.jsp" /> 
<%@page import="com.cybage.model.DepartmentHead"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<div class="container main-container">
    <h5 class="card-header info-color white-text text-center py-4">
        <strong>Add Department Head</strong>
    </h5>
    <div class="card-body pt-0">
        <form method="post" class="text-center" action="<%=request.getContextPath()%>/AdminController/addDepartmentHead">
            
            <div class="md-form">
                <input type="text" id="deptName" name="name" class="form-control mb-4" placeholder="Department Head Name">
            </div>
               
            <div class="md-form mt-0">
                <input type="email" id="deptEmail" name="email" class="form-control mb-4" placeholder="Department Head Email">
            </div>

            <div class="md-form">
                <input type="text" id="deptContact" name="contact" class="form-control mb-4" placeholder="Department Head Contact">
            </div>

            <div class="md-form mt-0">
                <input type="text" id="deptUsername" name="username" class="form-control mb-4" placeholder="Department Head Username">
            </div>

            <div class="md-form mt-0">
                <input type="password" id="deptPassword" name="password" class="form-control mb-4" placeholder="Department Head Password">
            </div>

            <div class="md-form">
                <input type="text" id="department" name="departmentName" class="form-control mb-4" placeholder="Department Head Department">   
            </div>

            <button class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0" type="submit">Add Department Head</button>  
        </form>
    </div>
</div>
<jsp:include page="admin-footer.jsp" /> 
