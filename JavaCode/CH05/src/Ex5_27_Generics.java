/*
 * 创建日期 2012-8-8
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
		System.out.println("好一朵美丽的茉莉花");
		return  "";
	}
}

class MusicalInstruments{
	public String toString(){
		System.out.println("|3 34 61 16|5 56 5-|");
		return  "";
	}
}

