package day05_array;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 有一组学员的成绩{99，85，82，63， 60}，将它们按升序排列。
 * 要增加一个学员的成绩，将它插入成绩序列，并保持升序

 * @author zzh
 *
 */
public class Demo08 {
	
	 public static void main(String[] args) {
			
		   Scanner scanner = new Scanner(System.in );
		   
		   int[] intArray = {99,85,82,63,60};
		   
		   
		   //接收新值
		   System.out.print("请输入新值:");
		   int newNum = scanner.nextInt();
		   
		   //扩容创建新数组
		   int[] newArray = new int[intArray.length+1];
		   
		  
		    //对原数组进行排序
		   Arrays.sort(intArray);
		   
		   
		   /**
		    * 找到新值应该插入的索引位---80
		    * 60 63 82 85 99----找到以第一个比差入值大的那个值的索引位 
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
		    * 对新数组进行赋值 60 63 82 85 99 0 
		    */
		   for (int i = 0; i < newArray.length-1; i++) {
			   
			    newArray[i] = intArray[i];
			
		   }
		   
		  
		   /**                          0  1  2  3   4    
		    * 讲比插入值大的数,向后移动 60 63 82 85 99 
		    */
		   for (int i = newArray.length-1; i >index ; i--) {
			
			     newArray[i] = newArray[i-1];
		   }
		   
		   /**
		    * 在index赋插入值 60 63 80 82 85 99 
		    */
		   
		   newArray[index] = newNum;
		   
		   /**
		    * 遍历新数组
		    */
		   
		   System.out.println("--------------------------------------------");
		   for (int i = 0; i < newArray.length; i++) {
			
			    System.out.print(newArray[i] +" ");
		   }
		     Map<K, V>
	 }
	 }