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
public class Ex5_7_this2 {
	int x=188,y;
	public static void main(String[] args){
		Ex5_7_this2 e= new Ex5_7_this2();
		e.f();
	}
	void f(){
		int x=3;
		y=x;//y得到的值是3，而非成员变量x的值（188）
		System.out.println("y="+y);
		
		y=this.x;//y得到的值是非成员变量x的值，即：188
		System.out.println("y="+y);
	}

}
