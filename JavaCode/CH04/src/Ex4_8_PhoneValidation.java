import java.io.*;
public class Ex4_8_PhoneValidation {
	public static void main(String[] args) throws IOException {
		boolean contiGo = true;
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		String regex = "^(13\\d|15[036-9]|18[89])\\d{8}$";// �����ʾ�ֻ������������ʽ
		String phoneNumber = "";
		while (contiGo) {
			System.out.println("�������ֻ�����");
			phoneNumber = buf.readLine();
			boolean match = phoneNumber.matches(regex);
			if (match) {
				System.out.println(phoneNumber + "�ǺϷ��ֻ�����" );
				break;
			}
			else System.out.println(phoneNumber + "���ǺϷ��ֻ�����" );
		}
	}

}
