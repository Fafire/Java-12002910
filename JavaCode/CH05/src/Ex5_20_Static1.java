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
public class Ex5_20_Static1 {

	public static void main(String[] args) {
		 System.out.println("目前出生的人数:"+Person3.totalNum);
		 Person3 wang = new  Person3("Wang");
		 Person3 liu = new  Person3("Liu");
		 Person3 zhao = new  Person3("Zhao");
		 
		 System.out.println("目前出生的人数:"+Person3.totalNum);
		 System.out.println("目前出生的人数:"+wang.totalNum);
		 
		 
		
	}
}

class Person3{
	static long totalNum=10000;
	int age;
	String name;
	String id;
	
	public Person3(String name){
		totalNum++;
		this.name=name;
		age=1;
	}
	
}
