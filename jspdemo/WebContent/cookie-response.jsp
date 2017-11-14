<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String data = request.getParameter("fevlang");
Cookie thecookie = new Cookie("myapp.fevlang",data);
thecookie.setMaxAge(60*60*24*365);
response.addCookie(thecookie);

%>

Thanks for setting ${param.fevlang}
<a href="cookie-home.jsp">revisit to home page</a>

</body>
</html>