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
        super();//可以通过super调用父类构造方法
    
        System.out.println("SubClass(" + n + ")");
        this.n = n;
    }
    
    SubClass() {
    	super(300);
        System.out.println("SubClass()");
    }
}


