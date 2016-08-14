// Ex10_12_ArraryList.java
import java.util.*;
public class Ex10_12_ArraryList {
  public static void main(String args[]){
		ArrayList<String> list=new ArrayList<String>();
		list.add("001");
		list.add("002");	
		list.add("003");
		list.add("004");
		list.add("005");
		list.add("003");     //重复元素，允许加入
		System.out.println("此列表中的元素分别为："+list);   //输出列表中的元素
		System.out.println("此列表中的元素个数为："+list.size());  //输出元素个数  
  }
}
