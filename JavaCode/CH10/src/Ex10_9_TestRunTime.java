// Ex10_9_TestRunTime.java
public class Ex10_9_TestRunTime {
  public static void main(String args[]){
	Long timeStart=System.currentTimeMillis();  //��¼��ʼ��ʱ��ֵ
	int sum=0;
	for(int i=1;i<=100;i++){                    //ѭ������1+2+...+100��ֵ
		sum=sum+i;
	}
	Long timeEnd=System.currentTimeMillis();    //��¼������ʱ��ֵ
	System.out.println("1+2+...+100="+sum);
	System.out.println("��������ʱ��Ϊ��"+(timeEnd-timeStart)); //�����������ʱ��
  }
}
