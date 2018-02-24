package day03_if.switch_test;

/**
 * switch变量的数据类型只能是  byte short int  char String
 *
 */
public class Demo03 {

	  public static void main(String[] args) {
		
		    
		    
		    String result1 = "可以";//优秀 良好 可以 及格 不及格
		   
		  
		    switch(result1){
		    
		          case "优秀":
		        	  System.out.println("奖励跑车");
		        	  break;  //跳出真个switch语法
		        	  
		          case "良好":
		        	  System.out.println("奖励海外游");
		        	  break;
		         
		          case "可以":
		        	  System.out.println("奖励苹果笔记本");
		        	  break;
		          
		          case "及格":
		        	  System.out.println("奖励移动硬盘");
		        	  break;
		          
		          default:
		        	  System.out.println("什么也不奖励");
		        	  break;
		        		  
		    }
		    
		    int result2 = 1;
		    
		    switch(result2){
		    
	          case 1:
	        	  System.out.println("奖励跑车");
	        	  break;  //跳出真个switch语法
	        	  
	          case 2:
	        	  System.out.println("奖励海外游");
	        	  break;
	          
	          default:
	        	  System.out.println("什么也不奖励");
	        	  break;
	        		  
	       }
		    
            byte result3 = 1;
		    //short result3 = 1;
		    //long result3 = 1;  long不可以
		    //float result3 = 1; 不可以
		    //double result3 = 1;不可以
		    //char result3 = '优';
		    //boolean result3 = true; 不可以
		    
		    switch(result3){
		    
	          case 1:
	        	  System.out.println("奖励跑车");
	        	  break;  //跳出真个switch语法
	        	  
	          case 2:
	        	  System.out.println("奖励海外游");
	        	  break;
	          
	          default:
	        	  System.out.println("什么也不奖励");
	        	  break;
	        		  
	       }
		    
		    
		    
		    
		    
		    
		    
	  }
}
