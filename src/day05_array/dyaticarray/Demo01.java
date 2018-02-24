package day05_array.dyaticarray;

import java.util.Scanner;

/**
 * 保存一班5名学员的成绩------------> int[] scores = ew int[5];
 * 保存3个班5名学员的成绩该怎么办------->
 * @author Mindy
 *
 */
public class Demo01 {

	  public static void main(String[] args) {
		  
		     /**
		      * 如果同时声明多个相同数据类型的变量------一维数组
		      */
//		    int[] scores1 = new int[5];
//		    int[] scores2 = new int[5];
//		    int[] scores3 = new int[5];
//		    
		    //如果保存1000班--难道你还要去声明1000个数组吗?
		    //----->提供新的解决方案----->二维数组
		    
		    /**
		     * -----同时声明多个下共同数据类型的数组---建议用二维数组
		     * 二维数组的语法
		     * 3行  3个班级
		     * 5列  每个班都有5列
		     */
		    5int[][] scores = new int [3][];
		    
		    /**
		     * 给二维数组赋值
		     * -----一行5列赋值
		     */
		    scores[0][0] = 100;
		    scores[0][1] = 90;
		    scores[0][2] = 80;
		    scores[0][3] = 70;
		    scores[0][4] = 60;
		    
		    scores[1][0] = 100;
		    scores[1][1] = 90;
		    scores[1][2] = 80;
		    scores[1][3] = 70;
		    scores[1][4] = 60;
		    
		    
		    scores[2][0] = 100;
		    scores[2][1] = 90;
		    scores[2][2] = 80;
		    scores[2][3] = 70;
		    scores[2][4] = 60;
		    
		    
		    
		    /**
		     * 村换简单二维数组赋值操作----双重循环
		     * 
		     * scores.length:     获取行数
		     * scores[i].length:  每行的列数
		     */
		    
		    System.out.println("scores.length = "+scores.length);

		    Scanner scanner = new Scanner(System.in 

);
		    
		    for (int i = 0; i < scores.length; i++) {
				
		    	  System.out.println( "每行列数:"+scores[i].length);
		    	  
		    	  for (int j = 0; j < scores[i].length; j++) {
					
		    		     System.out.println("请输入第"+(i+1)+"行"+(j+1)+"列的值");
		    		     
		    		     scores[i][j] = scanner.nextInt();
				  }
		    	  
		    	  
			}
		    
		    System.out.println("赋值操作完毕......");
		    
		    
		    
		    
	 }
}
