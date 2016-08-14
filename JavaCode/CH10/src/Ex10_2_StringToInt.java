// Ex10_2_StringToInt.java
public class Ex10_2_StringToInt {
	public static void main(String args[]){
		String grade[]={"66","56","78","89","83"};        //定义成绩grade数组
		int sum=0;
		int average=1;
		System.out.println("成绩分别为：");
		for(int i=0;i<grade.length;i++){                  //循环遍历数组
			int gradeInt=Integer.parseInt(grade[i]);      //将数组中的元素都转换为int型
			System.out.println(gradeInt);                 //将数组中各元素输出
			sum=sum+gradeInt;                             //求数组中所有元素之和
		}
		average=sum/grade.length;                         //求平均数
		System.out.println("平均成绩为："+average);
	}

}
