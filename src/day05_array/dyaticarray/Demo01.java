package day05_array.dyaticarray;

import java.util.Scanner;

/**
 * ����һ��5��ѧԱ�ĳɼ�------------> int[] scores = ew int[5];
 * ����3����5��ѧԱ�ĳɼ�����ô��------->
 * @author Mindy
 *
 */
public class Demo01 {

	  public static void main(String[] args) {
		  
		     /**
		      * ���ͬʱ���������ͬ�������͵ı���------һά����
		      */
//		    int[] scores1 = new int[5];
//		    int[] scores2 = new int[5];
//		    int[] scores3 = new int[5];
//		    
		    //�������1000��--�ѵ��㻹Ҫȥ����1000��������?
		    //----->�ṩ�µĽ������----->��ά����
		    
		    /**
		     * -----ͬʱ��������¹�ͬ�������͵�����---�����ö�ά����
		     * ��ά������﷨
		     * 3��  3���༶
		     * 5��  ÿ���඼��5��
		     */
		    5int[][] scores = new int [3][];
		    
		    /**
		     * ����ά���鸳ֵ
		     * -----һ��5�и�ֵ
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
		     * �廻�򵥶�ά���鸳ֵ����----˫��ѭ��
		     * 
		     * scores.length:     ��ȡ����
		     * scores[i].length:  ÿ�е�����
		     */
		    
		    System.out.println("scores.length = "+scores.length);

		    Scanner scanner = new Scanner(System.in 

);
		    
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
