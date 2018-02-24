package 算法.冒泡排序;
/**\
 * 判断一个数是不是质数
 * @author zzh
 *
 */
public class dsdsa {
	public static void main(String[ ] args) {
	
			
	
	System.out.println(sushu(87));
	
	}

	private static boolean sushu(int num) {
		 for (int i = 2; i <(num/2); i++) {
			   if((num%i)==0){
				   
				   return false;
				 
			   }
			   
			   
		}
		      return true;
	}
	
	
	
}
