package day04_while.extends_operation;

public class Demo01 {
	
	public static void main(String[] args) {
		
		  //后++
	    int num1 = 10;
	    /**
	     * 先操作后自增1
	     * int num2 = num1
	     * num1+=1;
	     */
	    
	    int num2 = num1++;
	    
	    System.out.println(num1);//11
	    System.out.println(num2);//10
	    
	    
	    System.out.println("------------------------------");
	   
	    
	    
	    
	    //前++
	    int num3 = 10;
	    
	    /**
	     * 线自增1后操作
	     * num3+=1;
	     * int num4 = num3;
	     */
	    int num4 = ++num3;
	    
	    System.out.println(num3);// 11 
	    System.out.println(num4);// 11
	    
	    System.out.println("------------------------------");
	    
	  
	    //后--
	    int num5 = 10;
	    int num6 = num5--;
	    
	    System.out.println(num5);// 9
	    System.out.println(num6);// 10
	    
	    System.out.println("------------------------------");
	    //前--
	    int num7 = 10;
	    int num8 = --num7;
	    
	    System.out.println(num7);// 9
	    System.out.println(num8);// 9
	    
	    
	    
}
}
