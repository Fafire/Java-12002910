package com.elephant.rectangle;

/**
 * 
 * @类名：Point
 * @类简介：坐标点类，可以初始化其坐标x和y。
 * @编程人： 林福平
 * @编程日期：2012-8-9
 * @修改日期：2012-8-10
 *
 */

public class Point {
	double x, y;

	public Point(double x, double y) { this.x = x; this.y = y; }
	
	/* 类初始化时，创建一个原点实例 */
	public static Point origin = new Point(0, 0);
	
	/* 用+运算符得到坐标点的字符串 */
	//Override
	public String toString() { return "(" + x + "," + y + ")"; }
	
	/* 获得坐标的X值 */
	public double getX() {
		return x;
	}

	/* 获得坐标的Y值 */
	public double getY() {
		return y;
	}
}
