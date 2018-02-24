package day06_multi_circle.break_test;

import java.util.Scanner;

/**
 * 有5家衣服专卖店，每家最多购买3件;
 * 用户可以选择离开，可以买衣服,
 * 最后打印总共买了几件衣服 
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
			 System.out.println("进入第"+(i+1)+"家商店");
			 for(j=0;j<3;j++){
			 
			 System.out.println("选择离开么？");
			 
			 selcet=scanner.next();
			 
			 if((selcet).equalsIgnoreCase("Y")){
				 
				 System.out.println("选择离开");
				 
				 break;
			 
			 }else{
				 
				 System.out.println("已购买一件衣服");
				 
				 count++;
				 
			 }
			 }
			
			 
			 
			 		 
		 }
		 
		 System.out.println("一共购买了"+count+"件衣服");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		  Scanner scanner = new Scanner(System.in );
//		 
//		  int count = 0;//买衣服的总数
//		 //去5家店买衣服
//		 for (int i = 0; i < 5; i++) {
//			 
//		     System.out.println("进入第"+(i+1)+"家店买衣服......");
//		     
//		     String answer = "";
//		     
//		     for (int j = 0; j < 3; j++) {
//			
//		       	   System.out.print("要离开吗?(y/n)");
//		    	   answer = scanner.next();// y/n 
//		    	   
//		    	   if(("y").equals(answer)){
//		    		   
//		    		     //离开
//		    	         System.out.println("离店结账");
//		    	         break;//终止 本次操作,并且要跳出本次循环
//		    		      
//		    	   }else{
//		    		   
//		    		   //买了一件衣服
//		    		   System.out.println("买了一件衣服");
//		    		   count++;
//		    	   }	   
//		    	   
//			 }
//		 
//		 }
//		 
//		 System.out.println("一共买了"+count+"件衣服");
		 
	 }
	 
	 

}