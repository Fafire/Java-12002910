
import java.sql.*;
public class EX12_2_StudentSQL {
	public static void main(String[] args) {
        Connection con=null;
 		Statement stmt=null;
 		String strTemp = "";
 		try{
 			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 			System.out.println("驱动加载成功！");
 			}
 		catch(ClassNotFoundException e){
 			System.out.println("驱动加载失败！");
 			}
 		try{
		     con=DriverManager.getConnection("jdbc:odbc:student","","");
		     stmt=con.createStatement();
		     System.out.println("数据库连接成功！");
	     }catch(SQLException ee){
	    	 System.out.println("数据库连接失败！");
	     }	 		
	}
}