<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%@include file="header.jsp"%>
	<table>
		<tbody>
			<tr>
				<td>Placement View</td>
			</tr>
			<tr>

				<td>Student Name</td>
				<td>Company Name</td>
				<td>Supervisor Name</td>
				<td>Notes</td>




			</tr>

			<c:forEach var="placementview" items="${placementview}"
				varStatus="status">
				<tr>
					<td>${placementview.studentName}</td>
					<td>${placementview.companyName}</td>
					<td>${placementview.supervisorName}</td>
					<td>${placementview.notes}</td>



				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>