<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>

</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
</head>
<body>
	<h3>Login Form</h3>
	<FONT color="blue"> Enter username and password </FONT>
	<form:form action="/internship_system/loginform.html" method="post">
		<table>
			<tr>
				<td>User Name:<FONT color="red"></FONT></td>
			</tr>
			<tr>
				<td><c:if
						test="${userName!=null} && ${userName=='invaliduser'}">
						<c:out value="invaliduser"></c:out>

					</c:if> <input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Password:<FONT color="red"></FONT></td>
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