  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
 <%@taglib uri="http://java.sun.com/jstl/xml" prefix="x" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<form class="form-horizontal" action = "Servlet_inscription" method ="post">
  <fieldset>
    <div id="legend">
      <legend class="">Avoir une place dans notre Store</legend>
      <h5 style="color:red;"><c:if test="${message ne 'NAT' }"> ${message}</c:if></h5>
      <h6 style="color:black;" align="center">Aprés l'inscription il faut attendre la validation de votre compte par l'admin </h6>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="username">NOM</label>
      <div class="controls">
        <input type="text" id="username" name="nom" placeholder="" class="input-xlarge">
        <p class="help-block">Nom peut contenir des lettre et des nombres sans espace</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="text">Type</label>
      <div class="controls">
       <select name="type" id="pet-select"><option value="client">client</option> <option value="vendeur">vendeur</option><option value="admin">admin</option></select>
        <p class="help-block">il faut choisir type de votre session</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
        <p class="help-block">inserer au moins 5 caractères pour votre password</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="password_confirm">Password (Confirm)</label>
      <div class="controls">
        <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge">
        <p class="help-block">Confirmer votre password</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
      
        <button class="btn btn-success">S'inscrire</button>
      </div>
    </div>
  </fieldset>
</form>
<form  action = "Servlet_first" method ="post">
<div class="form-group">

<input type ="submit" value ="go back" class="btn btn-primary"></input>
</div>
</form>
<h6 style="color:black;" align="center">For all complaints please contact our dev team @ ADAMING-CASA</h6>
</body>
</html>