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
public class Ex5_15_SuperUse {
	public static void main(String[] args) {
		SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(400);
	}

}

class SuperClass {
    private int n;  	
  
    SuperClass() {
        System.out.println("SuperClass()");
    }    
  
    SuperClass(int n) {
        System.out.println("SuperClass(" + n + ")");
        this.n = n;
    }
}

class SubClass extends SuperClass {
    private int n;
    
    SubClass(int n) {        
        super();//����ͨ��super���ø��๹�췽��
    
        System.out.println("SubClass(" + n + ")");
        this.n = n;
    }
    
    SubClass() {
    	super(300);
        System.out.println("SubClass()");
    }
}


