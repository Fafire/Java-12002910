import java.awt.*;
public class Ex8_1_UnderstandAWT {
	public static void main(String[] args) {
		//�������������ò���
		Frame frm=new Frame("���AWT");
		frm.setLayout(new BorderLayout());
		
		//�������������ӵ������� 
		Button myBtn=new Button("��ť");
		frm.add(myBtn);
		
		//���� �ṹ(Frame)��λ�����С����ʾ
		frm.setBounds(400, 200, 400,200);
		frm.setVisible(true);
	}
}
