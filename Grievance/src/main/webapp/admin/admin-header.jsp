<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  	 <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/style1.css">
   
</head>
<body>
	<header>
      <div class="head1">
        <img src="../img/logo.png" alt="">
        <span>Grievance Management</span>
      </div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">GMS</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
          
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav ml-auto mr-4">
                <li class="nav-item active mx-4">
                  <a class="nav-link" href="">HOME <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item mx-4">
                  <a class="nav-link" href="#">ABOUT</a>
                </li>
                <li class="nav-item mx-4">
                  <a class="nav-link" href="#">CONTACT</a>
                </li>
                  <li class="nav-item mx-4">
                  <a class="nav-link" href="<%=request.getContextPath()%>/AdminController/departmentlist">DEPARTMENT</a>
                </li>
                  <li class="nav-item mx-4">
                  <a class="nav-link" href="<%=request.getContextPath()%>/AdminController/departmentHeadlist">DEPARTMENT-HEAD</a>
                </li>
                  <li class="nav-item mx-4">
                  <a class="nav-link" href="<%=request.getContextPath()%>/AdminController/viewcomplaint ">VIEW-COMPLAINT</a>
                </li>
              </ul>
            
              <div class="my-2 my-lg-0">
                <a href="logout.jsp" class="btn btn-info" role="button">logout</a>
               </div>
            </div>
          </nav>
    </header>
</body>
</html>