/*
 * �������� 2012-8-8
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
public class Ex5_27_Generics {

	public static void main(String[] args) {
		Chorous <Singer,MusicalInstruments> model =new Chorous<Singer,MusicalInstruments>();
		 model.makeChorus(new Singer(), new MusicalInstruments() );
		
	}
}

class Chorous <E,F>{
	void makeChorus(E person,F yueqi){
		yueqi.toString();
		person.toString();
	}
}

class Singer{
	public String toString(){
		System.out.println("��һ������������");
		return  "";
	}
}

class MusicalInstruments{
	public String toString(){
		System.out.println("|3 34 61 16|5 56 5-|");
		return  "";
	}
}

