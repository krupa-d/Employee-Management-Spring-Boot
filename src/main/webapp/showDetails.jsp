<jsp:include page="header.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>LIST OS EMPLOYEES</h2>
<table>
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>dob</th>
		<th>Salary</th>
	</tr>
	<c:forEach items="${emp}" var="empl">
	<tr>
 		<td>${empl.empId}</td>
 		<td>${empl.empName}</td>
 		<td>${empl.dob}</td>
 		<td>${empl.salary}</td>
 	</tr>
 	</c:forEach>
</table>
</body>
</html>