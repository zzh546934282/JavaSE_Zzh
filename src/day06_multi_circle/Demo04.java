package day06_multi_circle;

import java.util.Scanner;

public class Demo04 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i;
		int j;
		System.out.println("请输入三角形的高");
		int row=scanner.nextInt();
		for(i=0;i<row;i++){
			
			for(j=1;j<=i*2+1;j++){
				
			
				System.out.print("*");
				
				
			}
			System.out.println();
				
		}
		
		
		
		
		
	   	
	}
}
