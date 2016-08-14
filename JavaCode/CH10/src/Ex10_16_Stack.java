// Ex10_16_Stack.java
import java.util.*;
public class Ex10_16_Stack {
	  public static void main(String args[]){
		Stack stack=new Stack();                //创建一个Stack实例
		stack.push("张三");                     //入栈
		stack.push("李四");
		stack.push("王五");
		stack.push("赵六");
		int index=stack.search("王五");         //查找元素”王五”
		if(index>0){
			System.out.println("‘王五’是栈中的第"+index+"个元素");
			}
		else System.out.println("栈中不存在'王五'");
		System.out.println("栈中的元素分别为：");
	    while(!stack.empty())                  //当栈不为空时，出栈
		System.out.println(stack.pop());
	}
}
