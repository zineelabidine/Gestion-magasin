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
 <link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
integrity="sha384-
BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
crossorigin="anonymous">
<link rel="stylesheet"

href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-
theme.min.css" integrity="sha384-

rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
integrity="sha384-
Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
crossorigin="anonymous"></script>
</head>
<body>
<form  action = "Servlet_ajouter" method ="post">
<div class="form-group">
    <input type ="text" placeholder = "enter nom" name="nom" class="input-group-text"></input>
    <input type="text" placeholder = "enter prix" name="prix" class="input-group-text"></input>
    <input type ="submit" value ="submit" class="btn btn-primary"></input>
</div>
</form>


<jsp:directive.include file = "modify.jsp" />

<%@ include file="affichage.jsp" %>

<form  action = "Servlet_first" method ="post">
<div class="form-group">
<input type ="submit" value ="go back" class="btn btn-primary"></input>
</div>
</form>
<h6>Pour toutes r�clamation merci de contacter notre �quipe dev @ADAMING-CASA</h6>
</body>
</html>