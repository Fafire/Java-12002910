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
public class Ex5_5_ConstructorOverload {
	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		System.out.println("p1��ԭ��Ϊ ("+p1.x+","+p1.y+")");
		System.out.println("p2��ԭ��Ϊ ("+p2.x+","+p2.y+")");
	}

}
class Point{
	int x;
	int y;
	public Point(){
		x=0;
		y=0;
		
	}
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
}
