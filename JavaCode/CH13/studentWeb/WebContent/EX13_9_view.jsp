<%@page language="java" import="java.sql.*"%>
<%@page contentType="text/html;charset=gb2312"%>
<%
	request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>��ѯѧ����Ϣ</title>
</head>
<body>

	<table width="100%"><tr>
	<td align="left"><img src="imgs/left.gif" /></td>
	<td align="center"><h2>��ѯѧ����Ϣ</h2></td>
	<td align="right"><img src="imgs/right.gif" /></td>
	</tr>
	</table>
	
	<br>

	<%
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		//������������  
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
		}

		//�������ݿ�����
		try {
			con = DriverManager.getConnection("jdbc:odbc:student", "", "");
			stmt = con.createStatement();
		} catch (SQLException ee) {
		}
	%>
	
	<center>
	<table width="100%" border="1">
	<tr><th>ѧ��</th><th>����</th><th>�Ա�</th><th>��ַ</th><th>�绰</th><th>רҵ</th></tr>
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
		<input type="submit" name="back" value="����">
	</form>	
    </center>
    <jsp:include page="EX13_13_copyright.html"></jsp:include>
</body>
</html>