/*
 * �������� 2012-7-21
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
public class Ex5_7_this2 {
	int x=188,y;
	public static void main(String[] args){
		Ex5_7_this2 e= new Ex5_7_this2();
		e.f();
	}
	void f(){
		int x=3;
		y=x;//y�õ���ֵ��3�����ǳ�Ա����x��ֵ��188��
		System.out.println("y="+y);
		
		y=this.x;//y�õ���ֵ�Ƿǳ�Ա����x��ֵ������188
		System.out.println("y="+y);
	}

}
