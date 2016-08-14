package com.elephant.stream;

/**
 * 
 * @类名：Texttoword
 * @类简介：输入文本文件，分割其中的单词，写入结果文件中。
 * @编程人： 林福平
 * @编程日期：2012-9-15
 * @修改日期：2012-3-15
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Texttoword {
	public static void main(String[] args) {
		/* 检查是否输入两个文件名：输入文件名和输出文件名 */
		if (args.length != 2) {
			System.out.println("请输入两个文件名！！！");
		} else {
			/* step1:获得输入输出文件名 */
			String infile = args[0]; // 输入文件名
			String outfile = args[1]; // 输出文件名

			try {
				/* step2:打开输入文件 */
				BufferedReader br = new BufferedReader(new InputStreamReader(
						new FileInputStream(infile), "GBK"));
				String lineBuffer;

				/* step3:分解单词：分解后的单词，临时存放在对象words中 */
				StringBuffer words = new StringBuffer();
				while (null != (lineBuffer = br.readLine())) {
					String[] word = lineBuffer.replaceAll("\t", " ").split(" ");
					for (int i = 0; i < word.length; i++)
						if(word[i].trim().length() > 0)
							words.append(word[i] + "\r\n");
				}
				br.close();

				/* step4：分解结果写入输出文件 */
				FileOutputStream fos = new FileOutputStream(outfile);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						fos, "GBK"));
				bw.write(words.toString());
				bw.close();
			} catch (Exception e) {
				System.out.println("文件处理发生错误！！！");
				System.out.println("输入文件名：" + infile);
				System.out.println("输出文件名：" + outfile);
				System.out.println("错误信息：" + e.getMessage());
			}
		}
	}
}
