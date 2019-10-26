 <%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
 <%@taglib uri="http://java.sun.com/jstl/xml" prefix="x" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
<table class="table"><tr>
<th>id</th>
<th>nom</th>
<th>pass</th>
<th>type</th>
<th>etat</th>
</tr>

<c:forEach items="${liste_user}" var="l">
<tr>
<td>${l.id}</td>
<td>${l.nom}</td>
<td>**hidden**</td>
<td>${l.type}</td>
<td>${l.etat}</td>
<td><a href=Servlet_suprimer_user?id=${l.id}> suprimer </a></td>
</tr>
</c:forEach>
</table>


</body>
</html>