<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>	

<html>

<body>
<form:form action="processForm"  modelAttribute="student">

First Name :<form:input path="firstName"/>
<br><br>
Last Name :<form:input path="lastName"/>
<br><br>
	
	Country: 
	<form:select path="country">
		<form:options items="${student.countryOptions }"/>
		
		
	</form:select>
	
	Favorite language :
	Java <form:radiobutton path="favlang" value="JAVA"/>
	Python <form:radiobutton path="favlang" value="Python"/>
	C++ <form:radiobutton path="favlang" value="C++"/>
	Ruby <form:radiobutton path="favlang" value="Ruby"/>
	
	Operating Systems :
	Linux <form:checkbox path="os" value="Linux"/>
	Android <form:checkbox path="os" value="Android"/>
	Windows <form:checkbox path="os" value="Windows"/>
	Mac <form:checkbox path="os" value="Mac"/>
	<input type="submit" value="Submit">

</form:form>



</body>




</html>