<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<form:form method="post" action="/internship_system/submitHome.html">
		<table>
			<tr>
				<td><input type="submit" value="Redirect Page" /></td>
			</tr>
		</table>
	</form:form>



</body>
</html>
