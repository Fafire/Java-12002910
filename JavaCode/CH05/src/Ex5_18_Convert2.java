/*
 * 创建日期 2012-7-28
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
public class Ex5_18_Convert2 {

	public static void main(String[] args) {
		TaxRate taxRate = new TaxRate();
		Manager2 manager = new Manager2();
		taxRate.findTaxRate(manager);//参数传递时，对象类型转换
	}
}

class TaxRate{
	void findTaxRate(Employee2 e){
		
	}
}

class Employee2 {
	
}

class Manager2 extends Employee2{
	
}
