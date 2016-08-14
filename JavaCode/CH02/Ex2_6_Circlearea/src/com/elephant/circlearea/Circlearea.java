package com.elephant.circlearea;

import javax.swing.JOptionPane;

/**
 * 
 * @������Circlearea
 * @���飺����뾶������Բ���ܳ��������
 * @����ˣ� �ָ�ƽ
 * @������ڣ�2012-9-13
 * @�޸����ڣ�2012-3-13
 *
 */

public class Circlearea {
	public static void main(String[] args) {
		/* ͨ���Ի�������뾶 */
		String radiusString = JOptionPane.showInputDialog("������뾶");
		
		/* ���������ַ����Ƿ��д� */
		if(radiusString.trim().length() == 0)
			JOptionPane.showMessageDialog(null, "��������ݳ���Ϊ0", "�������ݴ���", JOptionPane.ERROR_MESSAGE);
		else {
			/* ��������ַ���ת���ɰ뾶�����ݰ뾶����Բ���ܳ������ */
			double radius = Double.parseDouble(radiusString);	// �뾶
			double perimeter = 2 * Math.PI * radius;		// �ܳ�
			double area = Math.PI * radius * radius;		// ���
			
			/* ͨ���Ի��������ʾ��� */
			String result = "�ܳ�Ϊ" + Double.toString(perimeter) 
					+ "��\n���Ϊ" + Double.toString(area) + "��\n";
			JOptionPane.showMessageDialog(null, result, "������", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
