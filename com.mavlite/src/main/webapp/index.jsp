
<!DOCTYPE HTML >

<html>
    <head>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

    </head>
    <body>
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
      
     <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="...">
      </a>
    </div>
  </div>
  
  
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     
     
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container-fluid">
<div class="col-md-2">
</div>
<div class="col-md-8">
  <div class="panel panel-default">
  <div class="panel-heading"> <i class="fas fa-user-plus fa-lg " style="color:green"></i>  Add a Student</div>
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
    <label for="pwd">Faculty:</label>
    <input type="text" name="faculty" class="form-control" id="pwd">
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
