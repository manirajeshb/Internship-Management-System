<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp"%>
	<form:form method="post" action="/internship_system/reports.html">
		<table>
			<tr>
				<td><input type="button" name="placement"
					value="FALL PLACEMENT" /></td>
				<td><input type="button" name="companies"
					value="PARTNER COMPANIES" /></td>

			</tr>
		</table>
	</form:form>
	<%@include file="footer.jsp"%>
</body>
</html>