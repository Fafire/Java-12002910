/*
 * 创建日期 2012-7-27
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
public class Ex5_19_Convert3 {

	public static void main(String[] args) {
		Lady missLiu= new Lady();
		missLiu.pet = new Dog2();
		missLiu.petEnjoy();
		
		Lady missWang= new Lady();
		missWang.pet = new Bird();
		missWang.petEnjoy();
		
	}
}

class Lady{
	Pet pet;
	void petEnjoy(){
		pet.enjoy();
	}
}

class Pet{
	int name;
	void enjoy(){
		System.out.println("宠物高兴");
	}
}

class Bird extends Pet{
	void enjoy(){
		System.out.println("喳喳......");
	}	
}

class Dog2 extends Pet{
	void enjoy(){
		System.out.println("汪汪.....");
	}
	
}