import java.sql.*;

public class EX12_3_StudentSQL {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String strTemp = "";
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
		}
		try {
			con = DriverManager.getConnection("jdbc:odbc:student", "", "");
			stmt = con.createStatement();
		} catch (SQLException ee) {
		}

		strTemp = "CREATE TABLE student(id TEXT(20) PRIMARY KEY,name TEXT(20),gender TEXT(2),address TEXT(50),phone TEXT(20),major TEXT(30))";
		try {
			stmt.executeUpdate(strTemp);
			System.out.println("数据库表建立成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
