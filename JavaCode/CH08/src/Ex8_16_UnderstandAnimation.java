import java.awt.Graphics;
import javax.swing.*;

public class Ex8_16_UnderstandAnimation {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Àí½â¶¯»­");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		AnimationPanel ap = new AnimationPanel();
		ap.setBounds(0, 0, 400, 200);
		frm.getContentPane().add(ap);
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}
}

class AnimationPanel extends JPanel implements Runnable {
	Thread runner;
	int r = 25, x = 0, y = 0, d = 1;

	AnimationPanel() {
		start();
	}

	public void start() {
		if (runner == null)
			runner = new Thread(this);
		runner.start();
	}

	public void run() {
		while (true) {
			x = x + d;
			y = y + d;
			if (x > 400 - 2 * r)
				x = r;
			if (y > 200 - 2 * r)
				y = r;
			repaint();
			try {
				Thread.sleep(33);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 200);
		g.drawOval(x, y, r, r);
	}
}