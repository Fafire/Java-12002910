/*
 * 创建日期 2012-7-26
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
public class Ex5_13_Inheritance {
	
	public static void main(String[] args){
		Manager mrZhang = new Manager();
		mrZhang.setName("张刚");
		mrZhang.setDepartment("教务处");
		mrZhang.setSalary(2500);
		mrZhang.setSpecial("教务处处长");
		mrZhang.setSubsidy(500);
		System.out.println("**************************************员工信息*************************************");
		System.out.println();
		System.out.print(mrZhang.toString());
		
	}

}

class Employee {
	protected String name;
	protected double salary;
	protected String department;
	public void setName(String name) {
		this.name=name;	
	}
	
	public void setSalary( double salary) {
		this.salary= salary;	
	}
	
	public void setDepartment(String department) {
		 this.department = department;
	
	}
	
	public String getName() {
		return name;
	
	}
	
	public double getSalary() {
		return salary;
	
	}
	
	public String getDepartment() {
		return department;
	
	}
	
	public String toString() {
		return "姓名:"+name+"\t部门:"+department+"\t基本工资:"+salary;
	
	}
}

class Manager extends Employee {
	private String special;
	private double subsidy;
	public void setSpecial(String special) {
		this.special = special;
	
	}
	
	public void setSubsidy( double subsidy) {
		this.subsidy = subsidy;
	
	}
	
	public String getSpecial() {
		return special;
	
	}
	
	public double getSubsidy() {
		return subsidy;
	
	}
	
	public String toString() {
		return "姓名:"+name+"\t部门:"+department+"\t职务:"+special+
		"\t基本工资:"+salary+"\t津贴:"+subsidy;
	
	}
}


