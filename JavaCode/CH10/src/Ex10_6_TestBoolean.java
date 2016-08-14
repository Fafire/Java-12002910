// Ex10_6_TestBoolean.java
public class Ex10_6_TestBoolean {
  public static void main(String args[]){
	Boolean b1=new Boolean("true");	         //创建Boolean对象
	Boolean b2=new Boolean("false");
	Boolean b3=new Boolean("Hello");
	Boolean b[]={b1,b2,b3};                //创建一个Boolean数组
    for(int i=0;i<b.length;i++){            //循环输出各元素对应的Boolean值
      System.out.println("b"+(i+1)+":"+b[i].booleanValue());
    }
  }
}
