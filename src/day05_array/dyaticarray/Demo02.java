package day05_array.dyaticarray;

import java.util.Scanner;

/**
 * ����3���༶��ƽ����
 * @author zzh
 *
 */
public class Demo02 {

	  public static void main(String[] args) {
			
		  Scanner scanner = new Scanner(System.in 

);
		    
		  /**
		   * �﷨2
		   */
		  int[][] scores = new int[3][];
		  
		  
		  /**
		   * ���������ำѧԱ����
		   * 
		   */
		  for (int i = 0; i < scores.length; i++) {
			  
			    System.out.print("������༶����:");
			    int num = scanner.nextInt();
			    scores[i] = new int[num];
			    
		  }
		  
		  
		  System.out.println("�������.........");
		  
		  
           /**
            * ����ά���鸳ֵ		  
            */
		    for (int i = 0; i < scores.length; i++) {
				
		    	  System.out.println( "ÿ������:"+scores[i].length);
		    	  
		    	  for (int j = 0; j < scores[i].length; j++) {
					
		    		     System.out.println("�������"+(i+1)+"��"+(j+1)+"�е�ֵ");
		    		     
		    		     scores[i][j] = scanner.nextInt();
				  }
		    	  
		    	  
			}
		    
		    System.out.println("��ֵ�������......");
		  
		  
		  
		    
	  }
	  
	  
}