/*
 * �������� 2012-7-21
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
public class Ex5_6_this1 {
	public static void main(String[] args){
		Cat garfield = new Cat("��",12);
		garfield.grow();
		garfield.grow();
	}

}
class Cat {
	String furColor;
	int height;
	
	public Cat(String color) {
		this.furColor = color;//ͨ��this���ʳ�Ա����
		this.cry();// ͨ��this���ó�Ա����
		
	}
	public Cat(String color,int height) {
		this(color);//ͨ��this�����������췽��
		this.height=height;// ͨ��this���ó�Ա����
		
	}
	public void cry(){
		System.out.println(" ����һֻ"+this.furColor+"��ɫ��è");
	}
	public void grow(){
		this.height++;//ͨ��this���ʳ�Ա����
		System.out.println("�ҳ����ˣ����Ϊ"+this.height);
	}
	
}
