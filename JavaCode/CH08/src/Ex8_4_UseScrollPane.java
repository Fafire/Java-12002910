import javax.swing.*;

public class Ex8_4_UseScrollPane {
	public static void main(String[] args) {
		// ��������
		JFrame frm = new JFrame();
		// ���ô������
		frm.setTitle("ʹ��JScrollPane");
		// ���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������������,2��32��
		JTextArea output = new JTextArea();
		output.setRows(2);
		output.setColumns(32);

		// ����������岢������ʾ���Ե�
		JScrollPane outputScrollPane = new JScrollPane();
		outputScrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frm.getContentPane().add(outputScrollPane);
		outputScrollPane.setViewportView(output);
		output.setText("����JScrollPaneʹ��ʾ��!\n\r �������ɾ�������ַ��۲���ʾ���ı仯!");

		// ���ýṹ(JFrame)��λ�����С����ʾ
		frm.setBounds(450, 230, 400, 80);
		frm.setVisible(true);
	}
}
