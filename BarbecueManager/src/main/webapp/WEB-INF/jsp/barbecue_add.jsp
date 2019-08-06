<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Barbecue Manager</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container">
				<div class="row">
		
			<spring:url value="/barbecue/save" var="formUrl" />
			<form:form action="${formUrl}" method="POST" modelAttribute="barbecue">
				<div class="form-group">
					<label for="barbecue-name">Name</label>
					<form:input id="barbecue-name" cssClass="form-control" path="name"/>
				</div>
				
				<div class="form-group">
					<label for="funds">Authorized Funds</label>
					<form:input id="funds" cssClass="form-control" path="authorizedFunds"/>
				</div>
			
				<div class="form-group">
					<label for="hours">Authorized Hours</label>
					<form:input id="hours" cssClass="form-control" path="authorizedHours"/>
				</div>
			
				<div class="form-group">
					<label for="project-name">Description</label>
					<form:textarea cssClass="form-control" path="description" rows="3"></form:textarea>
				</div>
				
				<button type="submit" class="btn btn-default">Save and send e-mail</button>
				</form:form>
	</div>
	</div>
</body>
</html>