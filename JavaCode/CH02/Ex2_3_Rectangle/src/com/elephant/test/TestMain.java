package com.elephant.test;

import com.elephant.rectangle.Point;
import com.elephant.rectangle.Rectangle;

public class TestMain {
	public static void main(String[] args) {
		Point p1 = new Point(-1, -1);
		Point p2 = new Point(2, 3);
		
		System.out.println("p1的坐标：" + p1.toString());
		System.out.println("p2的坐标：" + p2.toString());

		Rectangle r = new Rectangle(p1, p2);
		
		System.out.println("矩形的周长：" + r.getCircumference());
		System.out.println("矩形的面积：" + r.getArea());
		System.out.println("矩形的对角线长：" + r.getDiagonal());
		
		if(r.isInner(Point.origin))
			System.out.println("原点在矩形中");

		Point p3 = new Point(-1.5, -1.5);
		if(r.isInner(p3))
			System.out.println(p3.toString() + "在矩形中");
		else
			System.out.println(p3.toString() + "不在矩形中");
	}
}
