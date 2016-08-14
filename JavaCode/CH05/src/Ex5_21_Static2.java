/*
 * 创建日期 2012-7-31
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
public class Ex5_21_Static2 {

	public static void main(String[] args) {
		System.out.println(staticTestFunction.addUP(10,5));//正确 ，类方法可以被类直接调用
		//System.out.println(staticTestFunction.sub());//错误 ，实例方法不能被类直接调用
		staticTestFunction test = new staticTestFunction();
		System.out.println(test.sub());
		
		
	}
}

class staticTestFunction{
	int x=10,y=6;
	static int z=9;
	
	
	public static int addUP(int a,int b){ //被声明为类方法
		
		return a+b+z;//类方法中能使用类变量
	}
	
	public final int sub(){
		
		return x-y;
	}
	/*public static int addUP(){ //被声明为类方法
		return x+y;//错误,类方法中不能使用实例变量
	}*/
	
	
}


