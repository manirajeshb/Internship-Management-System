<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="/internship_system/account.html">
		<table>
			<tr>
				<td><h3>
						Welcome
						<c:out value="${user.userName}" />
					</h3></td>
				<td><input type="button" value="ACCOUNT DETAILS" /></td>

			</tr>
		</table>
	</form:form>
	<form:form method="post" action="/internship_system/logout.html">
		<table>
			<tr>

				<td><input type="submit" value="logout" /></td>

			</tr>
		</table>
	</form:form>-->
	 <%@include file="reports.jsp"%>


	<c:if test="${user.access_rights} == '14'">
		<%@ include file="adminFunction.jsp"%>
	</c:if>

</body>
</html>