/*
 * �������� 2012-7-19
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
// Circle������
public class Ex5_3_Circle {
	public static void main(String[] args){
		Circle c1,c2;              //����c1��c2ΪCircle����
		c1 = new Circle(10);      //����c1
		c2 = new Circle(10);      //����c2
		c2.setRadius(40);         //����c2���޸İ뾶����������Ӱ��c1�ĳ�Ա����״̬
		System.out.println("c1�뾶="+c1.getRadius()+"\tc2�뾶="+c2.getRadius());
		System.out.println("c1���="+c1.getArea()+"\tc2���="+c2.getArea());
	}
	

}
//����Circle��
class Circle {
	private double radius;
	
	public Circle(double r){          //���췽��
		radius = r;
	}
	
	public void setRadius(double r){ //�趨�뾶
		radius = r;		
	}
	
	public double getRadius(){        //�޸İ뾶
		return radius;
	}
	
	public double getArea() {        //�������
		final double PI = 3.14;
		double area;
		area = PI * radius * radius;
		return area;
	}
}
