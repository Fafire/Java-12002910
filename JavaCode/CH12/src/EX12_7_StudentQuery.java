import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;

public class EX12_7_StudentQuery extends JPanel implements ActionListener{
  Connection con;
  Statement sql;
  JTextField t1,t2,t3,t4,t5,t6;
  JButton b;
  Box baseBox,bv1,bv2;
  int flag=0;
  EX12_7_StudentQuery(){
   try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    }
   catch(ClassNotFoundException e){}
    try{
     con=DriverManager.getConnection("jdbc:odbc:student","","");
     sql=con.createStatement();
    }
    catch(SQLException ee){}
    
    setLayout(new BorderLayout());
    b=new JButton("��ѯ");
    b.setBackground(Color.orange);
    b.addActionListener(this);
    t1=new JTextField(8);
    t2=new JTextField(16);
    t3=new JTextField(16);
    t4=new JTextField(16);
    t5=new JTextField(16);
    t6=new JTextField(16);
    t2.setEditable(false);
    t3.setEditable(false);
    t4.setEditable(false);
    t5.setEditable(false);
    t6.setEditable(false);
    JPanel p1=new JPanel(),p2=new JPanel();
    p1.add(new Label("������ѧ�ţ�"));
    p1.add(t1);
    p1.add(b);
    bv1=Box.createVerticalBox();
   bv1.add(new JLabel("����"));
   bv1.add(Box.createVerticalStrut(8));
   bv1.add(new JLabel("�Ա�"));
   bv1.add(Box.createVerticalStrut(8));
   bv1.add(new JLabel("��ַ"));
   bv1.add(Box.createVerticalStrut(8));
   bv1.add(new JLabel("�绰"));
   bv1.add(Box.createVerticalStrut(8));
   bv1.add(new JLabel("רҵ"));
   bv1.add(Box.createVerticalStrut(8));
   bv2=Box.createVerticalBox();
   bv2.add(t2);
   bv2.add(Box.createVerticalStrut(8));
   bv2.add(t3);
   bv2.add(Box.createVerticalStrut(8));
   bv2.add(t4);
   bv2.add(Box.createVerticalStrut(8));
   bv2.add(t5);
   bv2.add(Box.createVerticalStrut(8));
   bv2.add(t6);
   bv2.add(Box.createVerticalStrut(8));
   baseBox=Box.createHorizontalBox();
   baseBox.add(bv1);
   baseBox.add(Box.createHorizontalStrut(10));
   baseBox.add(bv2);
   p2.add(baseBox);
   add(p1,"North");
   add(p2,"Center");
   setSize(350,300);
   setBackground(Color.white);
  }
  public void actionPerformed(ActionEvent e){
   flag=0;
   try{query();}
   catch(SQLException ee){}
  }
  public void query() throws SQLException{
   String num,name,gender,address,phone,major;
   con=DriverManager.getConnection("jdbc:odbc:student","","");
   num=t1.getText().trim();
   ResultSet rs=sql.executeQuery("SELECT * FROM student where id='"+num+"'");
   
   if(rs.next()){
    //num=rs.getString("ID");
    name=rs.getString("name");
    gender=rs.getString("gender");
    address=rs.getString("address");
    phone=rs.getString("phone");
    major=rs.getString("major");
    //if(num.equals(t1.getText().trim())){
     t2.setText(name);
     t3.setText(gender);
     t4.setText(address);
     t5.setText(phone);
     t6.setText(major);
     flag=1;
     //break;
    //}
   }else
   {
	    JOptionPane.showMessageDialog(this,"û�и�ѧ��!","��ʾ�Ի���",JOptionPane.INFORMATION_MESSAGE);
   }
   con.close();
   if(flag==0){t1.setText("û�и�ѧ��");}
  }
}