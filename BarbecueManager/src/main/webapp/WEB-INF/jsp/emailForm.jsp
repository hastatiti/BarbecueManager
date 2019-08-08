<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Email Form</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
		
			<spring:url value="/email/sendEmail" var="formUrl" />
			<form:form action="${formUrl}" method="POST" modelAttribute="email">
				
				<div class="form-group">
					<label for="recipient-name">recipient</label>
					<form:input id="recipient-name" cssClass="form-control" path="recipient"/>
				</div>	
				<div class="form-group">
					<label for="subject-name">subject</label>
					<form:input id="subject-name" cssClass="form-control" path="subject"/>
				</div>				
				<div class="form-group">
					<label for="message-name">message</label>
					<form:textarea cssClass="form-control" path="message" rows="3"></form:textarea>
				</div>
				<button type="submit" class="btn btn-default">Send e-mail</button>
				</form:form>
	</div>
		
	</div>
</body>
</html>