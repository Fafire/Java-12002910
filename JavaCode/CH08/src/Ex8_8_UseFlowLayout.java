import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class Ex8_8_UseFlowLayout {
	public static void main(String[] args) {
		// 创建窗体
		JFrame frm = new JFrame();
		// 设置窗体标题
		frm.setTitle("使用流布局管理器");
		FlowLayout flowlayout = new FlowLayout();
		frm.setLayout(flowlayout);

		JLabel label = new JLabel("性   别:");
		frm.getContentPane().add(label);
		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton manRadioButton = new JRadioButton("男人");
		manRadioButton.setSelected(true);
		JRadioButton womanRadioButton = new JRadioButton("女人");
		btnGroup.add(manRadioButton);
		btnGroup.add(womanRadioButton);
		frm.getContentPane().add(manRadioButton);
		frm.getContentPane().add(womanRadioButton);
		frm.setBounds(450, 230, 200, 100);
		frm.setVisible(true);
	}
}
