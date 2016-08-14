import javax.swing.*;
import java.awt.*;

public class Ex8_3_UnderstandPanel {
	public static void main(String[] args) {
		// ��������
		JFrame frm = new JFrame();
		//���ô������
		frm.setTitle("ʹ��JPanel");
		//���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������岢���ڴ����ϰ벿��
		JPanel topPanel=new JPanel();
		frm.getContentPane().add(topPanel,BorderLayout.NORTH);
		
		// �������������,�ɱ༭,�������,25��
		JTextField input=new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);
		
		// ����������ť
		JButton myBtn = new JButton("����");

		// ������������Ͱ�ť
		topPanel.add(input);
		topPanel.add(myBtn);

		// ������岢���ڴ����°벿��
		JPanel bottomPanel = new JPanel();
		frm.getContentPane().add(bottomPanel, BorderLayout.CENTER);

		// ������������,6��32��,���ɱ༭
		JTextArea output = new JTextArea();
		output.setRows(6);
		output.setColumns(32);
		output.setEditable(false);
	
		// ��ӽ�������
		bottomPanel.add(output);
		bottomPanel.setVisible(true);
		
		// ���ýṹ(JFrame)��λ�����С����ʾ
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);	
		}
}
