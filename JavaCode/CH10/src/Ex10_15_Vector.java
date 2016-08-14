// Ex10_15_Vector.java
import java.util.Vector;
public class Ex10_15_Vector {
	  public static void main(String args[]){
		 Vector<String> vct=new Vector<String>();      //创建Vector对象,默认长度为10
		 vct.add("计算机1班");
		 vct.add("计算机2班");		 
		 vct.add("计算机3班");	
		 System.out.println("向量初始元素为："+vct);
		 System.out.println("该向量的空间大小为："+vct.capacity());
		 System.out.println("该向量的元素个数为："+vct.size());	
		 vct.setSize(5);                               //设置向量长度为5
		 System.out.println("第一次修改后向量元素为："+vct);
		 System.out.println("该向量的空间大小为："+vct.capacity());
		 System.out.println("该向量的元素个数为："+vct.size());		 
		 vct.setSize(2);		                       //设置向量长度为2
		 System.out.println("第二次修改后向量元素为："+vct);
		 System.out.println("该向量的空间大小为："+vct.capacity());
		 System.out.println("该向量的元素个数为："+vct.size());			 		 		 		 
	  }
}
