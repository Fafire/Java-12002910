package com.elephant.rectangle;

/**
 * 
 * @������Point
 * @���飺������࣬���Գ�ʼ��������x��y��
 * @����ˣ� �ָ�ƽ
 * @������ڣ�2012-8-9
 * @�޸����ڣ�2012-8-10
 *
 */

public class Point {
	double x, y;

	public Point(double x, double y) { this.x = x; this.y = y; }
	
	/* ���ʼ��ʱ������һ��ԭ��ʵ�� */
	public static Point origin = new Point(0, 0);
	
	/* ��+������õ��������ַ��� */
	//Override
	public String toString() { return "(" + x + "," + y + ")"; }
	
	/* ��������Xֵ */
	public double getX() {
		return x;
	}

	/* ��������Yֵ */
	public double getY() {
		return y;
	}
}
