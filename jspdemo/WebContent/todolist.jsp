<%@page import="javax.websocket.Session"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="todolist.jsp">
Enter  : <input type="text" name="item">
<button type="submit"></button>
</form>
------

<%

List<String> thelist = (List<String>) session.getAttribute("items");

if(thelist==null){

	ArrayList<String> thelist = new ArrayList<String>();

	session.setAttribute("items", thelist);

}
String s = request.getParameter("item");
if(s!=null){
		thelist.add(s);
			
	}
	




%>
to do list :
<ol>
<%
for(String dis : thelist){
	out.println("<li>"+dis+"</li>");
}


%> 

</ol>


</body>
</html>