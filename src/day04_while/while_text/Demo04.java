package day04_while.while_text;
/**
 * ����100���ڵ�ż��֮��2-1
 * @author zzh
 *
 */
public class Demo04 {
	
	public static void main(String[] args) {
		
		
		int count=1;
		
		int total=0;
		
		while(count<=100){
			
			if(count%2==0){
			
			total+=count;
			
	     	}count++;
	
		}
	System.out.println("100����ż��֮���ǣ�"+total);	
		
		
}
}