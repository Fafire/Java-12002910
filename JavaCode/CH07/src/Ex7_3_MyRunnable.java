public class Ex7_3_MyRunnable implements Runnable {
	String threadName;

	public Ex7_3_MyRunnable(String threadName) {
		System.out.println("���̵߳�����:" + threadName);
		this.threadName = threadName;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("�������е��߳���" + threadName);
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException ex) {
				System.err.println(ex.toString());
			}
		}// for
	}// run

	public static void main(String[] args) {
		System.out.println("��ʼ����������!");
		Ex7_3_MyRunnable myRunnable1 = new Ex7_3_MyRunnable("����");
		Ex7_3_MyRunnable myRunnable2 = new Ex7_3_MyRunnable("�����");
		Thread thread1 = new Thread(myRunnable1);
		Thread thread2 = new Thread(myRunnable2);
		thread1.start();
		thread2.start();
		System.out.println("���������н���!");
	}// main()
}
