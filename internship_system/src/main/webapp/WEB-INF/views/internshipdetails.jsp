<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<table>
		<tbody>
			<tr>
				<td><b><u>Complete Details</u></b></td>
			</tr>
			<c:if test="${user.isStudent}">
				<tr>
					<td><b><u>Click Apply to be considered for Job
								Position</u></b></td>
				</tr>
			</c:if>
			<tr>
				<td><c:out value="${internshipDetail}" /></td>
			</tr>
			<tr>
				<c:if test="${user.isStudent}">
					<c:if test="${msg!='Applied'}">
						<td><form:form method="post"
								action="/internship_system/apply.html" param="${internshipID}">
								<table>
									<tr>
										<td><input type="submit" value="Apply" /></td>
									</tr>
								</table>
							</form:form></td>
					</c:if>
				</c:if>
			</tr>
		</tbody>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>