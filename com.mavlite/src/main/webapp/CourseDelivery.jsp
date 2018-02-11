<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="testpac.CourseService"%> 
  <%@page import="testpac.Course"%>
   <%@page import="testpac.ProfessorService"%> 
  <%@page import="testpac.Professor"%>
     <%@page import="testpac.CourseDeliveryService"%> 
  <%@page import="testpac.CourseDelivery"%>
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

<div class="container-fluid">

<div class="col-md-4">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-book fa-lg " style="color:green"></i>  Add Course Delivery</div>
  <div class="panel-body">
  
 <%
 
 %>
  
  <form action="CourseDeliveryController" method="post" class="col-md-8">
  <div class="form-group">
    <label for="course_id" >Select Course:</label>
  <select name="course_id" class="form-control" id="course_id">
  
  <%
  CourseService ss = new CourseService();
  List<Course> st = ss.getCourseList();
  
  for(Course al: st){
  %>
    <option value="<%=al.getCourse_id() %>"><%=al.getName() %></option>
  <%
  }
  %>
  </select>
  </div>
  <div class="form-group ">
    <label for="professor_id" >Select Professor:</label>
  <select name="professor_id" class="form-control" id="professor_id">
  
  <%
  ProfessorService pros = new ProfessorService();
  List<Professor> prol = pros.getProfessorList();
  
  for(Professor pral: prol){
  %>
    <option value=<%=pral.getProfessor_id()%>> <%=pral.getName() %> </option>
  <%
  }
  %>
  </select>
  </div>
  <div class="form-group ">
    <label for="pwd">Time Slot:</label>
    <input type="text" name="timeSlot" class="form-control" id="pwd">
  </div>
  
 
  <button type="submit" class="btn btn-success "><span class="glyphicon glyphicon-edit"> </span> Update</button>
</form>
  
  </div>
</div>
</div>
<div class="col-md-8">

<div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-book fa-lg " style="color:green"></i> Courses Information</div>
  <div class="panel-body">

        
  <table class="table table-hover">
    <thead>
      <tr>
      <th>No</th>
        <th>Course</th>
        <th>Professor</th>
        <th>TimeSlot</th>
       
      </tr>
    </thead>
    <tbody>
     
     <%
     CourseService courseservice = new CourseService();
     ProfessorService professor = new ProfessorService();
     CourseDeliveryService ssd = new CourseDeliveryService();
     List<CourseDelivery> std = ssd.getCourseDeliveryList();
     int i = 1;
     for(CourseDelivery adl: std){
    	
     %>
      <tr>
      <td><%=i %></td>
        <td><%=courseservice.getCourseById(adl.getCourse_id()).getName()%></td>
        
        <td><%=professor.getProfessorById(adl.getProfessor_id()).getName() %></td>
        <td><%=adl.getTimeSlot() %></td>
      
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