public class Ex7_7_ShowThreadName {
	public static void main(String[] args) {
	ShowThreadName defaultName=new ShowThreadName();
	ShowThreadName name=new ShowThreadName("���� ");
	defaultName.start();
	name.start();
	}// main
}//public class Ex7_7_ShowThreadName 	

class ShowThreadName extends Thread{
	public ShowThreadName(){
		super();
	}
	public ShowThreadName(String name){
		super(name);
	}
	public void run(){
		System.out.println("����̵߳������ǣ�"+this.getName());
	}
}//class ShowThreadName

