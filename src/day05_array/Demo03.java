package day05_array;

import java.util.Scanner;

public class Demo03 {

		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			
			int intArray[];          //��������
			intArray=new int[5];
			int total=0;     
			for(int i=0;i<5;i++){   // �����鸳ֵ
				System.out.println("������ɼ���");
				intArray[i]=scanner.nextInt();
				total+=intArray[i];
			}
			
//			int total=0;            //ȡ�������ֵ
			
			//for(int i=0;i<intArray.length;i++){
				//total+=intArray[i];
				
			//}
			int avg=total/intArray.length;
			System.out.println("ƽ�����ǣ�"+avg);
			
		}
}
