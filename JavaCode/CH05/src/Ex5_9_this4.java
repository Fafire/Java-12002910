/*
 * �������� 2012-7-27
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */

/**
 * @author xiang
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public class Ex5_9_this4 {
	public static void main(String[] args){
		Annimal a= new  Annimal(10,20);
		System.out.println("����С����");
		System.out.println("����="+a.age +"\t����= "+a.weight+"��\t���="+a.height+"cm");		
	}
}

class Annimal{
	int age;
	String furCorlor;
	String eyeColor;
	String name;
	float weight;
	float height;
	
	public Annimal(float height)
	{
		this.age = 1;
		this.height = height;
		
	}
	
	public Annimal(String name)
	{
		this.age = 1;
		this.name = name;
		
	}
	
	public Annimal(float height,float weight){
		this(height);// A�� ʹ��this�����������캯��
		this.weight = weight;
	}
	
	
}
