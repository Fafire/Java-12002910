import java.util.Scanner;
public class Ex6_8_DefineException {
	public static void main(String[] args) {
		final int MIN=25,MAX=40;
		Scanner scan=new Scanner(System.in);
		OutOfRangException problem=new OutOfRangException();
		System.out.print("输入"+MIN+"至"+MAX+"之间的整数：");
		try{
			int value=scan.nextInt();
			if(value<MIN||value>MAX)
				throw problem;                  //抛出自定义异常
		}catch(OutOfRangException e){
			System.out.println(e.toString());
		}
		System.out.println("主方法结束.");
	}
}
//自定义一个异常类，类名为：OutOfRangException
class OutOfRangException extends Exception{
	OutOfRangException(){
		super("输入数据超出范围！");
	}
}
