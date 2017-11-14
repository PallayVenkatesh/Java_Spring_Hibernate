<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import ="com.demo.kid.kid" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3> string to upper : <%= new String("venky").toUpperCase() %></h3>
<h2> <i>25 x 3 = <%= 25*3 %></i></h2>
<h1> boolean<%=65>55 %></h1>

<i><%
for(int i=1;i<5;i++){
	out.println("venky");
}

%></i>
<i><%!

public String tohigh(String s){
	return s.toUpperCase();
}

%></i>
<%! String s="Hello" ;%>
<h1>Hello in upper case is <%= funn() %></h1>
</body>
</html>