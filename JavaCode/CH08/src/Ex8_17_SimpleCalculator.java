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

	StringBuffer str;// ��ʾ������ʾ���ַ���
	double x, y; // x��y����������
	int z; // Z��ʾ��������һ�������,0��ʾ"+",1��ʾ"-",2��ʾ"*",3��ʾ"/"
	static double m; // ���������

	public SimpleCalculator() {
		super("������");
		setLayout(null);
		setResizable(false);// ��ֹ������ܵĴ�С

		// ʵ�������а�ť��������ǰ��ɫ��ע�������
		for (int i = 0; i < 27; i++) {
			btn[i] = new Button(btnCaption[i]);
			btn[i].setFont(new Font("", Font.PLAIN, 12));
			btn[i].setForeground(Color.red);
			btn[i].addActionListener(new Bt());
		}

		// ����������,�����ʾ����
		resultPanel = new JPanel();
		resultPanel.setBounds(10, 10, 300, 40);
		tf1 = new JTextField(27); // ��ʾ��
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setEnabled(false);
		tf1.setText("0");
		resultPanel.add(tf1);
		getContentPane().add(resultPanel);

		// �������Ƽ����,��Ӽ����3�����Ƽ�
		controlPanel = new JPanel();
		controlPanel.setBounds(10, 50, 300, 25);
		gl1 = new GridLayout(1, 4, 10, 0); // һ������
		controlPanel.setLayout(gl1); // ���ò���
		tf2 = new TextField(8); // ��ʾ���������ֵ
		tf2.setEditable(false);
		controlPanel.add(tf2);
		for (int i = 0; i < 3; i++)
			// ���3�����Ƽ�
			controlPanel.add(btn[i]);
		getContentPane().add(controlPanel);

		// ���ͳ������Լ��ĸ�����
		statisticsPanel = new JPanel();
		statisticsPanel.setBounds(10, 90, 40, 150);
		gl2 = new GridLayout(4, 1, 0, 15); // ����һ��
		statisticsPanel.setLayout(gl2);
		for (int i = 3; i < 7; i++)
			statisticsPanel.add(btn[i]);
		getContentPane().add(statisticsPanel);

		// ��Ӽ�������Լ����֡����������
		computationPanel = new JPanel();
		computationPanel.setBounds(60, 90, 250, 150);
		gl3 = new GridLayout(4, 5, 10, 15); // ��������
		computationPanel.setLayout(gl3);//
		for (int i = 7; i < 27; i++)
			computationPanel.add(btn[i]);
		getContentPane().add(computationPanel);

		// ����һ�����ַ���������
		str = new StringBuffer();

		// ������رմ���
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				System.exit(0);
			}
		});
		setBackground(Color.lightGray);
		setBounds(400, 200, 320, 280);
		setVisible(true);
	}

	// ���������
	class Bt implements ActionListener {
		public void actionPerformed(ActionEvent e2) {
			try {

				if (e2.getSource() == btn[1])// ѡ��"CE"����
				{// ����ʾ������
					tf1.setText("0");
					// ����ַ�����������׼�������µ�����������
					str.setLength(0);
				} else if (e2.getSource() == btn[2])// ѡ��"C"����
				{
					tf1.setText("0");// ����ʾ������
					str.setLength(0);
					// ����"+/-"ѡ����������������������Ǹ���
				} else if (e2.getSource() == btn[23]) {
					x = Double.parseDouble(tf1.getText().trim());
					tf1.setText("" + (-x));
					// �����ӺŰ�ť���x��ֵ��z��ֵ�����y��ֵ
				} else if (e2.getSource() == btn[25]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);// ��ջ������Ա�����µ���һ��������
					y = 0d;
					z = 0;
					// �������Ű�ť���x��ֵ��z��ֵ�����y��ֵ
				} else if (e2.getSource() == btn[20]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 1;
					// �����˺Ű�ť���x��ֵ��z��ֵ�����y��ֵ
				} else if (e2.getSource() == btn[15]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 2;
					// �������Ű�ť���x��ֵ��z��ֵ����y��ֵ
				} else if (e2.getSource() == btn[10]) {
					x = Double.parseDouble(tf1.getText().trim());
					str.setLength(0);
					y = 0d;
					z = 3;
					// �����ȺŰ�ť���������
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
				} else if (e2.getSource() == btn[24])// ����"."��ť����С��
				{// �ж��ַ������Ƿ��Ѿ�������С����
					if (tf1.getText().trim().indexOf('.') != -1) {

					} else// ���û������С
					{
						if (tf1.getText().trim().equals("0"))// �����ʱ��ʾΪ0
						{
							str.setLength(0);
							tf1.setText((str.append("0" + e2.getActionCommand()))
									.toString());
							// �����ʱ��ʾΪ�������κβ���
						} else if (tf1.getText().trim().equals("")) {
						} else {
							tf1.setText(str.append(e2.getActionCommand())
									.toString());
						}
					}

					y = 0d;

				} else if (e2.getSource() == btn[11])// ��ƽ����
				{
					x = Double.parseDouble(tf1.getText().trim());
					tf1.setText("���ָ�ʽ�쳣");
					if (x < 0)
						tf1.setText("����û��ƽ����");
					else
						tf1.setText("" + Math.sqrt(x));
					str.setLength(0);
					y = 0d;
				} else if (e2.getSource() == btn[16])// ������"%"��ť
				{
					x = Double.parseDouble(tf1.getText().trim());
					tf1.setText("" + (0.01 * x));
					str.setLength(0);
					y = 0d;
				} else if (e2.getSource() == btn[21])// ������"1/X"��ť
				{

					x = Double.parseDouble(tf1.getText().trim());
					if (x == 0) {

						tf1.setText("��������Ϊ��");
					} else {
						tf1.setText("" + (1 / x));
					}
					str.setLength(0);
					y = 0d;
				} else if (e2.getSource() == btn[3])// MCΪ����ڴ�
				{
					m = 0d;
					tf2.setText("");
					str.setLength(0);
				} else if (e2.getSource() == btn[4])// MRΪ���µ��ô洢������
				{
					if (tf2.getText().trim() != "")// �м�������
					{
						tf1.setText("" + m);
					}
				} else if (e2.getSource() == btn[5])// MSΪ�洢��ʾ������
				{

					m = Double.parseDouble(tf1.getText().trim());
					tf2.setText("M");
					tf1.setText("0");
					str.setLength(0);
					// M+Ϊ����ʾ���������Ѿ��洢���������Ҫ�鿴�µ����ֵ���MR
				} else if (e2.getSource() == btn[6]) {
					m = m + Double.parseDouble(tf1.getText().trim());
				} else// ѡ����������İ�ť
				{// ���ѡ�����"0"������ּ�
					if (e2.getSource() == btn[22]) {// �����ʾ����ʾ��Ϊ�㲻������
						if (tf1.getText().trim().equals("0")) {

						} else {
							tf1.setText(str.append(e2.getActionCommand())
									.toString());
							y = Double.parseDouble(tf1.getText().trim());
						}
						// ѡ����ǡ�BackSpace����ť
					} else if (e2.getSource() == btn[0]) {// �����ʾ����ʾ�Ĳ�����
						if (!tf1.getText().trim().equals("0")) {
							if (str.length() != 1) {
								// �����׳��ַ���Խ���쳣
								tf1.setText(str.delete(str.length() - 1,
										str.length()).toString());
							} else {
								tf1.setText("0");
								str.setLength(0);
							}
						}
						y = Double.parseDouble(tf1.getText().trim());
					} else// ���������ּ�
					{
						tf1.setText(str.append(e2.getActionCommand())
								.toString());
						y = Double.parseDouble(tf1.getText().trim());
					}
				}
			} catch (NumberFormatException e) {
				tf1.setText("���ָ�ʽ�쳣");
			} catch (StringIndexOutOfBoundsException e) {
				tf1.setText("�ַ�������Խ��");
			}
		}
	}
}