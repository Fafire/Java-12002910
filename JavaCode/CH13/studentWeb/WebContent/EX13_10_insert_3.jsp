<%@page language="java" import="java.sql.*"%>
<%@page contentType="text/html;charset=gb2312"%>
<%
	request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>添加学生信息</title>
</head>
<body>

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



	<%
		String id = null;
		String name = null;
		String gender = null;
		String address = null;
		String phone = null;
		String major = null;

		id = request.getParameter("id");
		name = request.getParameter("name");
		gender = request.getParameter("gender");
		address = request.getParameter("address");
		phone = request.getParameter("phone");
		major = request.getParameter("major");
		String sql_1 = "INSERT into student2 (id,name,gender,address,phone,major) values('"
				+ id
				+ "','"
				+ name
				+ "','"
				+ gender
				+ "','"
				+ address
				+ "','" + phone + "','" + major + "')";

		stmt.executeUpdate(sql_1);
	%>
	
	<table width="100%"><tr>
	<td align="left"><img src="imgs/left.gif" /></td>
	<td align="center"><h2>添加学生信息</h2></td>
	<td align="right"><img src="imgs/right.gif" /></td>
	</tr>
	</table>
	
	<br>
	
	<center>
		<br> <font color="blue"><%=name%></font>的信息已添加到数据库!
		<form action="EX13_8_index.jsp" method="post">
			<input type="submit" id="back" name="back" value="返回">
		</form>
	 </center>
    <jsp:include page="EX13_13_copyright.html"></jsp:include>
</body>
</html>
