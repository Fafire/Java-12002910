import javax.swing.JOptionPane;

public class Distance {
	public static String distancetoword(long dist) {
		/* 公里数转换为文字描述 */
		String distanceWord = null;
		if (0 < dist && dist <= 500) {
			distanceWord = "短距离";
		} else if (500 < dist && dist <= 1000) {
			distanceWord = "中距离";
		} else if (1000 < dist && dist <= 2000) {
			distanceWord = "远距离";
		} else if (dist > 2000) {
			distanceWord = "超远距离";
		} else
			distanceWord = "";
		return distanceWord;
	}

	public static void main(String[] args) {
		/* 通过对话框输入距离公里数 */
		String distanceString = JOptionPane.showInputDialog("请输距离公里数");
		/* 输入字符串转换为长整数变量 */
		long distanceValue = Long.parseLong(distanceString);
		/* 输出转换结果 */
		JOptionPane.showMessageDialog(null, distancetoword(distanceValue),
				"转换结果", JOptionPane.INFORMATION_MESSAGE);
	}
}
