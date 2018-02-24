package 算法;
/**
 * 计算100以内的偶数之和2-1
 * @author Zzh
 *
 */
public class Cal_1_100 {
	
	public static void main(String[] args) {
		
		
		int count=1;
		
		int total=0;
		
		while(count<=100){
			
			if(count%2==0){
			
			total+=count;
			
	     	}count++;
	
		}
	System.out.println("100以内偶数之和是："+total);	
		
		
}
}