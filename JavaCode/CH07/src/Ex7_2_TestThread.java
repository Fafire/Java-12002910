public class Ex7_2_TestThread extends Thread{
	String threadName;
	public Ex7_2_TestThread(String threadName)
	{	System.out.println("���̵߳�����:" + threadName );
		this.threadName=threadName; 
	}
	public void run()
	{
		for(int i=0; i<3; i++) 
		{System.out.println("�������е��߳���"+ threadName);
		  try {
			  Thread.sleep((int)(Math.random() * 1000));
		  }
		  catch (InterruptedException ex ) 
		  {
				System.err.println(ex.toString());
		  } 
		}//for
	}//run
	public static void main(String[] args)
	{
		System.out.println("��ʼ����������!"); 
		Ex7_2_TestThread thread1 = new Ex7_2_TestThread("����");
		Ex7_2_TestThread thread2 = new Ex7_2_TestThread("�����");
		thread1.start();
		thread2.start();
		System.out.println("���������н���!");
	}//main()
}
