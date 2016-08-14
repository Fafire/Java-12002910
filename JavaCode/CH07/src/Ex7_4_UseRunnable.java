public class Ex7_4_UseRunnable {

	public static void main(String[] args) {

		Master master = new Master("����");
		Thread thread= new Thread(master);
		thread.start();

	}
}

class Master extends Student implements Runnable {

	Master(String Name) {
		super(Name);
	}

	public void printInformation() { //���Ǹ���ķ���,ʵ���ض��Ĺ��ܡ�
		System.out.println("����һ���о���!�ҽ�" + this.Name);
	}
	public void run() {
		printInformation();
	}
}

class Student {
	String Name;
	public Student(String Name) {
		this.Name = Name;
	}

	public void printInformation() {
		System.out.println("����һ����ѧ��!�ҽ�" + this.Name);
	}
}
