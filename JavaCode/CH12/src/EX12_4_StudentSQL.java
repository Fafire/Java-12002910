import java.sql.*;
/**
 * @author gaobaolu
 * @version 2012 v1.0
 * JDBC数据库访问测试程序。 
 */
public class EX12_4_StudentSQL {
	public static void main(String[] args) {

		  Connection con=null;
		  Statement stmt=null;
		  ResultSet rs = null;
		  String strTemp = "";
		
		//加载驱动程序  
		try{
			    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			    }
		catch(ClassNotFoundException e){}
		
		//建立数据库连接
		try{
			     con=DriverManager.getConnection("jdbc:odbc:student","","");
			     stmt=con.createStatement();
		}catch(SQLException ee){}
		
		//建立表
		strTemp = "create table student(id varchar(20),name varchar(20),gender varchar(2),address varchar(50),phone varchar(20),major varchar(30))";
		try {
			stmt.executeUpdate(strTemp);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
        
		//添加数据
		strTemp = "insert into student values('2012001','张三','男','太原市迎泽西大街79号','13803511208','软件工程')";
		try {
			stmt.executeUpdate(strTemp);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
        
		//获取并浏览数据
		strTemp = "select * from student";		
		try {
			rs = stmt.executeQuery(strTemp);
			while(rs.next())
			{
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("gender"));
				System.out.println(rs.getString("address"));
				System.out.println(rs.getString("phone"));
				System.out.println(rs.getString("major"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		//释放资源
        try {
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}

}
