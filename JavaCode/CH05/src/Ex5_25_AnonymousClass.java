/*
 * �������� 2012-8-5
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
abstract class Student3{
	abstract void speak();
}

class Teacher2{
	void look(Student3 s){
		s.speak();
	}
}

public class Ex5_25_AnonymousClass {
	
	public static void main(String[] args) {
		
			Teacher2 zhang = new Teacher2 ();
			Student3 liu =new Student3(){
				void speak(){
					System.out.println("�����������еķ���");
				}
			};//�����������
			zhang.look( liu);
					
	}
}
