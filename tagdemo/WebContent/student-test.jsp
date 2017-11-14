<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.luv.jsp.tagdemo.Student,java.util.*"%>

<%

List<Student> data = new ArrayList<Student>();

data.add(new Student("ram","prasad",false));
data.add(new Student("ram","prasad",false));
data.add(new Student("ram","prasad",false));

pageContext.setAttribute("studentlist", data);

%>


<html>
<body>
<table border="1">
<tr>
	<th>first name</th>
	<th>last name</th>
	<th>customer</th>
	
</tr>
<tr>
	<th>first name</th>
	<th>last name</th>
	<th>customer</th>
	
</tr>


<c:forEach var="tempStudent" items="${studentlist}">
<tr>


	<td>${tempStudent.firstname}</td>
	<td>${tempStudent.lastname}</td>
	<td>${tempStudent.goldcustomer}</td>
</tr>
</c:forEach>


</table>







</body>

</html>