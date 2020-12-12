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
				<td>Partner Companies</td>
			</tr>
			<tr>
				<td>Company Name</td>
				<td>Address</td>
				<td>Cell</td>
				<td>Industry</td>
				<td>Email</td>
				<td>Title</td>
				<td>Description</td>

				<td>No Of Openings</td>



			</tr>

			<c:forEach var="companiesView" items="${companiesView}"
				varStatus="status">
				<tr>
					<td>${companiesView.companyName}</td>
					<td>${companiesView.address}</td>
					<td>${companiesView.cell}</td>
					<td>${companiesView.industry}</td>
					<td>${companiesView.email}</td>
					<td>${companiesView.title}</td>
					<td>${companiesView.description}</td>

					<td>${companiesView.noOfOpenings}</td>


				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>