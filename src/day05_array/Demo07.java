package day05_array;

public class Demo07 {

		public static void main(String[] args) {
			
			int intArray[]={10,40,60,56,90,10};
			
			int max=intArray[0];     
			
			int min=intArray[0];
			
			for(int i=1;i<intArray.length;i++){
				
				if(max<intArray[i]){    //获取最大值
					
					max=intArray[i];
					
				}
				if(min>intArray[i]){    //获取最小值
				
					min=intArray[i];
				
				}
			
				
			}
			
			System.out.println(max);
			System.out.println(min);
			
		}
}
