public class Ex7_9_UseJoin {
	public static void main(String[] args) {
		System.out.println("���߳�����ִ��,���������߳�!");
		RunThread rthread = new RunThread();
		try {
		rthread.join();
		//rthread.join(2000);     //���ȴ�2����
		} catch (InterruptedException ex) {
			System.err.println(ex.toString());
		}
		System.out.println("���߳���ֹ,���̼߳���ִ��!");
	}
}// Ex7_9_UseJoin

class RunThread extends Thread {
	RunThread() {
		start();
	}

	public void run() {
		System.out.println("���̵߳������ǣ�" + this.getName() + ",�ѿ�ʼ����,Ԥ��ִ��3��!");
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException ex) {
			System.err.println(ex.toString());
		}
		System.out.println("���߳�׼����������˳� !");
	}
}
