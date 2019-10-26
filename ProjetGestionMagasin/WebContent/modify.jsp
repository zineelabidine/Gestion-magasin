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
<form  action = "Servlet_modify" method ="get">
<div class="form-group">
    <input type ="text" placeholder = "enter id" name="id" class="input-group-text"></input>
    <input type ="text" placeholder = "enter nom" name="nom" class="input-group-text"></input>
    <input type="text" placeholder = "enter prix" name="prix" class="input-group-text"></input>
    <input type ="submit" value ="Modify" class="btn btn-primary"></input>
</div>
</form>


</body>
</html>