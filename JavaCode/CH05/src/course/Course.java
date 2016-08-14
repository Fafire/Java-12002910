/*
 * 创建日期 2012-7-24
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
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
