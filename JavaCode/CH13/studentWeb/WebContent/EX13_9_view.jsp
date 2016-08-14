<%@page language="java" import="java.sql.*"%>
<%@page contentType="text/html;charset=gb2312"%>
<%
	request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>查询学生信息</title>
</head>
<body>

	<table width="100%"><tr>
	<td align="left"><img src="imgs/left.gif" /></td>
	<td align="center"><h2>查询学生信息</h2></td>
	<td align="right"><img src="imgs/right.gif" /></td>
	</tr>
	</table>
	
	<br>

	<%
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		//加载驱动程序  
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
		}

		//建立数据库连接
		try {
			con = DriverManager.getConnection("jdbc:odbc:student", "", "");
			stmt = con.createStatement();
		} catch (SQLException ee) {
		}
	%>
	
	<center>
	<table width="100%" border="1">
	<tr><th>学号</th><th>姓名</th><th>性别</th><th>地址</th><th>电话</th><th>专业</th></tr>
	<%
		rs = stmt.executeQuery("select * from student2");
		while (rs.next()) {
	%>
	    <tr>
		<td><%=rs.getString("id")%></td>
		<td><%=rs.getString("name")%></td>
		<td><%=rs.getString("gender")%></td>
		<td><%=rs.getString("address")%></td>
		<td><%=rs.getString("phone")%></td>
		<td><%=rs.getString("major")%></td>
	    </tr>		
	<%
		}
	%>
	</table>
  <form action="EX13_8_index.jsp" method="post">
		<input type="submit" name="back" value="返回">
	</form>	
    </center>
    <jsp:include page="EX13_13_copyright.html"></jsp:include>
</body>
</html>