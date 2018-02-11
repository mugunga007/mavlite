
<!DOCTYPE HTML >

 <%@page import="testpac.StudentService"%> 
  <%@page import="testpac.Student"%>
  <%@page import="testpac.ProfessorService"%> 
  <%@page import="testpac.Professor"%>
   <%@page import="java.util.List"%>
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
  <div class="panel-heading"> <i class="fas fa-user-plus fa-lg " style="color:green"></i>  Register</div>
  <div class="panel-body">
  
 
  
  <form action="StudentController" method="post" class="col-md-8">
  <div class="form-group">
    <label for="username">Firstname:</label>
    <input type="text" name="firstname" class="form-control" id="email">
  </div>
  <div class="form-group ">
    <label for="pwd">Lastname:</label>
    <input type="text" name="lastname" class="form-control" id="pwd">
  </div>
  
  <div class="form-group ">
    <label for="pwd">Email:</label>
    <input type="text" name="email" class="form-control" id="pwd">
  </div>
  
   <div class="form-group ">
    <label for="professor_id" >Select Supervisor:</label>
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
