// Ex10_17_LinkedList.java
import java.util.*;
public class Ex10_17_LinkedList {
  public static void main(String args[]){
	LinkedList list=new LinkedList();  
	list.add("����");                  //����������Ԫ��
	list.add("����");
	list.add("");
	list.add("����");
	list.add("����");
	int size=list.size();              //��ȡ���еĽ�����
	System.out.println("�����й���"+size+"��Ԫ��,�ֱ�Ϊ��");
	for(int i=0;i<size;i++){
	  if(list.get(i)==""){
	    list.set(i, "�����");         //�������еĿ��ַ��滻Ϊ"�����"
	  } 
	}
	System.out.println(list);         //��������е�Ԫ��
  }
}
