package com.elephant.studentManagment;
import java.util.*;

public class Test {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] name = { "����", "����", "��ɽ", "���已", "���", "����", "������", "�ο���", "�����", "��ƽ" };// �洢ѧ��������

		double[][] grade = {  
	            {50,60,70,80,90,10},  
	            {40,90,80,60,40,70},  
	            {60,80,70,60,40,90},  
	            {50,60,70,80,90,10},  
	            {60,80,70,60,40,90},  
	            {60,70,80,90,70,70},  
	            {60,80,70,60,40,90},  
	            {60,80,70,60,40,90},  
	            {60,80,70,60,40,90},  
	            {60,45.5,70,60,40,10}  
	        };//�洢ѧ�����Ƴɼ�   
	        System.out.println("����Ҫ��ѯ�ɼ���ѧ�����֣�");  
	        String chioce = input.nextLine();  
	        for(int i= 0; i< 10; i++) {  
	            if(name[i].equals(chioce)){  
	                System.out.println("ѧ����" + name[i] + "�ĳɼ����£�");  
	                System.out.println("C������ƣ�"+ grade[i][0] + "����" +grade[i][1]+ "Ӣ�" +grade[i][2]+ "������" +grade[i][3]+ "������" +grade[i][4]+ "����" +grade[i][5] + "/n") ;  
	                break;  
	            }  
	        }  
	        System.out.println("===============================");  
	        System.out.println("�����ѯ�����������Ŀ�Ŀ���/n");  
	        System.out.println("1��C������� 2������ 3��Ӣ�� 4������ 5������ 6������");  
	          
	        int ch = input.nextInt();  
	        int time = 0;  
	        System.out.println("�����������Ϊ��");  
	        for(int i=0; i<10; i++) {  
	            if(grade[i][ch-1]<60) {  
	                time++; 
	                System.out.println(name[i]); 	              
	            }  
	        }  
	        System.out.println("�ÿ�Ŀ����������Ϊ��" + time);  
	    }  
	}  

