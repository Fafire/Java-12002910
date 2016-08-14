import javax.swing.*;

public class Ex8_5_UseSplitPane {

	public static void main(String[] args) {
		// 创建窗体
		JFrame frm = new JFrame();
		// 设置窗体标题
		frm.setTitle("使用JSplitPane");
		// 设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 创建垂直分割面板
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frm.getContentPane().add(splitPane);

		// 创建文本框并添加到面板的左侧（上侧）
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);
		splitPane.setLeftComponent(input);

		// 创建搜索按钮并添加到面板的右侧（下侧）
		JButton searchBtn = new JButton("搜索");
		splitPane.setRightComponent(searchBtn);

		// 设置分割比例,上侧为140个像素高
		splitPane.setDividerLocation(140);

		// 设置结构(JFrame)的位置与大小并显示
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}
}
