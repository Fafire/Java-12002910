import java.awt.*;
public class Ex8_1_UnderstandAWT {
	public static void main(String[] args) {
		//创建容器和设置布局
		Frame frm=new Frame("理解AWT");
		frm.setLayout(new BorderLayout());
		
		//创建组件，并添加到容器中 
		Button myBtn=new Button("按钮");
		frm.add(myBtn);
		
		//设置 结构(Frame)的位置与大小并显示
		frm.setBounds(400, 200, 400,200);
		frm.setVisible(true);
	}
}
