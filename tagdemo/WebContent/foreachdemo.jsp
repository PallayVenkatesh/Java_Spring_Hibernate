<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<body>
<%

String[] cities = {"mumbai","singapore","hyd"};

pageContext.setAttribute("mylist", cities);

%>

<c:forEach var="temp" items="${mylist}">

${temp} </br>

</c:forEach>



</body>

</html>