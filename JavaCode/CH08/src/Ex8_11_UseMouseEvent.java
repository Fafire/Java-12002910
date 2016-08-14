import javax.swing.*;
import java.awt.event.*;

public class Ex8_11_UseMouseEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("鼠标事件使用示例");
		frm.setLayout(null);

		JLabel label = new JLabel("请在窗体内按住鼠标左键,拖动鼠标!");
		label.setBounds(45, 5, 200, 25);
		frm.getContentPane().add(label);

		// 创建文本框对象
		JTextField text = new JTextField(30);
		text.setBounds(45, 65, 300, 30);
		frm.getContentPane().add(text);

		// 注册监听器,参数为事件处理者对象
		MouseListenerImp mouse = new MouseListenerImp(text);
		frm.addMouseListener(mouse);
		frm.addMouseMotionListener(mouse);
		frm.addWindowListener(mouse);

		frm.setBounds(500, 250, 400, 200);
		frm.setVisible(true);
	}
}
/*
// 实现鼠标、窗体相关的接口
class MouseListenerImp implements MouseMotionListener, MouseListener,
		WindowListener {
	JTextField text;

	public MouseListenerImp(JTextField text) {
		this.text = text;
	}

	public void mouseDragged(MouseEvent e) {
		String s = "拖曳鼠标，坐标：X=" + e.getX() + ",Y=" + e.getY();
		text.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		String s = "鼠标进入了窗体";
		text.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = "鼠标离开了窗体";
		text.setText(s);
	}

	public void windowClosing(WindowEvent e) {
		// 为了使窗口能正常关闭，程序正常退出
		System.exit(1);
	}

	// 不打算实现新功能的方法，让方法体为空即可。
	public void mouseMoved(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowDeactivated(WindowEvent arg0) {
	}
}
*/
// 继承窗体事件的适配器，实现鼠标相关的接口
class MouseListenerImp extends WindowAdapter implements MouseMotionListener,
		MouseListener {
	JTextField text;

	public MouseListenerImp(JTextField text) {
		this.text = text;
	}

	public void mouseDragged(MouseEvent e) {
		String s = "拖曳鼠标，坐标：X=" + e.getX() + ",Y=" + e.getY();
		text.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		String s = "鼠标进入了窗体";
		text.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = "鼠标离开了窗体";
		text.setText(s);
	}

	public void windowClosing(WindowEvent e) {
		// 为了使窗口能正常关闭，程序正常退出
		System.exit(1);
	}

	// 不打算实现新功能的鼠标相关的方法，仍让方法体为空即可。
	public void mouseMoved(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}
