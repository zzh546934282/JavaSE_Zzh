package day05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		
		  
		   Scanner scanner = new Scanner(System.in 

);
        
		   //��������
		   int scores[] = new int[5];
        
        System.out.println("������5λѧԱ�ĳɼ�:");
        
        //�����鸳ֵ
        for (int i = 0; i < scores.length; i++) {
			
     	     scores[i] = scanner.nextInt();
		   }
        
        
        //����������----����
        Arrays.sort(scores);
        
        System.out.println("ѧԱ�ɼ�����������:");
        
        //��������
        for (int i = 0; i < 5; i++) {
			
     	     System.out.print(scores[i] + " ");
		   }
        
        System.out.println("\nѧԱ�ɼ�����������:");
        for (int i = 4; i>=0; i--) {
			
    	     System.out.print(scores[i] + " ");
		   }
        
        
	  }
}
