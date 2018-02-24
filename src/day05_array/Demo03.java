package day05_array;

import java.util.Scanner;

public class Demo03 {

		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			
			int intArray[];          //声明数组
			intArray=new int[5];
			int total=0;     
			for(int i=0;i<5;i++){   // 给数组赋值
				System.out.println("请输入成绩：");
				intArray[i]=scanner.nextInt();
				total+=intArray[i];
			}
			
//			int total=0;            //取出数组的值
			
			//for(int i=0;i<intArray.length;i++){
				//total+=intArray[i];
				
			//}
			int avg=total/intArray.length;
			System.out.println("平均数是："+avg);
			
		}
}
