<%@page language="java" import="java.sql.*"%>
<%@page contentType="text/html;charset=gb2312"%>
<%
	request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>���ѧ����Ϣ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body>

	<table width="100%"><tr>
	<td align="left"><img src="imgs/left.gif" /></td>
	<td align="center"><h2>���ѧ����Ϣ</h2></td>
	<td align="right"><img src="imgs/right.gif" /></td>
	</tr>
	</table>
	
	<br>

	<center>
		<form action="EX13_10_insert_3.jsp" method="post">
			<p>
				ѧ��: <input type="text" id="id" name="id">
			<p>
				����: <input type="text" id="name" name="name">
			<p>
				�Ա�: <input type="text" id="gender" name="gender">
			<p>
				��ַ: <input type="text" id="address" name="address">
			<p>
				�绰: <input type="text" id="phone" name="phone">
			<p>
				רҵ: <input type="text" id="major" name="major">
			<p>
				<input type="submit" id="confirm" name="confirm" value="ȷ��">&nbsp;&nbsp;
				<input type="reset" id="reinput" name="reinput" value="��д">&nbsp;&nbsp;
				<input type="button" id="reset" name="reset" value="����"
					onclick="javascript:history.go(-1)">
			</p>
		</form>
	</center>
    <jsp:include page="EX13_13_copyright.html"></jsp:include>
</body>
</html>