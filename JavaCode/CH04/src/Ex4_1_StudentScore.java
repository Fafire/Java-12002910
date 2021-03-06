import java.io.*;
import javax.swing.JOptionPane;

public class Ex4_1_StudentScore {
	public static void main(String[] args) throws IOException {
		int k, count = 5;// count为学生的个数
		double score[] = new double[count];// 学生的成绩数组
		double doubleSum = 0.0, doubleAver = 0.0,maxScore=0.0;
		// 学生的总成绩、平均成绩和最高成绩
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
			doubleSum += score[k];
			if (score[k]>maxScore) maxScore = score[k];
		}
		doubleAver = doubleSum / count;//平均成绩保留2位小数
		System.out.println("这" + count + "个同学的平均成绩是：" + doubleAver);
		System.out.println("这" + count + "个同学的最好成绩是：" + maxScore);
		
	}
}
