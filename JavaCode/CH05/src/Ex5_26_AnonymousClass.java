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

public class Ex5_26_AnonymousClass {

	public static void main(String[] args) {
		A a= new A();
		a.f(new Show(){
			public void show(){
				System.out.println("ʵ���˽ӿڵ�������");
			}
			
		}
		);
	}
}

interface Show{
	public void show();
}

class A{
	void f(Show s){
		s.show();
	}
}
