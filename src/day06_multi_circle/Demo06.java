package day06_multi_circle;



/**
 * 打印等腰三角形
 * 
 *  
 * ####* 
 * ###*** 
 * ##*****
 * #*******
 * ********* 
 *   i   j   k       
 *   1   4   1            j=row-i
 *   2   3   3			  k=i*2-1
 *   3   2   5
 *   4   1   7
 *   5   0   9
 * */
public class Demo06 {

	public static void main(String[] args) {
		int row=5;
		
	   for (int i = 1; i<=row; i++) {

			for (int k = 0; k < row-i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
	    }
     }	
}	

