package �㷨.ð������;

import java.util.LinkedList;
import java.util.List;


/**
 * ������---˳����
 * ���ѭ�� i = 0     i <n
 * �ڲ�ѭ�� j = i+1   j <n
 * �ڲ� i j �ж�
 * ��Զ��δ���̶��ĵ�һ��Ԫ�غͺ����ÿһ���ȡ�
 * @author Mindy
 *
 */
public class Demo03 {

	  public static void main(String[] args) {
		
		  
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
			 
			 int temp = 0;
			 
			 int count = 0 ;
			 
			 for (int i = 0; i < n; i++) {
				 
				 for (int j = i+1; j < n; j++) {
					
					   if(lists.get(i) > lists.get(j)){
						   
						     temp = lists.get(j);
					    	 lists.set(j,lists.get(i));
					    	 lists.set(i, temp);
					    	 count++;
					   }
					   
					   
				 }
				
			}
			 
			 System.out.println(count);
			 
			 System.out.println(lists);
			 
	  }
}
