package �㷨.ð������;

import java.util.Scanner;


/**
 * �ݹ��㷨: ���������������,�Լ����Լ�-�����ѭ��
 * �׳�  4 = 1 * 2 * 3 *4;
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
	   * ���������
	   */
	  public static  void eatBread(){
		  
		  
		  
		   System.out.println("������?");
		   
		   int answer = scanner.nextInt(); //1 2
		   
		   if(answer ==1){
			   
			   System.out.println("��һ�����....");
			   
			   eatBread();
			   
		   }else{
			   
			   System.out.println("���ڳԱ���.....");
		   }
		  
		   
	  }
	  
	  
	  /**
	   * ����׳�
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