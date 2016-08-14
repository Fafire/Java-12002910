// Ex10_9_TestRunTime.java
public class Ex10_9_TestRunTime {
  public static void main(String args[]){
	Long timeStart=System.currentTimeMillis();  //记录开始的时间值
	int sum=0;
	for(int i=1;i<=100;i++){                    //循环计算1+2+...+100的值
		sum=sum+i;
	}
	Long timeEnd=System.currentTimeMillis();    //记录结束的时间值
	System.out.println("1+2+...+100="+sum);
	System.out.println("程序运行时间为："+(timeEnd-timeStart)); //输出程序运行时间
  }
}
