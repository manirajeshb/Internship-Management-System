<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome <c:out value="${loginForm.userName}" /></h3>
 <c:forEach var="internView" items="${internView}">  
    <tr>  
     <td>${internView.TITLE}</td>  
     <td>${internView.DESCRIPTION}</td>  
     <td>${internView.COMPANYNAME}</td>  
     <td>${internView.NOOFOPENINGS}</td>  
     <td>${internView.INDUSTRY}</td>  
     <td><a href="detials?id=${internView.DESCRIPTION}">Edit</a></td>  
   
    </tr>  
   </c:forEach>  
</body>
</html>