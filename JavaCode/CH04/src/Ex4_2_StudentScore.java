import java.io.*;
import javax.swing.JOptionPane;

public class Ex4_2_StudentScore {

	public static void main(String[] args) throws IOException {
		int k, count = 5;// count为学生的个数
		double score[] = new double[count];// 学生的成绩数组
		
		boolean contiGo = true;
		String str;
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		for (k = 0; k < count; k++) {
			while (contiGo) {
				System.out.print("请输入第" + (k + 1) + "个学生的成绩：");
				str = buf.readLine();
				try {// 处理输入非数值数据或输入的数是0
					score[k] = Double.parseDouble(str);
					if (0 > score[k] || 100 < score[k]) {
						JOptionPane.showMessageDialog(null, "成绩不应该<0,请重新输入。",
								"提示信息", JOptionPane.QUESTION_MESSAGE);
					} else
						break;
				} catch (Exception ne) {
					JOptionPane.showMessageDialog(null, "输入的不是数据，不符合规定，请重新输入。",
							"提示信息", JOptionPane.QUESTION_MESSAGE);
				}
			}
		}

		// 采用冒泡法，对成绩排序
		double[] scoreCopy = new double[count+1];
		double temp = 0;
		System.arraycopy(score, 0, scoreCopy, 1, score.length);
				
		for (k = 1; k < count; k++)
			// 使用冒泡法进行排序
			for (int m = 1; m <= count - k; m++)
				if (scoreCopy[m] > scoreCopy[m + 1]) {
					temp = scoreCopy[m];
					scoreCopy[m] = scoreCopy[m + 1];
					scoreCopy[m + 1] = temp;
				}
		System.out.println("这" + score.length + "个同学的成绩如下：");

		for (int j = 0; j < score.length; j++) {
			System.out.print(score[j] + "\t");
		}

		System.out.println("\n 这" + score.length + "个同学的成绩从低到高排序如下：");
		for (int j = 1; j < scoreCopy.length; j++) {
			System.out.print(scoreCopy[j] + "\t");
		}
	}

}
