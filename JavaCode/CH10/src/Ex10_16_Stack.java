// Ex10_16_Stack.java
import java.util.*;
public class Ex10_16_Stack {
	  public static void main(String args[]){
		Stack stack=new Stack();                //����һ��Stackʵ��
		stack.push("����");                     //��ջ
		stack.push("����");
		stack.push("����");
		stack.push("����");
		int index=stack.search("����");         //����Ԫ�ء����塱
		if(index>0){
			System.out.println("�����塯��ջ�еĵ�"+index+"��Ԫ��");
			}
		else System.out.println("ջ�в�����'����'");
		System.out.println("ջ�е�Ԫ�طֱ�Ϊ��");
	    while(!stack.empty())                  //��ջ��Ϊ��ʱ����ջ
		System.out.println(stack.pop());
	}
}
