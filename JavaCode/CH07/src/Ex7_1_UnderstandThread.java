public class Ex7_1_UnderstandThread {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		myThread1.start();
		MyThread myThread2 = new MyThread();
		myThread2.start();
		for (int i = 0; i < 10; i++)
			System.out.print("主函数第" + (i + 1) + "次输出!  ");
	}
}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.print(this.getName() + "第" + (i + 1) + "次输出!  ");
	}
}
