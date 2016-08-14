/*
 * 创建日期 2012-7-19
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xiang
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

public class Ex5_1_Student {
	
	public String name;       //姓名
	public String studentID;  //学号
	       Date birthdate;    //出生日期
	private String address;   //住址
	public String mobilePhone;//联系电话
	protected String major;  //专业
	private float gpa;      //平均成绩点数
	public Professor advisor;//导师
	
	public void register() {
		
	
	}
	
	//获得平均成绩点数
	public float getgpa() {
		return gpa;
	
	}
	
	//修改平均成绩点数
	public void setgpa() {
		gpa=23.5f;
	
	}
}