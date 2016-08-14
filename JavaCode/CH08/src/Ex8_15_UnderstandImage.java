import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import javax.imageio.*;

public class Ex8_15_UnderstandImage {
	public static void main(String[] args) {
		JFrame frm = new JFrame("���ͼ��");
		frm.setLayout(null);
		ImagePanel ip = new ImagePanel();
		ip.setBounds(0, 0, 400, 200);
		frm.getContentPane().add(ip);
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}

// ��ʾͼ������
class ImagePanel extends JPanel {
	Image img;

	public void paint(Graphics g) {
		try {
			// װ��ͼ��
			img = ImageIO.read(new File("./iphone.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ����ͼ��
		g.drawImage(img, 0, 0, 400, 200, null);
	}
}

/*
class ImagePanel extends JPanel {
	Image img;
	MediaTracker mt=new MediaTracker(this);
	public void paint(Graphics g) {
		try {
			// װ��ͼ��
			img = ImageIO.read(new File("./iphone.jpg"));
			mt.addImage(img, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ����ͼ��
		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 400, 200, null);
	}
}
*/