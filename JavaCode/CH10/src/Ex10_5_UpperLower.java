// Ex10_5_UpperLower.java
public class Ex10_5_UpperLower {
   public static void main(String args[]){
	 char score[]={'a','B','C','d','e'};             //定义score数组
	 System.out.println("数组元素为：");
     for(int i=0;i<score.length;i++){
         System.out.print(score[i]+"; ");            //输出数组中的元素	
     }
     for(int i=0;i<score.length;i++){
       if(Character.isLowerCase(score[i])){          //判断字符是否为小写
    	 score[i]=Character.toUpperCase(score[i]);   //将小写字符转换为大写
       }
     }
	 System.out.println("");                         //换行
	 System.out.println("转换后结果为：");
     for(int i=0;i<score.length;i++){
       System.out.print(score[i]+"; ");              //输出转换后的结果
     }
	}
}
