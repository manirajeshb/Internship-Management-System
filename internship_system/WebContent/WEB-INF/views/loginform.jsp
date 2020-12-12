<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 Example</title>
</head>
<body>
<h3>Login Form</h3>
<FONT color="blue">
User Name="UserName" and password="password"
</FONT>
<form:form action="/internship_system/loginform.html" method="post">
	<table>
		<tr>
			<td>User Name:<FONT color="red"></FONT></td>
		</tr>
		<tr>
			<td><input type="text" name="userName" /></td>
		</tr>
		<tr>
			<td>Password:<FONT color="red"/></td>
		</tr>
		<tr>
			<td><input type="text" name="password" /></td>
		</tr>
		<tr>
		
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>