package 算法.冒泡排序;

import java.util.Scanner;


/**
 * 递归算法: 符合条件的情况下,自己调自己-变相的循环
 * 阶乘  4 = 1 * 2 * 3 *4;
 * 0 = 0  1 = 1
 * @author Mindy
 *
 */
public class Demo06 {

	
	  static Scanner scanner = new Scanner(System.in 

);
	 
	  public static void main(String[] args) {
		
		  //eatBread();
		  
		  factory02(4);
	  }
	  
	  
	  /**
	   * 吃面包操作
	   */
	  public static  void eatBread(){
		  
		  
		  
		   System.out.println("还饿吗?");
		   
		   int answer = scanner.nextInt(); //1 2
		   
		   if(answer ==1){
			   
			   System.out.println("吃一口面包....");
			   
			   eatBread();
			   
		   }else{
			   
			   System.out.println("终于吃饱了.....");
		   }
		  
		   
	  }
	  
	  
	  /**
	   * 计算阶乘
	   * 4 3 2 1
	   * num = 4 * factory02(4 - 1); ---24
	   *     num = 3 * factory02(3 - 1);---6
	   *       num = 2 * factory02(2 - 1);---2
	   *         num = 1
	   */
      public static int factory02(int num){
		  
	    	  if(num < 0){
	    		  
	    		  num = 0;
	    		 
	    	  }else if(num ==1){
	    		  
	    		  num = 1;
	
	    	  }else{
	    		  
	    		  num = num * factory02(num - 1); 
	    	  }
	    	  
	    	  return num;
    	    
		  
	  }
      
      
      
      
}