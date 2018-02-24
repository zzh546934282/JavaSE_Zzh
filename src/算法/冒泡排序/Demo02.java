package Ëã·¨.Ã°ÅİÅÅĞò;

import java.util.LinkedList;
import java.util.List;



/**
 * Ã°ÅİÅÅĞò Ë³¿ÚÁï
 * Íâ²ãÑ­»·n-1
 * ÄÚ´æÑ­»·n-i-1
 * @author Mindy
 *
 */
public class Demo02 {
	
	 public static void main(String[] args) {
		 
		 int[] intArray = {190,17,56,90,25,4,7,10,99,1,23,45};
		 
		 //maopaoOperate(intArray);
		 
		 //putongOperate(intArray);
		 
		 List<Integer> lists = new LinkedList<Integer>();
		 lists.add(190);
		 lists.add(17);
		 lists.add(56);
		 lists.add(90);
		 lists.add(25);
		 lists.add(4);
		 lists.add(7);
		 lists.add(10);
		 lists.add(99);
		 lists.add(1);
		 lists.add(23);
		 lists.add(45);
		 
		 
		 maopaoOperate02(lists);
		 
		 System.out.println(lists);
		 
		 
	}

	 /**
	  * ÆÕÍ¨Ëã·¨
	  * @param intArray
	  */
	private static void putongOperate(int[] intArray) {
		int temp = 0;
		 
		 int count = 0;
		 for (int i = 0; i < intArray.length; i++) {
			 
			 for (int j = 0; j < intArray.length; j++) {
				 
				 if(intArray[i] > intArray[j]){
					   
	                  temp = intArray[j];
	                  intArray[j] = intArray[i];
	                  intArray[i] = temp;
			     }
				 count++;
			 }
		}
		 System.out.println(count);
	}

	
	/**
	 * ÅÅĞòËã·¨
	 * @param intArray
	 */
	private static void maopaoOperate(int[] intArray) {
		
		 
		 int n = intArray.length;
		 
		 int temp = 0;
		 int count = 0;
		 for (int i = 0; i < n-1; i++) {
			
			  for (int j = 0; j < n-i-1; j++) {
				
				   if(intArray[j] > intArray[j+1]){
					   
		                  temp = intArray[j];
		                  intArray[j] = intArray[j+1];
		                  intArray[j+1] = temp;
				   }
				   
				   count++;
				   //System.err.println(Arrays.toString(intArray));
			  }
			  
			  //System.out.println(Arrays.toString(intArray));
		 }
		 
		 System.out.println(count);
	}
	
	/**
	 * Ã°ÅİÅÅĞòËã·¨
	 * @param intArray
	 */
	private static void maopaoOperate02(List<Integer> lists) {
		
		  int n = lists.size();
		  int count = 0;
		  int temp = 0;
		  for (int i = 0; i < n-1; i++) {
			
			  for (int j = 0; j < n-i-1; j++) {
				
				    if(lists.get(j) > lists.get(j+1)){
				    	
				    	 temp = lists.get(j+1);
				    	 lists.set((j+1),lists.get(j));
				    	 lists.set(j, temp);
				    	 count++;
				    }
				
				   
			  }
		}
		  
		
		  System.out.println(count);
		
		 
	}
	

}
	