// Ex10_2_StringToInt.java
public class Ex10_2_StringToInt {
	public static void main(String args[]){
		String grade[]={"66","56","78","89","83"};        //����ɼ�grade����
		int sum=0;
		int average=1;
		System.out.println("�ɼ��ֱ�Ϊ��");
		for(int i=0;i<grade.length;i++){                  //ѭ����������
			int gradeInt=Integer.parseInt(grade[i]);      //�������е�Ԫ�ض�ת��Ϊint��
			System.out.println(gradeInt);                 //�������и�Ԫ�����
			sum=sum+gradeInt;                             //������������Ԫ��֮��
		}
		average=sum/grade.length;                         //��ƽ����
		System.out.println("ƽ���ɼ�Ϊ��"+average);
	}

}
