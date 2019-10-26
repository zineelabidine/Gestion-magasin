
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
<c:set var="total" value="${0}"/>
<c:set var="article" value="${0}"/>
 <table class="table"><tr>
<th>id</th>
<th>nom</th>
<th>prix</th>
</tr>

<c:forEach items="${facture}" var="l">
<tr>
<td>${l.id}</td>
<td>${l.nom}</td>
<td>${l.prix}</td>
<td><a href=Servlet_suprimer_facture?id=${l.id}&id_user=${id_user}> suprimer </a></td>
<c:set var="article" value="${article + 1}"/>
  <c:set var="total" value="${total + l.prix}" />
</tr>
</c:forEach>
</table>
<h5> récapitulatif du votre facture de notre client: <strong> <c:out value="${nom_user}" /> </strong></h5>
<h5>-------------------------------------------------</h5>
<h5>montant totale est :<strong> <c:out value="${total}" /> </h5>
<h5>-------------------------------------------------</h5>
<h5>nombre des articles totale :<strong> <c:out value="${article}" /></strong></h5>
<h5>-------------------------------------------------</h5>
<form  action = "Servlet_first" method ="post">
<div class="form-group">
<input type ="submit" value ="go back" class="btn btn-primary"></input>
</div>
</form>
<h6>Pour toutes réclamation merci de contacter notre équipe dev @ADAMING-CASA</h6>
</body>
</html>