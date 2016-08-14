import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import javax.imageio.*;

public class Ex8_15_UnderstandImage {
	public static void main(String[] args) {
		JFrame frm = new JFrame("理解图像");
		frm.setLayout(null);
		ImagePanel ip = new ImagePanel();
		ip.setBounds(0, 0, 400, 200);
		frm.getContentPane().add(ip);
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}

// 显示图像的组件
class ImagePanel extends JPanel {
	Image img;

	public void paint(Graphics g) {
		try {
			// 装载图像
			img = ImageIO.read(new File("./iphone.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 绘制图像
		g.drawImage(img, 0, 0, 400, 200, null);
	}
}

/*
class ImagePanel extends JPanel {
	Image img;
	MediaTracker mt=new MediaTracker(this);
	public void paint(Graphics g) {
		try {
			// 装载图像
			img = ImageIO.read(new File("./iphone.jpg"));
			mt.addImage(img, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 绘制图像
		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 400, 200, null);
	}
}
*/