import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex8_12_UnderstandMusic extends Applet {
	private static final long serialVersionUID = 1L;
	JCheckBox box1, box2;
	JButton play, loop, stop;
	AudioClip audio1 = null;
	AudioClip audio2 = null;
	JLabel label;

	public void init() {
		resize(400, 200);
		this.setLayout(null);
		box1 = new JCheckBox("��ѧ�ѵ�\"ף��\"");
		box2 = new JCheckBox("Ī��ε��\"��������\"");

		box1.setBounds(65, 15, 140, 35);
		box2.setBounds(200, 15, 180, 35);
		add(box1);
		add(box2);

		play = new JButton("Play");
		loop = new JButton("Loop");
		stop = new JButton("Stop");

		play.setBounds(50, 65, 80, 30);
		loop.setBounds(150, 65, 80, 30);
		stop.setBounds(250, 65, 80, 30);
		stop.setEnabled(false);

		audio1 = getAudioClip(getCodeBase(), "1.mid");
		audio2 = getAudioClip(getCodeBase(), "2.mid");

		add(play);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				playActionPerformed(event);
			}
		});

		add(loop);
		loop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				loopActionPerformed(event);
			}
		});

		add(stop);
		stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				stopActionPerformed(event);
			}

		});

		label = new JLabel();
		label.setBounds(65, 100, 400, 35);
		add(label);
		label.setText("��ѡ������󰴼�!");
	}

	private void playActionPerformed(ActionEvent event) {
		if (audio1 != null && box1.isSelected()) {
			audio1.play();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("���ڵ��β���!");
		}
		if (audio2 != null && box2.isSelected()) {
			audio2.play();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("���ڵ��β���!");
		} else
			label.setText("��ȷ��1.mid��2.mid����Գ�����ͬһ·����!");
	}

	private void loopActionPerformed(ActionEvent event) {
		if (audio1 != null && box1.isSelected()) {
			audio1.loop();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("����ѭ�����Ŷ�Σ�");
		}
		if (audio2 != null && box2.isSelected()) {
			audio2.loop();
			play.setEnabled(false);
			loop.setEnabled(false);
			stop.setEnabled(true);
			label.setText("����ѭ�����Ŷ�Σ�");
		} else
			label.setText("��ȷ��1.mid��2.mid����Գ�����ͬһ·����!");
	}

	private void stopActionPerformed(ActionEvent event) {
		audio1.stop();
		audio2.stop();
		play.setEnabled(true);
		loop.setEnabled(true);
		stop.setEnabled(false);
		label.setText("ֹͣ����!");
	}
}