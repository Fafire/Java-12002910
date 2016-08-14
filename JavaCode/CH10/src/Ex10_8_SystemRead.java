// Ex10_8_SystemRead.java
import java.io.IOException;                        
public class Ex10_8_SystemRead {
  public static void main(String args[]) throws IOException{
	  char ch;
	  System.out.println("请输入一个字符：");
	  ch=(char)System.in.read();                     //从键盘读入一个字符
	  System.out.println("您输入的字符为："+ch);      //输出该字符
  }
}
