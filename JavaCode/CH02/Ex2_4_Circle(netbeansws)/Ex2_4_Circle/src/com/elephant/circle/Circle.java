package com.elephant.circle;

/**
 * 
 * @绫诲悕锛欳ircle
 * @绫荤畝浠嬶細鍦嗙被锛屽彲浠ュ垵濮嬪寲鍏跺師鐐瑰潗鏍囧拰鍗婂緞銆�
 * @缂栫▼浜猴細 鏋楃骞�
 * @缂栫▼鏃ユ湡锛�2012-8-10
 * @淇敼鏃ユ湡锛�2012-8-10
 *
 */

public class Circle {
    Point center;
    double radius;
    
    /* 鏋勯�犲嚱鏁帮細鐢ㄥ渾蹇冨潗鏍囧拰鍗婂緞鍒濆鍖� */
    public Circle(Point p, double r) {
        this.center = new Point(p.getX(), p.getY());
        this.radius = r;
    } 
    
    /* 璁＄畻鍦嗙殑鍛ㄩ暱 */
    public double getPerimeter() {return 2 * Math.PI * radius;}
    
    /* 璁＄畻鍦嗙殑闈㈢Н */
    public double getArea() {return Math.PI * radius * radius;}
    
    /* 鍒ゅ畾涓�涓潗鏍囩偣鏄惁鍦ㄥ渾涔嬪唴 */
    public boolean isInner(Point p) {
        double deltaX = Math.abs(center.getX()-p.getX());
        double deltaY = Math.abs(center.getY()-p.getY());
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	if(distance < radius) {
            return true;
        } else {
            return false;
	}
    }
}
