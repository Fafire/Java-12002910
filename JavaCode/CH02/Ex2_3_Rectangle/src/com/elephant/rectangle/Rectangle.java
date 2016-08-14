package com.elephant.rectangle;

/**
 * 
 * @类名：Point
 * @类简介：矩形类，可以初始化其对角的两个坐标点point1和point2。
 * @编程人： 林福平
 * @编程日期：2012-8-9
 * @修改日期：2012-8-9
 *
 */

public class Rectangle {
	Point point1, point2;

	/* 构造函数之一：用两个坐标点进行矩阵的初始化 */
	public Rectangle(Point p1, Point p2) {
		this.point1 = new Point(p1.getX(), p1.getY());
		this.point2 = new Point(p2.getX(), p2.getY());
	}
	
	/* 构造函数之二：用两个坐标点的值进行矩阵的初始化 */
	public Rectangle(double x1, double y1, double x2, double y2) {
		this.point1 = new Point(x1, y1);
		this.point2 = new Point(x2, y2);
	}
	
	/* 计算矩形的周长 */
	public double getCircumference() {
		return 2 * Math.abs(point1.getX() - point2.getX())
				+ 2 * Math.abs(point1.getY() - point2.getY());
	}
	
	/* 计算矩形的面积 */
	public double getArea() {
		return Math.abs(point1.getX() - point2.getX())
				* Math.abs(point1.getY() - point2.getY());
	}
	
	/* 计算矩形的对角线长 */
	public double getDiagonal() {
		double width = Math.abs(point1.getX() - point2.getX());
		double height = Math.abs(point1.getY() - point2.getY());
		return Math.sqrt(width * width + height * height);
	}
	
	/* 判定一个坐标点是否在矩形之内 */
	public boolean isInner(Point p) {
		if((Math.min(point1.getX(), point2.getX()) <= p.getX()) 
				&& (p.getX() <= Math.max(point1.getX(), point2.getX()))
				&& (Math.min(point1.getY(), point2.getY()) <= p.getY())
				&& (p.getY() <= Math.max(point1.getY(), point2.getY())))
			return true;
		else
			return false;
	}
}
