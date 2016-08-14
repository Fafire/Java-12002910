package com.elephant.circle;

/**
 * 
 * @绫诲悕锛歅oint
 * @绫荤畝浠嬶細鍧愭爣鐐圭被锛屽彲浠ュ垵濮嬪寲鍏跺潗鏍噚鍜寉銆�
 * @缂栫▼浜猴細 鏋楃骞�
 * @缂栫▼鏃ユ湡锛�2012-8-9
 * @淇敼鏃ユ湡锛�2012-8-10
 *
 */

public class Point {
	double x, y;

	public Point(double x, double y) { this.x = x; this.y = y; }
	
	/* 绫诲垵濮嬪寲鏃讹紝鍒涘缓涓�涓師鐐瑰疄渚� */
	public static Point origin = new Point(0, 0);
	
	/* 鐢�+杩愮畻绗﹀緱鍒板潗鏍囩偣鐨勫瓧绗︿覆 */
        //@Override
	public String toString() { return "(" + x + "," + y + ")"; }
	
	/* 鑾峰緱鍧愭爣鐨刋鍊� */
	public double getX() {
		return x;
	}

	/* 鑾峰緱鍧愭爣鐨刌鍊� */
	public double getY() {
		return y;
	}
}
