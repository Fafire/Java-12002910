/*
 * 创建日期 2012-7-21
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
public class Ex5_5_ConstructorOverload {
	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		System.out.println("p1的原点为 ("+p1.x+","+p1.y+")");
		System.out.println("p2的原点为 ("+p2.x+","+p2.y+")");
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
