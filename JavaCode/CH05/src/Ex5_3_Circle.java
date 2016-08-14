/*
 * 创建日期 2012-7-19
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xiang
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
// Circle测试类
public class Ex5_3_Circle {
	public static void main(String[] args){
		Circle c1,c2;              //声明c1和c2为Circle对象
		c1 = new Circle(10);      //创建c1
		c2 = new Circle(10);      //创建c2
		c2.setRadius(40);         //调用c2的修改半径方法，并不影响c1的成员变量状态
		System.out.println("c1半径="+c1.getRadius()+"\tc2半径="+c2.getRadius());
		System.out.println("c1面积="+c1.getArea()+"\tc2面积="+c2.getArea());
	}
	

}
//定义Circle类
class Circle {
	private double radius;
	
	public Circle(double r){          //构造方法
		radius = r;
	}
	
	public void setRadius(double r){ //设定半径
		radius = r;		
	}
	
	public double getRadius(){        //修改半径
		return radius;
	}
	
	public double getArea() {        //计算面积
		final double PI = 3.14;
		double area;
		area = PI * radius * radius;
		return area;
	}
}
