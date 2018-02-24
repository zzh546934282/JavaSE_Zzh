package �㷨.ð������;

import java.util.Arrays;


/**
 * ���ַ�����
 * @author Mindy
 *
 */
public class Demo05 {

	  public static void main(String[] args) {
		
		  int intArray[] = {190,17,56,90,25,4,7,10,99,1,23,45 };
		  
		  Arrays.sort(intArray);
		  
		  int index = binarySearch01(intArray,10);
		  
		  System.out.println(intArray[index]);
	  }

	  
	  
	  /**
	   * ���ַ����� 	
	   * @param intArray
	   * @param i
	   * @return
	   */
	  private static int binarySearch01(int[] intArray, int key) {
		  
		    
		  int index = 0;
		  
		  int start = 0;
		  int end = intArray.length-1;
		  
		  int middle = 0;
		  
		  while(start <= end){
			  
			     middle = (end + start)/2;
			  
			     if(intArray[middle] > key){
			    	 //key��middleλ�����
			    	 
			    	 end = middle-1;
			    	 
			     }else if(intArray[middle] < key){
			    	 
			    	 start = middle+1;
			    	 
			     }else{
			    	 
			    	 index = middle;
			    	 break;
			     }
			  
		  }
		  
		
		   return index;
	  }

	  
	  
/**
 * 
 * ���ַ�	  
 * 
 * 
 * 
 */
	  
	  public static int search1(int[] arr,int n,int begin,int end)//�ݹ�  
	    {  
	      
	          
	            int mid=(begin+end)/2;  
	            if(n<arr[begin] || n>arr[end] || arr[begin]>arr[end])  
	            {  
	                return -1;  
	            }  
	            if(arr[mid]<n)  
	            {  
	                return search1(arr,n,mid+1,end);  
	            }  
	            else if(arr[mid]>n)  
	            {  
	                return search1(arr,n,begin,mid-1);  
	            }  
	            else  
	                return mid;  
	      
	    }  
	  
	
	  
	  
}