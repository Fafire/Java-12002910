// Ex10_8_SystemRead.java
import java.io.IOException;                        
public class Ex10_8_SystemRead {
  public static void main(String args[]) throws IOException{
	  char ch;
	  System.out.println("������һ���ַ���");
	  ch=(char)System.in.read();                     //�Ӽ��̶���һ���ַ�
	  System.out.println("��������ַ�Ϊ��"+ch);      //������ַ�
  }
}
