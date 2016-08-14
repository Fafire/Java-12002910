import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex8_17_SimpleCalculator {

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
	}
}

class SimpleCalculator extends JFrame {
	GridLayout gl1, gl2, gl3;
	JPanel resultPanel, controlPanel, statisticsPanel, computationPanel;
	JTextField tf1;
	TextField tf2;
	Button[] btn = new Button[27];
	String[] btnCaption = { "Backspace", "CE", "C", "MC", "MR", "MS", "M+",
			"7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%", "1", "2", "3",
			"-", "1/X", "0", "+/-", ".", "+", "=" };

	StringBuffer str;// 显示屏所显示的字符串
	double x, y; // x和y都是运算数
	int z; // Z表示单击了那一个运算符,0表示"+",1表示"-",2表示"*",3表示"/"
	static double m; // 记忆的数字

	public SimpleCalculator() {
		super("计算器");
		setLayout(null);
		setResizable(false);// 禁止调整框架的大小

		// 实例化所有按钮、设置其前景色并注册监听器
		for (int i = 0; i < 27; i++) {
			btn[i] = new Button(btnCaption[i]);
			btn[i].setFont(new Font("", Font.PLAIN, 12));
			btn[i].setForeground(Color.red);
			btn[i].addActionListener(new Bt());
		}

		// 创建结果面板,添加显示屏等
		resultPanel = new JPanel();
		resultPanel.setBounds(10, 10, 300, 40);
		tf1 = new JTextField(27); // 显示屏
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setEnabled(false);
		tf1.setText("0");
		resultPanel.add(tf1);
		getContentPane().add(resultPanel);

		// 创建控制键面板,添加记忆框及3个控制键
		controlPanel = new JPanel();
		controlPanel.setBounds(10, 50, 300, 25);
		gl1 = new GridLayout(1, 4, 10, 0); // 一行四列
		controlPanel.setLayout(gl1); // 设置布局
		tf2 = new TextField(8); // 显示记忆的索引值
		tf2.setEditable(false);
		controlPanel.add(tf2);
		for (int i = 0; i < 3; i++)
			// 添加3个控制键
			controlPanel.add(btn[i]);
		getContentPane().add(controlPanel);

		// 添加统计面板以及四个按键
		statisticsPanel = new JPanel();
		statisticsPanel.setBounds(10, 90, 40, 150);
		gl2 = new GridLayout(4, 1, 0, 15); // 四行一列
		statisticsPanel.setLayout(gl2);
		for (int i = 3; i < 7; i++)
			statisticsPanel.add(btn[i]);
		getContentPane().add(statisticsPanel);

		// 添加计算面板以及数字、运算符按键
		computationPanel = new JPanel();
		computationPanel.setBounds(60, 90, 250, 150);
		gl3 = new GridLayout(4, 5, 10, 15); // 四行五列
		computationPanel.setLayout(gl3);//
		for (int i = 7; i < 27; i++)
			computationPanel.add(btn[i]);
		getContentPane().add(computationPanel);

		// 创建一个空字符串缓冲区
		str = new StringBuffer();

		// 匿名类关闭窗口
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				System.exit(0);
			}
		});
		setBackground(Color.lightGray);
		setBounds(400, 200, 320, 280);
		setVisible(true);
	}

	// 构造监听器
	class Bt implements ActionListener {
		public void actionPerformed(ActionEvent e2) {
			try {

				if (e2.getSource() == btn[1])// 选择"CE"清零
				{// 把显示屏清零
					tf1.setText("0");
					// 清空字符串缓冲区以准备接收新的输入运算数
					str.setLength(0);
				} else if (e2.getSource() == btn[2])// 选择"C"清零
				{
					tf1.setText("0");// 把显示屏清零
					str.setLength(0);
					// 单击"+/-"选择输入的运算数是正数还是负数
				} else if (e2.getSource() == btn[23]) {
					x = Double.parseDouble(tf1.getText().trim());
					tf1.setText("" + (-x));
					// 单击加号按钮获得x的值和z的值并清空y的值
				} else if (e2.getSource() == btn[25]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);// 清空缓冲区以便接收新的另一个运算数
					y = 0d;
					z = 0;
					// 单击减号按钮获得x的值和z的值并清空y的值
				} else if (e2.getSource() == btn[20]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 1;
					// 单击乘号按钮获得x的值和z的值并清空y的值
				} else if (e2.getSource() == btn[15]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 2;
					// 单击除号按钮获得x的值和z的值并空y的值
				} else if (e2.getSource() == btn[10]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 3;
					// 单击等号按钮输出计算结果
				} else if (e2.getSource() == btn[26]) {
					str.setLength(0);
					switch (z) {
					case 0:
						tf1.setText("" + (x + y));
						break;
					case 1:
						tf1.setText("" + (x - y));
						break;
					case 2:
						tf1.setText("" + (x * y));
						break;
					case 3:
						tf1.setText("" + (x / y));
						break;
					}
				} else if (e2.getSource() == btn[24])// 单击"."按钮输入小数
				{// 判断字符串中是否已经包含了小数点
					if (tf1.getText().trim().indexOf('.') != -1) {

					} else// 如果没数点有小
					{
						if (tf1.getText().trim().equals("0"))// 如果初时显示为0
						{
							str.setLength(0);
							tf1.setText((str.append("0" + e2.getActionCommand()))
									.toString());
							// 如果初时显示为空则不做任何操作
						} else if (tf1.getText().trim().equals("")) {
						} else {
							tf1.setText(str.append(e2.getActionCommand())
									.toString());
						}
					}

					y = 0d;

				} else if (e2.getSource() == btn[11])// 求平方根
				{
					x = Double.parseDouble(tf1.getText().trim());
					tf1.setText("数字格式异常");
					if (x < 0)
						tf1.setText("负数没有平方根");
					else
						tf1.setText("" + Math.sqrt(x));
					str.setLength(0);
					y = 0d;
				} else if (e2.getSource() == btn[16])// 单击了"%"按钮
				{
					x = Double.parseDouble(tf1.getText().trim());
					tf1.setText("" + (0.01 * x));
					str.setLength(0);
					y = 0d;
				} else if (e2.getSource() == btn[21])// 单击了"1/X"按钮
				{

					x = Double.parseDouble(tf1.getText().trim());
					if (x == 0) {

						tf1.setText("除数不能为零");
					} else {
						tf1.setText("" + (1 / x));
					}
					str.setLength(0);
					y = 0d;
				} else if (e2.getSource() == btn[3])// MC为清除内存
				{
					m = 0d;
					tf2.setText("");
					str.setLength(0);
				} else if (e2.getSource() == btn[4])// MR为重新调用存储的数据
				{
					if (tf2.getText().trim() != "")// 有记忆数字
					{
						tf1.setText("" + m);
					}
				} else if (e2.getSource() == btn[5])// MS为存储显示的数据
				{

					m = Double.parseDouble(tf1.getText().trim());
					tf2.setText("M");
					tf1.setText("0");
					str.setLength(0);
					// M+为将显示的数字与已经存储的数据相加要查看新的数字单击MR
				} else if (e2.getSource() == btn[6]) {
					m = m + Double.parseDouble(tf1.getText().trim());
				} else// 选择的是其他的按钮
				{// 如果选择的是"0"这个数字键
					if (e2.getSource() == btn[22]) {// 如果显示屏显示的为零不做操作
						if (tf1.getText().trim().equals("0")) {

						} else {
							tf1.setText(str.append(e2.getActionCommand())
									.toString());
							y = Double.parseDouble(tf1.getText().trim());
						}
						// 选择的是“BackSpace”按钮
					} else if (e2.getSource() == btn[0]) {// 如果显示屏显示的不是零
						if (!tf1.getText().trim().equals("0")) {
							if (str.length() != 1) {
								// 可能抛出字符串越界异常
								tf1.setText(str.delete(str.length() - 1,
										str.length()).toString());
							} else {
								tf1.setText("0");
								str.setLength(0);
							}
						}
						y = Double.parseDouble(tf1.getText().trim());
					} else// 其他的数字键
					{
						tf1.setText(str.append(e2.getActionCommand())
								.toString());
						y = Double.parseDouble(tf1.getText().trim());
					}
				}
			} catch (NumberFormatException e) {
				tf1.setText("数字格式异常");
			} catch (StringIndexOutOfBoundsException e) {
				tf1.setText("字符串索引越界");
			}
		}
	}
}