<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@page import="java.util.List"%>
        <%@page import="testpac.AttendanceService"%> 
         <%@page import="testpac.Attendance"%>
     <%@page import="testpac.CourseService"%>  
       <%@page import="testpac.CourseDeliveryService"%> 
         <%@page import="testpac.CourseDelivery"%> 
               <%@page import="testpac.StudentService"%> 
                <%@page import="testpac.Professor"%> 
               <%@page import="testpac.ProfessorService"%> 
  <%@page import="testpac.Course"%>
  <%@page import="testpac.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  

<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
<%
Professor professor = new Professor();
ProfessorService professorservice = new ProfessorService();
CourseDelivery coursedelivery = new CourseDelivery();
CourseDeliveryService coursedeliveryservice = new CourseDeliveryService();
Course coursecl = new Course();
Student student = new Student();
int st = Integer.parseInt(request.getParameter("student_id"));
StudentService studentservice = new StudentService();


student = studentservice.getStudentById(st);
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
CourseService courseservice = new CourseService();

AttendanceService at = new AttendanceService();

student = studentservice.getStudentById(st);
String course[]= request.getParameterValues("course");
if(course != null)
{

for(int i=0; i<course.length; i++)
{

at.insert(Integer.parseInt(course[i].toString()), st);
}
}
%>


<%
List<Attendance> ali = at.getStudentAttendance(Integer.parseInt(student.getStudent_id()));



%>
<jsp:include page="Header.jsp"></jsp:include>
<div class="col-md-2">
</div>
<div class="col-md-8">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-user-plus fa-lg " style="color:green"></i>  Add a Student</div>
  <div class="panel-body">
 <h2>Confirmation</h2>
  
  <p>Firstname: <%=student.getFirstname() %> </p>    
   <p>Lastname: <%=student.getLastname() %> </p>    
    <p>Email: <%=student.getEmail() %> </p>  
        
        
  <table class="table table-hover">
    <thead>
      <tr>
     
        <th>Course Name</th>
        <th>Classroom</th>
        <th>Credits</th>
     
      </tr>
    </thead>
    <tbody>
     
     <% 
for(Attendance aa:ali){
	
	// coursedelivery = coursedeliveryservice.getCourseDeliveryByCourseId(1);
//	professor = professorservice.getProfessorById(coursedelivery.getProfessor_id());
%>



      <tr>
      <td><%=courseservice.getCourseById(aa.getCourse_id()).getName() %> </td>
        <td><%=courseservice.getCourseById(aa.getCourse_id()).getClassroom() %></td>
        <td><%=courseservice.getCourseById(aa.getCourse_id()).getCredit() %></td>
       
      
        <td><a href="#">Edit</></td>
      </tr>
      <%
     
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