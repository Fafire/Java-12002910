import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class Ex8_10_UseButtonEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("����¼�");
		frm.setLayout(new BorderLayout());

		// ������ť�����ע�������������Ȩ,����Ϊ�¼������߶���
		JButton btn = new JButton("�뵥������ť");
		frm.getContentPane().add(btn);
		ButtonHandler btnHandler = new ButtonHandler();
		btn.addActionListener(btnHandler); 	//�����¼���ص���Ȩ����ķ���

		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}
//ʵ�ֵ���¼��������ӿ�,��Ϊ����¼�ActionEvent�Ĵ�����
class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����˵���ʱ��");
	}
}
