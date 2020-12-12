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
		<tr>
			<td>applicationID</td>
			<td>studentID</td>
			<td>internshipID</td>
			<td>Status</td>
		</tr>
		<tr>
			<td><c:forEach var="pending" items="${pending}"
					varStatus="status">

					<tr>
						<td>${pending.applicationID}</td>
						<td>${pending.studentID}</td>
						<td>${pending.internshipID}</td>

						<td><form:form
								action="/internship_system/editApplication.html/${pending.applicationID}"
								method="post">
								<form:select path="Status">
									<option value="12">Pending</option>
									<option value="10">Hired</option>
									<option value="11">Not Hired</option>

								</form:select>
							</form:form></td>


					</tr>
				</c:forEach>
			<td>
		</tr>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>