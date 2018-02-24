package day05_array.dyaticarray;
/**
 * 杨辉三角形
 *            1
 *            1 1
 * 			  1 2  1
 * 			  1 3  3  1
 *            1 4  6  4   1
 *            1 5 10  10  5  1
 *            
 *            i    j
 *            1    1
 *            2	   2				          						 
 *            3    3
 *            
 * @author zzh
 *
 */
public class Demo05 {

	  public static void main(String[] args) {
		
		    //步骤1 声明二维数组
		    int[][] triangle = new int[6][];
		    
		    for (int i = 0; i < triangle.length; i++) {
				
		    	  //声明列空间
		    	triangle[i] = new int[i+1];
		    	
			}
		    
		    
		    /**
		     * 步骤2 给数组赋值
		     * [[1], 
		     *  [1, 1], 
		     *  [1, 2, 1], 
		     *  [1, 3, 3, 1], 
		     *  [1, 4, 6, 4, 1], 
		     *  [1, 5, 10, 10, 5, 1]
		     * ]
		     */
		    for (int i = 0; i < triangle.length; i++) {
				
		    	for (int j = 0; j < triangle[i].length; j++) {
					
		    		  //每行的开始index和结束Index 的值都是1
		    		  if((j == 0) || j == (triangle[i].length-1)){
		    			  
		    			    triangle[i][j] = 1;
		    		  
		    		  }else {
		    			  
		    			  //当前值是上一行的当前列值+前一列值得和
		    			  triangle[i][j] =  triangle[i-1][j]+ triangle[i-1][j-1];
		    		  } 
				}
			}
		    
		    //步骤3 遍历二维数组
		    for (int i = 0; i < triangle.length; i++) {
				
		    	 for (int j = 0; j < triangle[i].length; j++) {
		    		 
				     System.out.print(triangle[i][j]+"\t");	
				 }
		    	 System.out.println();
			}
		    
	  }
}