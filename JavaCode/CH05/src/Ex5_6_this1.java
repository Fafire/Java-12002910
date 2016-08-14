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
public class Ex5_6_this1 {
	public static void main(String[] args){
		Cat garfield = new Cat("黄",12);
		garfield.grow();
		garfield.grow();
	}

}
class Cat {
	String furColor;
	int height;
	
	public Cat(String color) {
		this.furColor = color;//通过this访问成员变量
		this.cry();// 通过this调用成员方法
		
	}
	public Cat(String color,int height) {
		this(color);//通过this调用其他构造方法
		this.height=height;// 通过this调用成员变量
		
	}
	public void cry(){
		System.out.println(" 我是一只"+this.furColor+"颜色的猫");
	}
	public void grow(){
		this.height++;//通过this访问成员变量
		System.out.println("我长高了，身高为"+this.height);
	}
	
}
