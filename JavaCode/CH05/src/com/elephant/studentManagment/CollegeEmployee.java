package com.elephant.studentManagment;


import javax.swing.*;
public class CollegeEmployee extends Person
{
   private String ssn;
   private double annualSalary;
   private String dept;
   public void setData()
   {
      String temp;
      super.setData();
      ssn = JOptionPane.showInputDialog(null,
         "请输入员工的社会保险号");
      temp = JOptionPane.showInputDialog(null,
         "请输入员工的年薪");
      annualSalary = Double.parseDouble(temp);     
   }
   public void display()
   {
      super.display();
      System.out.println("\tSSN: " + ssn + " \t年薪：" +
         annualSalary );
   }
   
   public double getAnnualSalary(){
	   return annualSalary;
   }
}
