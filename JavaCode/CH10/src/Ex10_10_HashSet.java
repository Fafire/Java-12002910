// Ex10_10_HashSet.java
import java.util.*;
public class Ex10_10_HashSet {
  public static void main(String args[]){
	HashSet<String> hash=new HashSet<String>();
	hash.add("001");
	hash.add("002");	
	hash.add("003");
	hash.add("004");
	hash.add("005");
	hash.add("003");     //重复元素，未被加入
	System.out.println("此哈希集中的元素分别为："+hash);   //输出哈希集中的元素
	System.out.println("此哈希集中的元素个数为："+hash.size());  //输出元素个数
  }
}
