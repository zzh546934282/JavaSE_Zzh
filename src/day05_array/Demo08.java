package day05_array;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * ��һ��ѧԱ�ĳɼ�{99��85��82��63�� 60}�������ǰ��������С�
 * Ҫ����һ��ѧԱ�ĳɼ�����������ɼ����У�����������

 * @author zzh
 *
 */
public class Demo08 {
	
	 public static void main(String[] args) {
			
		   Scanner scanner = new Scanner(System.in );
		   
		   int[] intArray = {99,85,82,63,60};
		   
		   
		   //������ֵ
		   System.out.print("��������ֵ:");
		   int newNum = scanner.nextInt();
		   
		   //���ݴ���������
		   int[] newArray = new int[intArray.length+1];
		   
		  
		    //��ԭ�����������
		   Arrays.sort(intArray);
		   
		   
		   /**
		    * �ҵ���ֵӦ�ò��������λ---80
		    * 60 63 82 85 99----�ҵ��Ե�һ���Ȳ���ֵ����Ǹ�ֵ������λ 
		    */
		   int index = 0;
		   for (int i = 0; i < intArray.length; i++) {
			      
			      if(newNum < intArray[i]){
			    	  
			    	    index = i;
			    	    break;
			      }
		   }
		   
		   System.out.println(index);
		   /**
		    * ����������и�ֵ 60 63 82 85 99 0 
		    */
		   for (int i = 0; i < newArray.length-1; i++) {
			   
			    newArray[i] = intArray[i];
			
		   }
		   
		  
		   /**                          0  1  2  3   4    
		    * ���Ȳ���ֵ�����,����ƶ� 60 63 82 85 99 
		    */
		   for (int i = newArray.length-1; i >index ; i--) {
			
			     newArray[i] = newArray[i-1];
		   }
		   
		   /**
		    * ��index������ֵ 60 63 80 82 85 99 
		    */
		   
		   newArray[index] = newNum;
		   
		   /**
		    * ����������
		    */
		   
		   System.out.println("--------------------------------------------");
		   for (int i = 0; i < newArray.length; i++) {
			
			    System.out.print(newArray[i] +" ");
		   }
		     Map<K, V>
	 }
	 }