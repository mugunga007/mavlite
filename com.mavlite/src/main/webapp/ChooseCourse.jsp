
<!DOCTYPE HTML >

 <%@page import="testpac.StudentService"%> 
  <%@page import="testpac.Student"%>
   <%@page import="java.util.List"%>
        <%@page import="testpac.CourseService"%> 
  <%@page import="testpac.Course"%>
 
<html>
    <head>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  

<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

    </head>
    <body>

<jsp:include page="Header.jsp"></jsp:include>

<div class="container-fluid">

<div class="col-md-2">
</div>


<div class="col-md-8">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-user-plus fa-lg " style="color:green"></i>  Add a Student</div>
  <div class="panel-body">
  
 <%
 StudentService studentservice = new StudentService();
 Student student = new Student();
 

 String email = request.getAttribute("email").toString();
 student = studentservice.getStudentByEmail(email);
 %>
 
<p> Welcome <%=student.getFirstname()%> <%=student.getLastname() %>, Now you can choose Courses:</p>
  <form action="Test.jsp" method="get" class="col-md-8">
  <input type="hidden" name="student_id" value="<%=student.getStudent_id()%>"/>
  
  <% 
   CourseService ss = new CourseService();
     List<Course> st = ss.getCourseList();
     int i = 1;
     for(Course al: st){
    	 
    	 %>
     
  <div class="checkbox">
  <label><input name="course" type="checkbox" value="<%=al.getCourse_id()%>"><%=al.getName() %></label>
</div>
<%
     }
%>

  
  
  <button type="submit" class="btn btn-success "><span class="glyphicon glyphicon-plus"> </span> Register</button>
</form>
  
  </div>
</div>
</div>

<div class="col-md-2">


        </div>
        
        </div>
        
    </body>
<script   src="http://code.jquery.com/jquery-3.3.1.js"   integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="   crossorigin="anonymous"></script>  
  </html>
