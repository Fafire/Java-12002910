/*
 * �������� 2012-7-24
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
package course;

public class Course {
	public String courseID;
	public float credit;
	protected String courseCharacter;
	String description;
	private String term;
	public Course(){
		
	}
	
	public Course(String courseID, float credit, String courseCharacter,
			String description, String term) {
		this.courseCharacter =courseCharacter;
		this.courseID =courseID;
		this.credit = credit;
		this.description=description;
		this.term =term;
			

	}
	

	

}
