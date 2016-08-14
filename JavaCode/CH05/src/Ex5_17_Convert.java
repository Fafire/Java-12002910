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
public class Ex5_17_Convert {

	public static void main(String[] args) {
		C c = new D();//父类引用指向子类对象
		c.n = 3.1415926;//修改是父类引用的被隐藏的变量
		//c.w = 300;//A 行，父类引用不能操作子类对象新增的成员变量
		//c.cry();//B行,父类引用不能操作子类对象新增的成员方法
		c.m = 186;
		c.f();
		c.g();//C行，c实际是一个子类对象，因此实际调用的是子类的g（）方法
		
		D d=(D) c;//将c强制转换为子类对象
		d.n=555;
		d.f();
		d.g();
		d.cry();
		
	}
}

class C {
	int m;
	double n;
	void f(){
		System.out.println("被子类继承的方法f()");
	}
	void g(){
		System.out.println("你好，n="+n+"  m="+m);
	}
	
}

class D extends C{
	int w=100;
	int n=12;
	void g(){
		System.out.println("子类重写方法g(),n="+n+"  m="+m);	
	}
	void cry(){
		System.out.println("子类新增的方法");
	}
	
}
