import java.io.*;
import java.util.regex.*;
public class uu {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));

		Pattern pattern = Pattern.compile("//(//d{3}//)//s//d{3}-//d{4}");

		

		String s;
		s = buf.readLine();

		

Matcher matcher = pattern.matcher(s);

		if (matcher.find())

		{

		System.out.println(matcher.group());

		}

		buf.close();



	}

}
