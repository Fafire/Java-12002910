<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>声明测试</title>
</head>
<body>
<%!  int count=0; %>
<%
    //将count的值输出后再加1
    out.println(count++);
%>
<br>
</body>
</html>