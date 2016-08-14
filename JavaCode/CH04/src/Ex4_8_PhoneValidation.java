import java.io.*;
public class Ex4_8_PhoneValidation {
	public static void main(String[] args) throws IOException {
		boolean contiGo = true;
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		String regex = "^(13\\d|15[036-9]|18[89])\\d{8}$";// 定义表示手机号码的正则表达式
		String phoneNumber = "";
		while (contiGo) {
			System.out.println("请输入手机号码");
			phoneNumber = buf.readLine();
			boolean match = phoneNumber.matches(regex);
			if (match) {
				System.out.println(phoneNumber + "是合法手机号码" );
				break;
			}
			else System.out.println(phoneNumber + "不是合法手机号码" );
		}
	}

}
