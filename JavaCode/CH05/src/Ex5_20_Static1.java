/*
 * �������� 2012-7-31
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */

/**
 * @author xiang
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public class Ex5_20_Static1 {

	public static void main(String[] args) {
		 System.out.println("Ŀǰ����������:"+Person3.totalNum);
		 Person3 wang = new  Person3("Wang");
		 Person3 liu = new  Person3("Liu");
		 Person3 zhao = new  Person3("Zhao");
		 
		 System.out.println("Ŀǰ����������:"+Person3.totalNum);
		 System.out.println("Ŀǰ����������:"+wang.totalNum);
		 
		 
		
	}
}

class Person3{
	static long totalNum=10000;
	int age;
	String name;
	String id;
	
	public Person3(String name){
		totalNum++;
		this.name=name;
		age=1;
	}
	
}
