/*
 * 创建日期 2012-8-5
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
abstract class Student3{
	abstract void speak();
}

class Teacher2{
	void look(Student3 s){
		s.speak();
	}
}

public class Ex5_25_AnonymousClass {
	
	public static void main(String[] args) {
		
			Teacher2 zhang = new Teacher2 ();
			Student3 liu =new Student3(){
				void speak(){
					System.out.println("这是匿名类中的方法");
				}
			};//匿名类体结束
			zhang.look( liu);
					
	}
}
