<html>
<body>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
if(username.trim().equals("guest")&&password.trim().equals("123456"))
{%>
<jsp:forward page="EX13_6_hello.html" />
<%}
else
{%>
<jsp:forward page="EX13_6_sorry.html" />
<%}
%>
</body>
</html>
