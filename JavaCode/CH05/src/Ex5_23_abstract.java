/*
 * 创建日期 2012-8-4
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
public class Ex5_23_abstract {

	public static void main(String[] args) {
		// Animal a= new Animal();//A 行，禁止实例化抽象类
		Cat2 tom =new Cat2();
		tom.eat();
		tom.run();
		
	}
}

abstract class Animal{
	String eyeColor;
	String furColor;
	int age;
	
	public Animal(){
		age=0;
	}
	
	abstract void  eat();
	abstract void run();
	
}

class Cat2 extends Animal{
	void run(){
		System.out.println("猫扑");
	}
	void eat(){
		System.out.println("吃老鼠");
		
	}
}

/*abstract class Mammal extends Animal {
	int viviparousAmount; 
	
}*/
