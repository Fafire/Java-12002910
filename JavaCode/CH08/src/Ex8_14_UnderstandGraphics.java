import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex8_14_UnderstandGraphics {
	public static void main(String[] args) {
		JFrame frm = new JFrame("理解绘图");
		frm.setLayout(null);
		DrawPanel p = new DrawPanel();
		p.setBounds(0, 0, 400, 200);
		frm.getContentPane().add(p);

		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}

// 充当画板的组件
class DrawPanel extends JPanel {
	public void paint(Graphics g) {
		g.setColor(Color.black);

		g.drawString("理解绘图", 20, 20);

		g.drawLine(20, 20, 90, 90);
		g.drawRect(100, 20, 70, 70);
		g.drawRoundRect(200, 20, 70, 70, 30, 30);
		g.fillRoundRect(300, 20, 70, 70, 30, 30);

		g.drawArc(20, 100, 70, 70, 0, 180);
		g.draw3DRect(100, 100, 70, 70, true);
		g.drawOval(200, 100, 70, 40);
		g.fillOval(300, 100, 70, 40);
	}
}
