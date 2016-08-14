// Ex10_11_TreeSet.java
import java.util.TreeSet;
public class Ex10_11_TreeSet {
	 public static void main(String args[]){
			TreeSet<String> tree=new TreeSet<String>();
			tree.add("001");
			tree.add("002");	
			tree.add("003");
			tree.add("004");
			tree.add("005");
			tree.add("003");     //重复元素，未被加入
			System.out.println("此树集中的元素分别为："+tree);   //输出树集中的元素
			System.out.println("此树集中的元素个数为："+tree.size());  //输出元素个数
		  }
}
