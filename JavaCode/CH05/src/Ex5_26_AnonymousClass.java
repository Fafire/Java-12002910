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

public class Ex5_26_AnonymousClass {

	public static void main(String[] args) {
		A a= new A();
		a.f(new Show(){
			public void show(){
				System.out.println("实现了接口的匿名类");
			}
			
		}
		);
	}
}

interface Show{
	public void show();
}

class A{
	void f(Show s){
		s.show();
	}
}
