package day06_multi_circle.break_test;

import java.util.Scanner;

/**
 * ��5���·�ר���꣬ÿ����๺��3��;
 * �û�����ѡ���뿪���������·�,
 * ����ӡ�ܹ����˼����·� 
 * @author Mindy
 *
 */
public class Demo01 {
	
	 public static void main(String[] args) {
	    
		 Scanner scanner=new Scanner(System.in);
		 
		 int i;
		 
		 int j;
		 
		 int count=0;
		 
		 String selcet="";
		 
		 for(i=0;i<5;i++){
			 System.out.println("�����"+(i+1)+"���̵�");
			 for(j=0;j<3;j++){
			 
			 System.out.println("ѡ���뿪ô��");
			 
			 selcet=scanner.next();
			 
			 if((selcet).equalsIgnoreCase("Y")){
				 
				 System.out.println("ѡ���뿪");
				 
				 break;
			 
			 }else{
				 
				 System.out.println("�ѹ���һ���·�");
				 
				 count++;
				 
			 }
			 }
			
			 
			 
			 		 
		 }
		 
		 System.out.println("һ��������"+count+"���·�");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		  Scanner scanner = new Scanner(System.in );
//		 
//		  int count = 0;//���·�������
//		 //ȥ5�ҵ����·�
//		 for (int i = 0; i < 5; i++) {
//			 
//		     System.out.println("�����"+(i+1)+"�ҵ����·�......");
//		     
//		     String answer = "";
//		     
//		     for (int j = 0; j < 3; j++) {
//			
//		       	   System.out.print("Ҫ�뿪��?(y/n)");
//		    	   answer = scanner.next();// y/n 
//		    	   
//		    	   if(("y").equals(answer)){
//		    		   
//		    		     //�뿪
//		    	         System.out.println("������");
//		    	         break;//��ֹ ���β���,����Ҫ��������ѭ��
//		    		      
//		    	   }else{
//		    		   
//		    		   //����һ���·�
//		    		   System.out.println("����һ���·�");
//		    		   count++;
//		    	   }	   
//		    	   
//			 }
//		 
//		 }
//		 
//		 System.out.println("һ������"+count+"���·�");
		 
	 }
	 
	 

}