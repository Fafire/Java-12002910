// Ex10_5_UpperLower.java
public class Ex10_5_UpperLower {
   public static void main(String args[]){
	 char score[]={'a','B','C','d','e'};             //����score����
	 System.out.println("����Ԫ��Ϊ��");
     for(int i=0;i<score.length;i++){
         System.out.print(score[i]+"; ");            //��������е�Ԫ��	
     }
     for(int i=0;i<score.length;i++){
       if(Character.isLowerCase(score[i])){          //�ж��ַ��Ƿ�ΪСд
    	 score[i]=Character.toUpperCase(score[i]);   //��Сд�ַ�ת��Ϊ��д
       }
     }
	 System.out.println("");                         //����
	 System.out.println("ת������Ϊ��");
     for(int i=0;i<score.length;i++){
       System.out.print(score[i]+"; ");              //���ת����Ľ��
     }
	}
}
