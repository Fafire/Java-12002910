/*
 * �������� 2012-7-26
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
public class Ex5_8_this3 {
	public static void main(String[] args){
		Dog tom = new Dog();
		System.out.println("������tom ���:"+tom.height+"cm, ����:"+tom.age);
		tom=tom.grow();
		System.out.println("������tom ���:"+tom.height+"cm, ����:"+tom.age);
	}

}

class Dog{
	int age;
	float height;
	public Dog(){
		age=1;
		height=10;		
		
	}
	
	public Dog grow(){
		height = height+10;		
		age++;
		return this;
	}
}
