public class Ex7_6_ChangeThreadPriority extends Thread {
	String threadName;
	public Ex7_6_ChangeThreadPriority(String threadName)
	{	System.out.println("���̵߳�����:" + threadName );
		this.threadName=threadName; 
		System.out.println("�����߳�\""+this.threadName+"\"ʱ�����ȼ���"+this.getPriority());	
	}
	public void run()
	{
		System.out.println("�������е��߳�\""+this.threadName+"\"�����ȼ���"+this.getPriority());

	}//run
	public static void main(String[] args)
	{
		System.out.println("��ʼ����������!"); 
		Ex7_6_ChangeThreadPriority thread1 = new Ex7_6_ChangeThreadPriority("����");
		Ex7_6_ChangeThreadPriority thread2 = new Ex7_6_ChangeThreadPriority("�����");
		thread1.start();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
		thread2.setPriority(MAX_PRIORITY);
		System.out.println("���������н���!");
	}//main()
}
