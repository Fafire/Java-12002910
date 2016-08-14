public class Ex7_4_UseRunnable {

	public static void main(String[] args) {

		Master master = new Master("如来");
		Thread thread= new Thread(master);
		thread.start();

	}
}

class Master extends Student implements Runnable {

	Master(String Name) {
		super(Name);
	}

	public void printInformation() { //覆盖父类的方法,实现特定的功能。
		System.out.println("我是一名研究生!我叫" + this.Name);
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
		System.out.println("我是一名大学生!我叫" + this.Name);
	}
}
