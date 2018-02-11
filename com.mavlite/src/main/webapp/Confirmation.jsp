<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="testpac.StudentService"%> 
  <%@page import="testpac.Student"%>
   <%@page import="java.util.List"%>
    <%
    StudentService ss = new StudentService();
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

<title>Insert title here</title>
</head>
<jsp:include page="Header.jsp"></jsp:include>
<body>
<div class="container-fluid">
<div class="col-md-2">
</div>
<div class="col-md-8">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-user-plus fa-lg " style="color:green"></i>  Add a Student</div>
  <div class="panel-body">
 <h2>Students Rows</h2>
        
  <table class="table table-hover">
    <thead>
      <tr>
      <th>No</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>email</th>
        <th>Edit</th>
      </tr>
    </thead>
    <tbody>
     
     <%
     List<Student> st = ss.getStudentList();
     int i = 1;
     for(Student al: st){
    	
     %>
      <tr>
      <td><%=i %></td>
        <td><%=al.getFirstname() %></td>
        <td><%=al.getLastname() %></td>
        <td><%=al.getEmail() %></td>
        <td><a href="#">Edit</></td>
      </tr>
      <%
      i++; 
     }
     
      %>
    </tbody>
  </table>
</div>
</div>
</div>
<div class="col-md-2">
</div>
</div>

</body>
</html>