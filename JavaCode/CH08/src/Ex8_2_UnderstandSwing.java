import javax.swing.*;
import java.awt.*;

public class Ex8_2_UnderstandSwing {

	public static void main(String[] args) {
		// �������������ò���
		JFrame frm = new JFrame("���Swing");
		frm.setLayout(new BorderLayout());

		// �������������ӵ�������
		JButton myBtn = new JButton("��ť");
		frm.add(myBtn);

		// ���ýṹ(JFrame)��λ�����С����ʾ
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
