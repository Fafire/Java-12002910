import javax.swing.*;

public class Ex8_4_UseScrollPane {
	public static void main(String[] args) {
		// 创建窗体
		JFrame frm = new JFrame();
		// 设置窗体标题
		frm.setTitle("使用JScrollPane");
		// 设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 创建结果输出框,2行32列
		JTextArea output = new JTextArea();
		output.setRows(2);
		output.setColumns(32);

		// 创建滚动面板并设置显示策略等
		JScrollPane outputScrollPane = new JScrollPane();
		outputScrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frm.getContentPane().add(outputScrollPane);
		outputScrollPane.setViewportView(output);
		output.setText("这是JScrollPane使用示例!\n\r 请输入或删除多行字符观察显示区的变化!");

		// 设置结构(JFrame)的位置与大小并显示
		frm.setBounds(450, 230, 400, 80);
		frm.setVisible(true);
	}
}
