public class Ex4_6_StringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------本程序输出结果如下----------");
		char c1, ch1[] = new char[13];
		String str1 = "";
		StringBuffer sbufstr1;
		boolean bFlag = true;
		sbufstr1 = new StringBuffer("NewStrBuffer");
		// 1.字符串缓冲区数据转换为字符串
		str1 = sbufstr1.toString();// toString()方法完成转换任务
		str1 = str1 + ":";
		System.out.println(sbufstr1);
		ch1 = str1.toCharArray();
		System.out.println(ch1);
		// 2.追加字符
		sbufstr1 = sbufstr1.append(bFlag);
		sbufstr1 = sbufstr1.append(3456);
		sbufstr1 = sbufstr1.append(12345678987654L);
		sbufstr1 = sbufstr1.append(3.14159F);
		sbufstr1 = sbufstr1.append(2.71717171);
		sbufstr1 = sbufstr1.append("中国");
		sbufstr1 = sbufstr1.append(new StringBuffer("解放军"));
		System.out.println(sbufstr1);
		// 3.插入字符
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(6, "ing");// 得"NewStringBuffer"
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(sbufstr1.length(), ":");// 得"NewStringBuffer:"
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, bFlag);// 得"trueNewStringBuffer:"
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, ch1, 6, 3);// 得"BuftrueNewStringBuffer:"
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 3456);// 得"3456BuftrueNewStringBuffer:"
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 12345678987654L);
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 3.14159F);
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, 2.71);
		System.out.println(sbufstr1);
		sbufstr1 = sbufstr1.insert(0, new StringBuffer("解放军"));
		sbufstr1 = sbufstr1.insert(0, "中国人民");
		System.out.println(sbufstr1);
		// 4.替换字符
		str1 = "You have a ";
		sbufstr1 = sbufstr1.replace(0, 6, str1);
		System.out.println(sbufstr1);
		// 5.删除字符
		sbufstr1.delete(3, 6);
		System.out.println(sbufstr1);
		sbufstr1.deleteCharAt(2);
		System.out.println(sbufstr1);
		// 6.清空字符串
		// sbufstr1.ensureCapacity(1);
		System.out.println(sbufstr1);
		sbufstr1.setLength(0);
		sbufstr1.append("中国人民解放军");
		System.out.println(sbufstr1);
		// 7.取字符
		c1 = sbufstr1.charAt(3);
		System.out.println(c1);
		// 8.取子串
		str1 = sbufstr1.substring(3);
		System.out.println(str1);
		str1 = sbufstr1.substring(3, 6);
		System.out.println(str1);
		// 9.字符串反转
		sbufstr1.reverse();
		System.out.println(sbufstr1);
		str1 = sbufstr1.toString();
		System.out.println(str1);
		System.out.println("----------本程序输出已经结束----------");
	}

}
