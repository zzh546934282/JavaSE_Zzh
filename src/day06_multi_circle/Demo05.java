package day06_multi_circle;

import java.util.Scanner;
/**
 * 打印倒直角三角形
 * @author zzh
 *
 */
public class Demo05 {

//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int i;
//		int j;
//		System.out.println("请输入三角形的高");
//		int row=scanner.nextInt();
//		for(i=row;i>=0;i--){
//			
//			for(j=i;j>=i*2+1;j--){
//				
//			
//				System.out.print("*");
//				
//				
//			}
//			System.out.println();
//				
//		}
//		
//		
//		
//		
//		
//	   	
//	}
//}

public static void main(String[] args) {
	
	  int row = 6;
		
		 for(int i = 0; i <= row;i++ ){
			 
			 for(int j = 1; j <= row -i;j++){
				 
				 System.out.print("*");
				 

			 }
			 
			 System.out.println();
			 
		 }
		 
}

}

