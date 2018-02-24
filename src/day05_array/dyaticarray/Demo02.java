package day05_array.dyaticarray;

import java.util.Scanner;

/**
 * 计算3个班级的平均分
 * @author zzh
 *
 */
public class Demo02 {

	  public static void main(String[] args) {
			
		  Scanner scanner = new Scanner(System.in 

);
		    
		  /**
		   * 语法2
		   */
		  int[][] scores = new int[3][];
		  
		  
		  /**
		   * 遍历给个班赋学员人数
		   * 
		   */
		  for (int i = 0; i < scores.length; i++) {
			  
			    System.out.print("请输入班级人数:");
			    int num = scanner.nextInt();
			    scores[i] = new int[num];
			    
		  }
		  
		  
		  System.out.println("声明完毕.........");
		  
		  
           /**
            * 给二维数组赋值		  
            */
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