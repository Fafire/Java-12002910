/* ====================================================================
 * 文件：Ex7_12_TestProducerConsumer.java 
 * 描述：生产者－消费者 
 * 包含五个类：主控类Ex7_12_TestProducerConsumer，共享数据控制类ShareData，
 * 共享数据类MyData，生产者Producer和消费者Consumer
 * ====================================================================
 */
// 主控类
public class Ex7_12_TestProducerConsumer {

	public static void main(String[] args) {
		ShareData s = new ShareData();
		new Consumer(s).start();
		new Producer(s).start();
	}
}

// 共享数据类
class MyData {
	// 可以扩展，表达复杂的数据
	public int data;
}

// 共享数据控制类
class ShareData {
	// 共享数据
	private MyData data;
	// 通知变量
	private boolean writeable = true;

	// -------------------------------------------------------------------------
	// 需要注意的是：在调用wait()方法时，需要把它放到一个同步段里，否则将会出现
	// "java.lang.IllegalMonitorStateException: current thread not owner"的异常。
	// -------------------------------------------------------------------------
	public synchronized void setShareData(MyData data) {
		if (!writeable) {
			try {
				// 若为未消费则等待
				wait();
			} catch (InterruptedException e) {
			}
		}

		this.data = data;
		// 标记已经生产
		writeable = false;
		// 通知消费者已经生产，可以消费
		notify();
	}

	public synchronized MyData getShareData() {
		if (writeable) {
			try {
				// 若未生产则等待
				wait();
			} catch (InterruptedException e) {
			}
		}
		// 标记已经消费
		writeable = true;
		// 通知需要生产
		notify();
		return this.data;
	}
}

// 生产者线程类
class Producer extends Thread {

	private ShareData s;

	Producer(ShareData s) {
		this.s = s;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep((int) Math.random() * 100);
			} catch (InterruptedException e) {
			}
			MyData mydata = new MyData();
			mydata.data = i;
			s.setShareData(mydata);
			System.out.println("生产者产生一条数据:" + mydata.data + ".");
		}// for
	}// run
}

// 消费者线程类
class Consumer extends Thread {

	private ShareData s;

	Consumer(ShareData s) {
		this.s = s;
	}

	public void run() {
		MyData mydata;

		do {
			try {
				Thread.sleep((int) Math.random() * 100);
			} catch (InterruptedException e) {
			}

			mydata = s.getShareData();
			System.out.println("消费者消费一条数据:" + mydata.data + ".");
		} while (mydata.data <= 10);
	}//run
}