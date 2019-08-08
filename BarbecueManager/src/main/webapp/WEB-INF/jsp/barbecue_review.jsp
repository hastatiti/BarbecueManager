<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Barbecue Review</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<h2>Send e-mail, edit or save</h2>

			<div class="form-group">
				<label for="project-name">Name</label> <span>${barbecue.name}</span>
			</div>
			<div class="form-group">
				<label for="project-name">Authorized Funds</label> <span>${barbecue.authorizedFunds}</span>
			</div>
			<div class="form-group">
				<label for="project-name">Authorized Hours</label> <span>${barbecue.authorizedHours}</span>
			</div>
			<div class="form-group">
				<label for="project-name">Description</label> <span>${barbecue.description}</span>
			</div>
			<a href="<spring:url value="/barbecue/add"/>" class="btn btn-default">Edit</a>
			<a href="<spring:url value="/email/emailForm"/>" class="btn btn-default">Send E-mail</a>
		</div>
	</div>
</body>
</html>