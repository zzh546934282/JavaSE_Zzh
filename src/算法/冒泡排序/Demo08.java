package À„∑®.√∞≈›≈≈–Ú;

import java.util.Arrays;

public class Demo08 {
	public static void main(String[] args) {
		int[]a={1,7,9,11,13,15,17,19};
		int[]b={2,4,6,8,10};
		int[]c=new int[a.length+b.length];
		
		for(int i=0;i<c.length;i++){
			if(i<=a.length-1){
				
				c[i]=a[i];
			}else{
				c[i]=b[i-a.length];
				
			}
			
			
		
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}
}
