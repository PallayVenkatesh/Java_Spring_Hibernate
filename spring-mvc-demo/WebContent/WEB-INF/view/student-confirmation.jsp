<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>	

<html>

<body>
 
 	The Student Confirmed : ${student.firstName} ${student.lastName}
	
	<br>
	${student.firstName} ${student.lastName} Country is : ${student.country}
	<br>
	${student.firstName} ${student.lastName} Fev Lang is : ${student.favlang}
	<br>
	
	Operating Systems :
	<ul>
	
		<c:forEach	 var="temp" items="${student.os}">
		
		<li>${temp}</li>
		</c:forEach>
	</ul>
	

</body>




</html>