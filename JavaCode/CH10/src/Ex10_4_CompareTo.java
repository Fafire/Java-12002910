// Ex10_4_CompareTo.java
public class Ex10_4_CompareTo {
	public static void main(String args[]){
	    Double number=5.34;
		int a=number.compareTo(7.38);                           //�Ƚ�5.34��7.38�Ĵ�С
		int b=number.compareTo(5.34);                           //�Ƚ�5.34��5.34�Ĵ�С
		int c=number.compareTo(2.62);                           //�Ƚ�5.34��2.62�Ĵ�С
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("number="+number);
		System.out.println("int(number)="+number.intValue());    //���number��int��ֵ
        Double number1=5.64;
		System.out.println("number1="+number1);
		System.out.println("int(number1)="+number1.intValue());         
	}	
}
