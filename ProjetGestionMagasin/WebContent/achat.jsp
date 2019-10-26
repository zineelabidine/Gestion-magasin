  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
 <%@taglib uri="http://java.sun.com/jstl/xml" prefix="x" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<h1>Bonjour <mark>${nom_user}</mark> Dans votre session pour <mark>Achter des produits</mark></h1>

<jsp:directive.include file = "liste_achat.jsp" />


<form  action = "Servlet_first" method ="post">
<div class="form-group">
<input type ="submit" value ="go back" class="btn btn-primary"></input>
</div>
</form>
</body>
</html>