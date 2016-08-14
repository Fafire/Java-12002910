public class Ex7_5_TestExtendsThread {
	public static void main(String[] args) {

		Master1 master1 = new Master1("如来");
		master1.start();
		//Student1 student = new Student1("孙悟空");
		//student.start();
	}
}

class Master1 extends Student1 {
	Master1(String Name) {
		super(Name);
	}

	public void printInformation() { // 覆盖父类的方法,实现特定的功能。
		System.out.println("我是一名研究生!我叫" + this.Name);
	}
}

class Student1 extends Thread {
	String Name;

	public Student1(String Name) {
		this.Name = Name;
	}

	public void printInformation() {
		System.out.println("我是一名大学生!我叫" + this.Name);
	}

	public void run() {
		printInformation();
	}
}