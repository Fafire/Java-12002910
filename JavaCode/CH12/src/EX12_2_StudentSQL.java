
import java.sql.*;
public class EX12_2_StudentSQL {
	public static void main(String[] args) {
        Connection con=null;
 		Statement stmt=null;
 		String strTemp = "";
 		try{
 			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 			System.out.println("�������سɹ���");
 			}
 		catch(ClassNotFoundException e){
 			System.out.println("��������ʧ�ܣ�");
 			}
 		try{
		     con=DriverManager.getConnection("jdbc:odbc:student","","");
		     stmt=con.createStatement();
		     System.out.println("���ݿ����ӳɹ���");
	     }catch(SQLException ee){
	    	 System.out.println("���ݿ�����ʧ�ܣ�");
	     }	 		
	}
}