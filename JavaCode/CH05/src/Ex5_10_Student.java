/*
 * 创建日期 2012-7-24
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
public class Ex5_10_Student {

	public static void main(String[] args){
		Student1 zhangGang = new Student1(19,"山西太原","张刚",350);
		Teacher missLiu = new Teacher(35,"beijing","刘老师",2000,"102198");
		missLiu.question(zhangGang);
		
	}
}

class Student1 {
	public int studentAge;
	protected String studentAddr;
	String studentName;
	private int studentAccount;
	
	public Student1(int studentAge, String studentAddr,String studentName,int studentAccount){
		this.studentAccount = studentAccount;
		this.studentAddr = studentAddr;
		this.studentAge = studentAge;
		this.studentName = studentName;
		
	}
	public Student1(){
	  this.studentAge = 18;	
	}
	
}


class Maanger extends Student1{  //班长  测试同一包内子类的权限控制
	
	void getStudentInformation(){
		System.out.println("name is "+studentName);
		System.out.println("age is "+studentAge);
	//	System.out.println("account is "+studentAccount) ;
		System.out.println("addr is "+studentAddr);
    }
}

class Teacher {
	public int age;

	protected String addr;

	String name;

	private int account;

	String teacherID;
	public Teacher(int age,String addr,String name, int account,String teacherID){
		this.age=age;
		this.addr=addr;
		this.name = name;
		this.account = account;
		this.teacherID = teacherID;		
	}

	public void SetInfo(String teacherID) {
		this.teacherID = teacherID;
	}
	
	public void question(Student1 s){
		System.out.print(s.studentAddr + "\t" + s.studentAge + "\t"
				+ s.studentName);
	//	System.out.print("\t" + s.studentAccount);
				
	}	
	
}
