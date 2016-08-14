import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;

public class EX12_8_StudentUpdate extends JPanel implements ActionListener{
  Connection con;
  Statement sql;
  JButton b1,b2,b3;
  Box baseBox,bv1,bv2;
  JTextField t1,t2,t3,t4,t5,t6;
  EX12_8_StudentUpdate(){
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
    b1=new JButton("查找");
    b1.setBackground(Color.green);
    b2=new JButton("保存");
    b2.setBackground(Color.yellow);
    b3=new JButton("重置");
    b3.setBackground(Color.yellow);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    t1=new JTextField(8);
    t2=new JTextField(16);
    t3=new JTextField(16);
    t4=new JTextField(16);
    t5=new JTextField(16);
    t6=new JTextField(16);
    JPanel p1=new JPanel(),p2=new JPanel(),p3=new JPanel();
    p1.add(new JLabel("输入要修改学生的学号："));
    p1.add(t1);
    p1.add(b1);
    bv1=Box.createVerticalBox();
    bv1.add(new JLabel("姓名"));
    bv1.add(Box.createVerticalStrut(8));
    bv1.add(new JLabel("性别"));
    bv1.add(Box.createVerticalStrut(8));
    bv1.add(new JLabel("地址"));
    bv1.add(Box.createVerticalStrut(8));
    bv1.add(new JLabel("电话"));
    bv1.add(Box.createVerticalStrut(8));
    bv1.add(new JLabel("专业"));
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
    p3.add(b2);
    p3.add(b3);
    add(p1,"North");
    add(p2,"Center");
    add(p3,"South");
    setSize(350,300);
    setBackground(Color.cyan);
  }
  public void actionPerformed(ActionEvent e){
   if(e.getSource()==b1){
       try{
        String num,name,gender,address,phone,major;
           con=DriverManager.getConnection("jdbc:odbc:student","","");
           num=t1.getText().trim();
           ResultSet rs=sql.executeQuery("SELECT * FROM student where id='"+num+"'");
           if(rs.next()){
            //num=rs.getString("id");
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
             //break;
            //}
        }else{
            JOptionPane.showMessageDialog(this,"没有该学生!","提示对话框",JOptionPane.INFORMATION_MESSAGE);        	
        }
           
           con.close();
        }
        catch(SQLException ee){}
   }
   if(e.getSource()==b2){
    try{update();}
    catch(SQLException ee){}
   }
   if(e.getSource()==b3){
    t2.setText(" ");
    t3.setText(" ");
    t4.setText(" ");
    t5.setText(" ");
    t6.setText(" ");
   }
  }
  public void update() throws SQLException{
   String s1="'"+t1.getText().trim()+"'";
   String s2="'"+t2.getText().trim()+"'";
   String s3="'"+t3.getText().trim()+"'";
   String s4="'"+t4.getText().trim()+"'";
   String s5="'"+t5.getText().trim()+"'";
   String s6="'"+t6.getText().trim()+"'";
   String temp="UPDATE student SET name ="+s2+", gender="+s3+", address="+s4+", phone="+s5+", major="+s6+" WHERE id="+s1;
   con=DriverManager.getConnection("jdbc:odbc:student","","");
   sql.executeQuery(temp);
   JOptionPane.showMessageDialog(this,"修改成功!","提示对话框",JOptionPane.INFORMATION_MESSAGE);        	
   con.close();
  }
}