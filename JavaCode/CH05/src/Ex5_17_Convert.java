/*
 * �������� 2012-7-27
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
public class Ex5_17_Convert {

	public static void main(String[] args) {
		C c = new D();//��������ָ���������
		c.n = 3.1415926;//�޸��Ǹ������õı����صı���
		//c.w = 300;//A �У��������ò��ܲ���������������ĳ�Ա����
		//c.cry();//B��,�������ò��ܲ���������������ĳ�Ա����
		c.m = 186;
		c.f();
		c.g();//C�У�cʵ����һ������������ʵ�ʵ��õ��������g��������
		
		D d=(D) c;//��cǿ��ת��Ϊ�������
		d.n=555;
		d.f();
		d.g();
		d.cry();
		
	}
}

class C {
	int m;
	double n;
	void f(){
		System.out.println("������̳еķ���f()");
	}
	void g(){
		System.out.println("��ã�n="+n+"  m="+m);
	}
	
}

class D extends C{
	int w=100;
	int n=12;
	void g(){
		System.out.println("������д����g(),n="+n+"  m="+m);	
	}
	void cry(){
		System.out.println("���������ķ���");
	}
	
}
