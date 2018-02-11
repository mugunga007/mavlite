<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="testpac.CourseService"%> 
  <%@page import="testpac.Course"%>
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
CourseService ss = new CourseService();
int course_id = 0;
Course course = new Course();
if(request.getParameter("course_id")!=null){
	action = "Edit";
	 course_id = Integer.parseInt(request.getParameter("course_id"));
	course = ss.getCourseById(course_id);
	
}

%>
<div class="container-fluid">

<div class="col-md-4">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-book fa-lg " style="color:green"></i>  Add a Course <p class="text-success">${msg}</p></div>
  <div class="panel-body">
  
 
  
  <form action="CourseController" method="post" class="col-md-8">
  <div class="form-group">
    <label for="username">name:</label>
    <input type="text" name="name" value="<%=course.getName() %>" class="form-control" id="email">
  </div>
  <div class="form-group ">
    <label for="pwd">credits:</label>
    <input type="number" value="<%=course.getCredit() %>" name="credits" class="form-control" id="pwd">
  </div>
  
  <div class="form-group ">
    <label for="pwd">Classroom:</label>
    <input type="text" value="<%=course.getClassroom() %>" name="classroom" class="form-control" id="pwd">
  </div>
  <input type="hidden" name="course_id" value="<%=course_id%>"/>
 
  <button type="submit" value="<%=action%>" class="btn btn-success "><span class="glyphicon glyphicon-plus"> </span> Register</button>
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
        <th>Classroom</th>
        <th>Credits</th>
      
      </tr>
    </thead>
    <tbody>
     
     <%
    
     List<Course> st = ss.getCourseList();
     int i = 1;
     for(Course al: st){
    	
     %>
      <tr>
      <td><%=i %></td>
        <td><%=al.getName() %></td>
        <td><%=al.getClassroom() %></td>
        <td><%=al.getCredit() %></td>
       <td><a href="Course.jsp?course_id=<%=al.getCourse_id()%>"> Edit </a></td>
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