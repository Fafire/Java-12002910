// Ex10_15_Vector.java
import java.util.Vector;
public class Ex10_15_Vector {
	  public static void main(String args[]){
		 Vector<String> vct=new Vector<String>();      //����Vector����,Ĭ�ϳ���Ϊ10
		 vct.add("�����1��");
		 vct.add("�����2��");		 
		 vct.add("�����3��");	
		 System.out.println("������ʼԪ��Ϊ��"+vct);
		 System.out.println("�������Ŀռ��СΪ��"+vct.capacity());
		 System.out.println("��������Ԫ�ظ���Ϊ��"+vct.size());	
		 vct.setSize(5);                               //������������Ϊ5
		 System.out.println("��һ���޸ĺ�����Ԫ��Ϊ��"+vct);
		 System.out.println("�������Ŀռ��СΪ��"+vct.capacity());
		 System.out.println("��������Ԫ�ظ���Ϊ��"+vct.size());		 
		 vct.setSize(2);		                       //������������Ϊ2
		 System.out.println("�ڶ����޸ĺ�����Ԫ��Ϊ��"+vct);
		 System.out.println("�������Ŀռ��СΪ��"+vct.capacity());
		 System.out.println("��������Ԫ�ظ���Ϊ��"+vct.size());			 		 		 		 
	  }
}
