<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="testpac.ProfessorService"%> 
  <%@page import="testpac.Professor"%>
   <%@page import="java.util.List"%>
<!DOCTYPE html >
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
  
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<%
String action = "Register";
ProfessorService ss = new ProfessorService();
int course_id = 0;
Professor professor = new Professor();

%>
<div class="container-fluid">

<div class="col-md-4">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-book fa-lg " style="color:green"></i>  Add a Professor <p class="text-success">${msg}</p></div>
  <div class="panel-body">
  
 
  
  <form action="ProfessorController" method="post" class="col-md-8">
  <div class="form-group">
    <label for="username">Name:</label>
    <input type="text" name="name" class="form-control" id="email">
  </div>
  
 
  <button type="submit" value="Register" class="btn btn-success "><span class="glyphicon glyphicon-plus"> </span> Register</button>
</form>
  
  </div>
</div>
</div>
<div class="col-md-8">

<div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-book fa-lg " style="color:green"></i></div>
  <div class="panel-body">
 <h2> Courses</h2>
        
  <table class="table table-hover">
    <thead>
      <tr>
      <th>No</th>
        <th>Name</th>
       
      
      </tr>
    </thead>
    <tbody>
     
     <%
    
     List<Professor> st = ss.getProfessorList();
     int i = 1;
     for(Professor al: st){
    	
     %>
      <tr>
      <td><%=i %></td>
        <td><%=al.getName() %></td>
      
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