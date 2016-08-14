<%@ page language="java" import="java.sql.*"%>
<%@ page contentType="text/html;charset=gb2312"%>
<html>
<head>
<title>学生信息管理系统</title>
</head>
<body>
	<center>
		<h1>
			<img src="imgs/2.jpg" width="63" height="59">学生信息管理系统
		</h1>
		<hr>
		<a href=" EX13_9_view.jsp">查询学生信息</a> 
		<a href=" EX13_10_insert_1.jsp">添加学生信息</a>
		<a	href=" EX13_11_modify_1.jsp">修改学生信息</a> 
		<a href=" EX13_12_delete_1.jsp">删除学生信息</a>
		<br>
		<hr>
		<img src="imgs/1.jpg" width="399" height="185"><br>
	</center>

	<br>
	<jsp:include page="EX13_13_copyright.html"></jsp:include>
</body>
</html>