/*
 * �������� 2012-7-31
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
public class Ex5_21_Static2 {

	public static void main(String[] args) {
		System.out.println(staticTestFunction.addUP(10,5));//��ȷ ���෽�����Ա���ֱ�ӵ���
		//System.out.println(staticTestFunction.sub());//���� ��ʵ���������ܱ���ֱ�ӵ���
		staticTestFunction test = new staticTestFunction();
		System.out.println(test.sub());
		
		
	}
}

class staticTestFunction{
	int x=10,y=6;
	static int z=9;
	
	
	public static int addUP(int a,int b){ //������Ϊ�෽��
		
		return a+b+z;//�෽������ʹ�������
	}
	
	public final int sub(){
		
		return x-y;
	}
	/*public static int addUP(){ //������Ϊ�෽��
		return x+y;//����,�෽���в���ʹ��ʵ������
	}*/
	
	
}


