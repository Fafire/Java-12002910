import java.sql.*;
/**
 * @author gaobaolu
 * @version 2012 v1.0
 * JDBC���ݿ���ʲ��Գ��� 
 */
public class EX12_4_StudentSQL {
	public static void main(String[] args) {

		  Connection con=null;
		  Statement stmt=null;
		  ResultSet rs = null;
		  String strTemp = "";
		
		//������������  
		try{
			    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			    }
		catch(ClassNotFoundException e){}
		
		//�������ݿ�����
		try{
			     con=DriverManager.getConnection("jdbc:odbc:student","","");
			     stmt=con.createStatement();
		}catch(SQLException ee){}
		
		//������
		strTemp = "create table student(id varchar(20),name varchar(20),gender varchar(2),address varchar(50),phone varchar(20),major varchar(30))";
		try {
			stmt.executeUpdate(strTemp);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
        
		//�������
		strTemp = "insert into student values('2012001','����','��','̫ԭ��ӭ�������79��','13803511208','�������')";
		try {
			stmt.executeUpdate(strTemp);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
        
		//��ȡ���������
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
		
		//�ͷ���Դ
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
