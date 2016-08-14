import javax.swing.*;
import java.awt.event.*;

public class Ex8_11_UseMouseEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("����¼�ʹ��ʾ��");
		frm.setLayout(null);

		JLabel label = new JLabel("���ڴ����ڰ�ס������,�϶����!");
		label.setBounds(45, 5, 200, 25);
		frm.getContentPane().add(label);

		// �����ı������
		JTextField text = new JTextField(30);
		text.setBounds(45, 65, 300, 30);
		frm.getContentPane().add(text);

		// ע�������,����Ϊ�¼������߶���
		MouseListenerImp mouse = new MouseListenerImp(text);
		frm.addMouseListener(mouse);
		frm.addMouseMotionListener(mouse);
		frm.addWindowListener(mouse);

		frm.setBounds(500, 250, 400, 200);
		frm.setVisible(true);
	}
}
/*
// ʵ����ꡢ������صĽӿ�
class MouseListenerImp implements MouseMotionListener, MouseListener,
		WindowListener {
	JTextField text;

	public MouseListenerImp(JTextField text) {
		this.text = text;
	}

	public void mouseDragged(MouseEvent e) {
		String s = "��ҷ��꣬���꣺X=" + e.getX() + ",Y=" + e.getY();
		text.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		String s = "�������˴���";
		text.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = "����뿪�˴���";
		text.setText(s);
	}

	public void windowClosing(WindowEvent e) {
		// Ϊ��ʹ�����������رգ����������˳�
		System.exit(1);
	}

	// ������ʵ���¹��ܵķ������÷�����Ϊ�ռ��ɡ�
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
// �̳д����¼�����������ʵ�������صĽӿ�
class MouseListenerImp extends WindowAdapter implements MouseMotionListener,
		MouseListener {
	JTextField text;

	public MouseListenerImp(JTextField text) {
		this.text = text;
	}

	public void mouseDragged(MouseEvent e) {
		String s = "��ҷ��꣬���꣺X=" + e.getX() + ",Y=" + e.getY();
		text.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		String s = "�������˴���";
		text.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = "����뿪�˴���";
		text.setText(s);
	}

	public void windowClosing(WindowEvent e) {
		// Ϊ��ʹ�����������رգ����������˳�
		System.exit(1);
	}

	// ������ʵ���¹��ܵ������صķ��������÷�����Ϊ�ռ��ɡ�
	public void mouseMoved(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}
