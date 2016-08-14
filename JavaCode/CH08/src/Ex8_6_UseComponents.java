import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;

public class Ex8_6_UseComponents {
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setTitle("ʹ�ó������");
		frm.setLayout(null);// ����Ϊ��ʹ�ò��ֹ�����
		// �������������ӵ�������
		
		//1.��ǩ�����ʹ��
		JLabel label = new JLabel("�������:");
		label.setBounds(5,5,160,80);
		label.setFont(new Font("",Font.BOLD,22));
		label.setIcon(new ImageIcon("label.jpg"));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//���ñ�����ͼƬ��λ��,�ڸ�JDK�߰汾���������µľ�̬����
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setVerticalTextPosition(JLabel.BOTTOM); 
		frm.getContentPane().add(label);
		
		//2.��ť�����ʹ��
		JButton button=new JButton();
		button.setText("����һ����ť");
		button.setBounds(170,5,120,30);
		frm.getContentPane().add(button);
		
		//3.�ı��������ʹ��
		JTextField text=new JTextField();
		text.setText("�������ı�");
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(170,45,120,30);
		frm.getContentPane().add(text);
		
		//4.����������ʹ��
		JPasswordField pwdText=new JPasswordField();
		pwdText.setText("mypassword");
		pwdText.setEchoChar('?');
		pwdText.setBounds(170,80,120,30);
		frm.getContentPane().add(pwdText);
		
		//5.�ı��������ʹ��
		JTextArea textArea=new JTextArea();
		textArea.setLineWrap(true);
		textArea.setColumns(10);
		textArea.setRows(3);
		textArea.append("����һ�������ı���");
		textArea.insert("�����Զ��س���", 11);
		textArea.setBounds(300,5,120,60);
		frm.getContentPane().add(textArea);
		
		//6.��ѡ��ť�����ʹ�òμ���8-8
		//7.��ѡ�������ʹ�òμ���8-9
		
		//8.�б�������ʹ��
		String[] likes={"��ѧ","����","��Ϸ","����Ӱ","����","����","���"};
		JList list=new JList(likes);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setFixedCellHeight(20);
		list.setVisibleRowCount(5);
		JScrollPane scrollpane=new JScrollPane();
		scrollpane.setViewportView(list);
		scrollpane.setBounds(30,130,120,120);
		frm.getContentPane().add(scrollpane);
		
		//9.ѡ��������ʹ��
		JComboBox comboBox=new JComboBox(likes);
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);
		comboBox.insertItemAt("��ѧ", 3);
			
		comboBox.setBounds(230,130,120,25);
		frm.getContentPane().add(comboBox);
		
		frm.setBounds(400, 200, 450, 320);
		frm.setVisible(true);
	}
}