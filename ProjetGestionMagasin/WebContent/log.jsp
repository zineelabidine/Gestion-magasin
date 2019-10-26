
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
 <%@taglib uri="http://java.sun.com/jstl/xml" prefix="x" %>
<!------ Include the above in your HEAD tag ---------->
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<title>Welcome</title>

   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="styles.css">
	<style>

@import url('https://fonts.googleapis.com/css?family=Numans');

html,body{
background-image: url('https://images.unsplash.com/photo-1516477027317-1837e0f67162?ixlib=rb-1.2.1&auto=format&fit=crop&w=1447&q=80');
background-size: cover;
background-repeat: no-repeat;
height: 100%;
font-family: 'Numans', sans-serif;
}

.container{
height: 100%;
align-content: center;
}

.card{
height: 370px;
margin-top: auto;
margin-bottom: auto;
width: 400px;
background-color: rgba(0,0,0,0.5) !important;
}

.social_icon span{
font-size: 60px;
margin-left: 10px;
color: #FFC312;
}

.social_icon span:hover{
color: white;
cursor: pointer;
}

.card-header h3{
color: white;
}

.social_icon{
position: absolute;
right: 20px;
top: -45px;
}

.input-group-prepend span{
width: 50px;
background-color: #FFC312;
color: black;
border:0 !important;
}

input:focus{
outline: 0 0 0 0  !important;
box-shadow: 0 0 0 0 !important;

}

.remember{
color: white;
}

.remember input
{
width: 20px;
height: 20px;
margin-left: 15px;
margin-right: 5px;
}

.login_btn{
color: black;
background-color: #FFC312;
width: 100px;
}

.login_btn:hover{
color: black;
background-color: white;
}

.links{
color: white;
}

.links a{
margin-left: 4px;
}
</style>
</head>
<body>

<div class="container">
<h3 align="center" style="color:white;">Welcome to <strong>Shopytech</strong></h3>
<h6 align="center" style="color:white;">This is the <mark><strong>Beta version 1.2</strong></mark> of a JAVA / JEE project for creating a store management web application</h6>
	<div class="d-flex justify-content-center h-100">
		
		<div class="card">
		
			<div class="card-header">
<!-- 				<h3>Sign In</h3> -->
				<h3 align="center">Bonjour dans votre session d'authontification</h3>
			
				<div class="d-flex justify-content-end social_icon">
					<span><i  class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
				<form action = "Servlet_login" method ="post">

<h5 style="color:red;"><c:if test="${message ne 'NAT' }"> ${message}</c:if></h5>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="username" name="nom">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password" name="pass">
					</div>
					<div class="form-group" align="center">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form></br>
				<form action = "inscription.jsp" >
				<div class="form-group" align="center">
						<input type="submit" value="s'inscrir" class="btn float-right login_btn">
					</div>
				</form>
				
			</div>
<h6 style="color:white;" align="center">For all complaints please contact our dev team @ ADAMING-CASA</h6>
		</div>
	</div>
</div>
</body>
</html>