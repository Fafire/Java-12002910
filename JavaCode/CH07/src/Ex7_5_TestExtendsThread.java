public class Ex7_5_TestExtendsThread {
	public static void main(String[] args) {

		Master1 master1 = new Master1("����");
		master1.start();
		//Student1 student = new Student1("�����");
		//student.start();
	}
}

class Master1 extends Student1 {
	Master1(String Name) {
		super(Name);
	}

	public void printInformation() { // ���Ǹ���ķ���,ʵ���ض��Ĺ��ܡ�
		System.out.println("����һ���о���!�ҽ�" + this.Name);
	}
}

class Student1 extends Thread {
	String Name;

	public Student1(String Name) {
		this.Name = Name;
	}

	public void printInformation() {
		System.out.println("����һ����ѧ��!�ҽ�" + this.Name);
	}

	public void run() {
		printInformation();
	}
}