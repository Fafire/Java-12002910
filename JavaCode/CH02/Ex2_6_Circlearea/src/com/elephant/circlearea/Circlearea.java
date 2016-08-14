package com.elephant.circlearea;

import javax.swing.JOptionPane;

/**
 * 
 * @类名：Circlearea
 * @类简介：输入半径，计算圆的周长和面积。
 * @编程人： 林福平
 * @编程日期：2012-9-13
 * @修改日期：2012-3-13
 *
 */

public class Circlearea {
	public static void main(String[] args) {
		/* 通过对话框输入半径 */
		String radiusString = JOptionPane.showInputDialog("请输入半径");
		
		/* 检查输入的字符串是否有错 */
		if(radiusString.trim().length() == 0)
			JOptionPane.showMessageDialog(null, "输入的数据长度为0", "输入数据错误", JOptionPane.ERROR_MESSAGE);
		else {
			/* 将输入的字符串转换成半径，根据半径计算圆的周长和面积 */
			double radius = Double.parseDouble(radiusString);	// 半径
			double perimeter = 2 * Math.PI * radius;		// 周长
			double area = Math.PI * radius * radius;		// 面积
			
			/* 通过对话框输出显示结果 */
			String result = "周长为" + Double.toString(perimeter) 
					+ "。\n面积为" + Double.toString(area) + "。\n";
			JOptionPane.showMessageDialog(null, result, "计算结果", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
