import javax.swing.*;

public class Ex8_5_UseSplitPane {

	public static void main(String[] args) {
		// ��������
		JFrame frm = new JFrame();
		// ���ô������
		frm.setTitle("ʹ��JSplitPane");
		// ���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������ֱ�ָ����
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frm.getContentPane().add(splitPane);

		// �����ı�����ӵ�������ࣨ�ϲࣩ
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);
		splitPane.setLeftComponent(input);

		// ����������ť����ӵ������Ҳࣨ�²ࣩ
		JButton searchBtn = new JButton("����");
		splitPane.setRightComponent(searchBtn);

		// ���÷ָ����,�ϲ�Ϊ140�����ظ�
		splitPane.setDividerLocation(140);

		// ���ýṹ(JFrame)��λ�����С����ʾ
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}
}
