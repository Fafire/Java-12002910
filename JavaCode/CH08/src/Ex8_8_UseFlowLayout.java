import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class Ex8_8_UseFlowLayout {
	public static void main(String[] args) {
		// ��������
		JFrame frm = new JFrame();
		// ���ô������
		frm.setTitle("ʹ�������ֹ�����");
		FlowLayout flowlayout = new FlowLayout();
		frm.setLayout(flowlayout);

		JLabel label = new JLabel("��   ��:");
		frm.getContentPane().add(label);
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton manRadioButton = new JRadioButton("����");
		manRadioButton.setSelected(true);
		JRadioButton womanRadioButton = new JRadioButton("Ů��");
		btnGroup.add(manRadioButton);
		btnGroup.add(womanRadioButton);
		frm.getContentPane().add(manRadioButton);
		frm.getContentPane().add(womanRadioButton);
		frm.setBounds(450, 230, 200, 100);
		frm.setVisible(true);
	}
}
