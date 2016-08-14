// Ex10_3_FloatIsNaN.java
public class Ex10_3_FloatIsNaN {
	public static void main(String args[]){
	   Float number1=new Float(16.0);
	   Float number2=new Float(0.0);
	   Float number3=new Float(0.0);
       Float num=number2/(number2+number3);
       System.out.println(number1.isNaN());          //number不是非数字（NaN）值  
       System.out.println(num.isNaN());              //num是非数字（NaN）值
	}
}
