// Ex10_17_LinkedList.java
import java.util.*;
public class Ex10_17_LinkedList {
  public static void main(String args[]){
	LinkedList list=new LinkedList();  
	list.add("张三");                  //向队列中添加元素
	list.add("李四");
	list.add("");
	list.add("王五");
	list.add("赵六");
	int size=list.size();              //获取队列的结点个数
	System.out.println("队列中共有"+size+"个元素,分别为：");
	for(int i=0;i<size;i++){
	  if(list.get(i)==""){
	    list.set(i, "待添加");         //将队列中的空字符替换为"待添加"
	  } 
	}
	System.out.println(list);         //输出队列中的元素
  }
}
