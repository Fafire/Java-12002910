public class Ex7_2_TestThread extends Thread{
	String threadName;
	public Ex7_2_TestThread(String threadName)
	{	System.out.println("本线程的名字:" + threadName );
		this.threadName=threadName; 
	}
	public void run()
	{
		for(int i=0; i<3; i++) 
		{System.out.println("正在运行的线程是"+ threadName);
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
		System.out.println("开始运行主函数!"); 
		Ex7_2_TestThread thread1 = new Ex7_2_TestThread("如来");
		Ex7_2_TestThread thread2 = new Ex7_2_TestThread("孙悟空");
		thread1.start();
		thread2.start();
		System.out.println("主函数运行结束!");
	}//main()
}
