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
		list.add("003");     //�ظ�Ԫ�أ��������
		System.out.println("���б��е�Ԫ�طֱ�Ϊ��"+list);   //����б��е�Ԫ��
		System.out.println("���б��е�Ԫ�ظ���Ϊ��"+list.size());  //���Ԫ�ظ���  
  }
}
