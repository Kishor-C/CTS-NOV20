<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>This is welcome page</h2>
	<hr />
	<h3>Title: ${model.title}</h3>
	<hr />
	<h3>Employee Information</h3>
	${model.employeeObject}
	<hr />
	
</body>
</html>