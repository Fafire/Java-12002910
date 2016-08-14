import javax.swing.*;
import java.awt.*;

public class Ex8_2_UnderstandSwing {

	public static void main(String[] args) {
		// 创建容器和设置布局
		JFrame frm = new JFrame("理解Swing");
		frm.setLayout(new BorderLayout());

		// 创建组件，并添加到容器中
		JButton myBtn = new JButton("按钮");
		frm.add(myBtn);

		// 设置结构(JFrame)的位置与大小并显示
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
