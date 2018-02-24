package day05_array.dyaticarray;
/**
 * ���������
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
		
		    //����1 ������ά����
		    int[][] triangle = new int[6][];
		    
		    for (int i = 0; i < triangle.length; i++) {
				
		    	  //�����пռ�
		    	triangle[i] = new int[i+1];
		    	
			}
		    
		    
		    /**
		     * ����2 �����鸳ֵ
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
					
		    		  //ÿ�еĿ�ʼindex�ͽ���Index ��ֵ����1
		    		  if((j == 0) || j == (triangle[i].length-1)){
		    			  
		    			    triangle[i][j] = 1;
		    		  
		    		  }else {
		    			  
		    			  //��ǰֵ����һ�еĵ�ǰ��ֵ+ǰһ��ֵ�ú�
		    			  triangle[i][j] =  triangle[i-1][j]+ triangle[i-1][j-1];
		    		  } 
				}
			}
		    
		    //����3 ������ά����
		    for (int i = 0; i < triangle.length; i++) {
				
		    	 for (int j = 0; j < triangle[i].length; j++) {
		    		 
				     System.out.print(triangle[i][j]+"\t");	
				 }
		    	 System.out.println();
			}
		    
	  }
}