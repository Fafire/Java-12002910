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
public class Ex5_19_Convert3 {

	public static void main(String[] args) {
		Lady missLiu= new Lady();
		missLiu.pet = new Dog2();
		missLiu.petEnjoy();
		
		Lady missWang= new Lady();
		missWang.pet = new Bird();
		missWang.petEnjoy();
		
	}
}

class Lady{
	Pet pet;
	void petEnjoy(){
		pet.enjoy();
	}
}

class Pet{
	int name;
	void enjoy(){
		System.out.println("�������");
	}
}

class Bird extends Pet{
	void enjoy(){
		System.out.println("����......");
	}	
}

class Dog2 extends Pet{
	void enjoy(){
		System.out.println("����.....");
	}
	
}