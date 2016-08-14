public class Ex7_8_CurrentThreadName {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		System.out.println("当前线程的名字是："+thread.getName());
		ShowCurrentThreadName cthread=new ShowCurrentThreadName();
		cthread.start();
	}
}//class Ex7_8_CurrentThreadName

class ShowCurrentThreadName extends Thread{
	public void run(){
		System.out.println("这个线程的名字是："+this.getName());
		Thread thread=Thread.currentThread();
		System.out.println("当前线程的名字是："+thread.getName());
	}
}//class ShowCurrentThreadName
