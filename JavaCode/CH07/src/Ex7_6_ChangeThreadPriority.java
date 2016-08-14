public class Ex7_6_ChangeThreadPriority extends Thread {
	String threadName;
	public Ex7_6_ChangeThreadPriority(String threadName)
	{	System.out.println("本线程的名字:" + threadName );
		this.threadName=threadName; 
		System.out.println("创建线程\""+this.threadName+"\"时的优先级是"+this.getPriority());	
	}
	public void run()
	{
		System.out.println("正在运行的线程\""+this.threadName+"\"的优先级是"+this.getPriority());

	}//run
	public static void main(String[] args)
	{
		System.out.println("开始运行主函数!"); 
		Ex7_6_ChangeThreadPriority thread1 = new Ex7_6_ChangeThreadPriority("如来");
		Ex7_6_ChangeThreadPriority thread2 = new Ex7_6_ChangeThreadPriority("孙悟空");
		thread1.start();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
		thread2.setPriority(MAX_PRIORITY);
		System.out.println("主函数运行结束!");
	}//main()
}
