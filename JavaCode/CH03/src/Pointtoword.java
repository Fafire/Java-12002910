import java.util.Scanner;

public class Pointtoword {
	public static String pointtoword(int grad) {
		/* �������ת��Ϊ���� */
		String result = null;
		switch (grad) {
		case 10:
		case 9:
			result = "��";
			break;
		case 8:
			result = "��";
			break;
		case 7:
			result = "��";
			break;
		case 6:
			result = "����";
			break;
		default:
			result = "������";
		}
		return result;
	}

	public static void main(String[] args) {
		/* ������� */
		float point = 0;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�����������0-100����");
			point = scanner.nextFloat();
			scanner.close();
		} catch (Exception e) {
			System.out.println("�������ݴ��󣡣���");
			System.out.println("������Ϣ��" + e.getMessage());
		}
		if (0 <= point && point <= 100) {
			/* ת�������� */
			System.out.println("�ɼ��ǣ�" + pointtoword((int) point / 10));
		} else {
			System.out.println("����ĳɼ�����ȷ��" + point);
		}
	}
}
