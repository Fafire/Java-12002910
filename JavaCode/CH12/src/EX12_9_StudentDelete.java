import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;

public class EX12_9_StudentDelete extends JPanel implements ActionListener {
	Connection con;
	Statement sql;
	JTextField t1, t2, t3, t4, t5, t6;
	JButton b;
	Box baseBox, bv1, bv2;

	EX12_9_StudentDelete() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
		}
		try {
			con = DriverManager.getConnection("jdbc:odbc:student", "", "");
			sql = con.createStatement();
		} catch (SQLException ee) {
		}
		setLayout(new BorderLayout());
		b = new JButton("删除");
		b.setBackground(Color.cyan);
		b.addActionListener(this);
		t1 = new JTextField(8);
		t1.addActionListener(this);
		t2 = new JTextField(16);
		t3 = new JTextField(16);
		t4 = new JTextField(16);
		t5 = new JTextField(16);
		t6 = new JTextField(16);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		JPanel p1 = new JPanel(), p2 = new JPanel();
		p1.add(new JLabel("输入要删除学生的学号"));
		p1.add(t1);
		p1.add(b);
		bv1 = Box.createVerticalBox();
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
		bv2 = Box.createVerticalBox();
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
		baseBox = Box.createHorizontalBox();
		baseBox.add(bv1);
		baseBox.add(Box.createHorizontalStrut(10));
		baseBox.add(bv2);
		p2.add(baseBox);
		add(p1, "North");
		add(p2, "Center");
		setSize(350,300);
		setBackground(Color.LIGHT_GRAY);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == t1) {
			try {
				delete();
			} catch (SQLException ee) {
			}
		} else if (e.getSource() == b) {
			
			try {
				delete();
			} catch (SQLException ee) {
			}
			
			int n = JOptionPane.showConfirmDialog(this, "确定要删除该学生的全部信息吗?",
					"确定", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				try {
					String s1 = "'" + t1.getText().trim() + "'";
					String temp = "DELETE FROM student WHERE id=" + s1;
					con = DriverManager.getConnection("jdbc:odbc:student", "",
							"");
					sql.executeUpdate(temp);
					JOptionPane.showMessageDialog(this, "删除成功!", "提示对话框",
							JOptionPane.INFORMATION_MESSAGE);
					con.close();
				} catch (SQLException ee) {
				}
			} else if (n == JOptionPane.NO_OPTION) {
			}
		}
	}

	public void delete() throws SQLException {
		String num, name, gender, address, phone, major;
		con = DriverManager.getConnection("jdbc:odbc:student", "", "");
		num = t1.getText().trim();
		ResultSet rs = sql.executeQuery("SELECT * FROM student where id='"
				+ num + "'");
		if (rs.next()) {
			// num=rs.getString("id");
			name = rs.getString("name");
			gender = rs.getString("gender");
			address = rs.getString("address");
			phone = rs.getString("phone");
			major = rs.getString("major");
			// if(num.equals(t1.getText().trim())){
			t2.setText(name);
			t3.setText(gender);
			t4.setText(address);
			t5.setText(phone);
			t6.setText(major);
			// break;
			// }
		} else {
			JOptionPane.showMessageDialog(this, "没有该学生!", "提示对话框",
					JOptionPane.INFORMATION_MESSAGE);
		}

		con.close();
	}
}