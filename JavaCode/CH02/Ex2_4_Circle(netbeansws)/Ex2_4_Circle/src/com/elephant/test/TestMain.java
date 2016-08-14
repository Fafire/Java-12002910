package com.elephant.test;

import com.elephant.circle.Circle;
import com.elephant.circle.Point;

public class TestMain {
    public static void main(String[] args) {
	Point p = new Point(1, 1);
        double r = 1.5;
	System.out.println("鍦嗗績鐨勫潗鏍囷細" + p.toString());

      	Circle c = new Circle(p, r);
		
	System.out.println("鍦嗙殑鍛ㄩ暱锛�" + c.getPerimeter());
	System.out.println("鍦嗙殑闈㈢Н锛�" + c.getArea());
		
	if(c.isInner(Point.origin)) {
		System.out.println("鍘熺偣鍦ㄥ渾涓�");
        }

	Point p2 = new Point(-0.5, -0.5);
	if(c.isInner(p2)) {
		System.out.println(p2.toString() + "鍦ㄥ渾涓�");
        } else {
		System.out.println(p2.toString() + "涓嶅湪鍦嗕腑");
        }
    }
}
