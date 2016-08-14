public class Ex7_10_UseSynchronized {
	public static void main(String[] args) {
		int size = 100;
		for (int t = 0; t < 5; t++) {
			Sum sum = new Sum(0);
			AddOneThread[] rathread = new AddOneThread[size];
			for (int i = 0; i < size; i++) {
				try {
					rathread[i] = new AddOneThread(sum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}// for

			// 必须有这段代码，否则有可能主线程未等到子线程运行完就输出结果。
			for (int i = 0; i < size; i++) {
				try {
					rathread[i].join();
				} catch (InterruptedException ex) {
					System.err.println(ex.toString());
				}
			}
			System.out.println("第" + (t + 1) + "次,sum=" + sum.sum);
		}// for

	}// main
}// class

class AddOneThread extends Thread {
	Sum sum;

	public AddOneThread(Sum sum) {
		this.sum = sum;
		start();
	}

	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			System.err.println(ex.toString());
		}
		sum.addOne();
	}// run
}

class Sum {
	int sum;

	public Sum(int sum) {
		this.sum = sum;
	}

	public void addOne() {
		// synchronized(this){
		sum += 1;// }
	}
}
