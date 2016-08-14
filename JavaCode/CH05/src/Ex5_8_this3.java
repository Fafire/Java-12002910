/*
 * 创建日期 2012-7-26
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
public class Ex5_8_this3 {
	public static void main(String[] args){
		Dog tom = new Dog();
		System.out.println("新生的tom 身高:"+tom.height+"cm, 年龄:"+tom.age);
		tom=tom.grow();
		System.out.println("长大后的tom 身高:"+tom.height+"cm, 年龄:"+tom.age);
	}

}

class Dog{
	int age;
	float height;
	public Dog(){
		age=1;
		height=10;		
		
	}
	
	public Dog grow(){
		height = height+10;		
		age++;
		return this;
	}
}
