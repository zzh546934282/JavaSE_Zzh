package �㷨.ð������;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ѡ������
 * @author Mindy
 *
 */
public class Demo04 {

	
	  public static void main(String[] args) {
		
		  selectSort01();
			 
	}

	  /**
	   * ѡ������
	   */
	private static void selectSort01() {
		
		int a[] = { 190,17,56,90,25,4,7,10,99,1,23,45 };
	        
	        int count = 0;
	        
	        for (int i = 0; i < a.length; i++) {
	        	
	            int temp = a[i];
	            
	            int flag = i;   // ����ǰ�±궨��Ϊ��Сֵ�±�
	            
	            for (int j = i + 1; j < a.length; j++) {
	            	
	            	//�ҵ�����Сֵ
	            	if (a[j] < temp) {
	                
	            		temp = a[j];
	                    
	            		// �����С�ڵ�ǰ��Сֵ�Ĺؼ��ֽ��˹ؼ��ֵ��±긳ֵ��flag
	            		flag = j; 
	            		
	                }
	            	count++;
	            }
	            
	            if (flag != i) {
	            
	            	//�̶���Сֵ
	            	a[flag] = a[i];
	                
	            	a[i] = temp;
	            }
	        }
	        
	        
	        System.out.println(Arrays.toString(a));
	        System.out.println(count);
	        
	}
	
	
	/**
	 * ѡ������
	 */
	private static void selectSort02() {
		
		
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
		 
		 
		 int n = lists.size();
		 
		 for (int i = 0; i < n; i++) {
			 
			   int temp = lists.get(i);
			   int flag = i;
			 
			   for (int j = i+1; j <n; j++) {
				
				     if(temp > lists.get(j)){
				    	 
				    	   temp = lists.get(j);
				    	   flag = j;
				     }
			    }
			   
			   if(flag != i){
				   
				    lists.set(flag, lists.get(i));
				    lists.set(i, temp);
				    
			   }
			  
			  
			  
			
		}
		 
		 System.out.println(lists);
		 
		 
		
	}
	

}