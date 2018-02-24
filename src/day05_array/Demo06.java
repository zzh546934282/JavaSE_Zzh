package day05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		
		  
		   Scanner scanner = new Scanner(System.in 

);
        
		   //声明数组
		   int scores[] = new int[5];
        
        System.out.println("请输入5位学员的成绩:");
        
        //给数组赋值
        for (int i = 0; i < scores.length; i++) {
			
     	     scores[i] = scanner.nextInt();
		   }
        
        
        //给数组排序----升序
        Arrays.sort(scores);
        
        System.out.println("学员成绩按升序排序:");
        
        //遍历数组
        for (int i = 0; i < 5; i++) {
			
     	     System.out.print(scores[i] + " ");
		   }
        
        System.out.println("\n学员成绩按降序排序:");
        for (int i = 4; i>=0; i--) {
			
    	     System.out.print(scores[i] + " ");
		   }
        
        
	  }
}
