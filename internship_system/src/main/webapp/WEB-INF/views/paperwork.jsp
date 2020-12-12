<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp"%>
	<form:form action="/internship_system/paperwork.html" method="post">
		<table>
			<tr>
				<td>Placement ID:<FONT color="red"></FONT></td>
			</tr>
			<tr>
				<td><input type="text" name="placementID" value="${applicationID}"/></td>
			</tr>
			<tr>
				<td>Supervisor Email:<FONT color="red"/></FONT></td>
			</tr>
			<tr>
				<td><input type="text" name="supervisorEmail" /></td>
			</tr>
			<tr>
				<td>Notes:<FONT color="red"></FONT></td>
			</tr>
			<tr>
				<td><input type="text" name="notes" /></td>
			</tr>
			<tr>
				<td>Supervisor Evaluation:<FONT color="red"></FONT></td>
			</tr>
			<tr>
				<td><input type="text" name="supervisorEvaluation"/></td>
			</tr>
			<tr>
				<td>Company Info :<FONT color="red"></FONT></td>
			</tr>
			<tr>
				<td><input type="text" name="companyInfo" /></td>
			</tr>
			<tr>
				<td>Student Info :<FONT color="red"></FONT></td>
			</tr>
			<tr>
				<td><input type="text" name="studentInfo" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<%@include file="footer.jsp"%>
</body>
</html>