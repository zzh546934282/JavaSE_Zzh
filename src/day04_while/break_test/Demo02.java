package day04_while.break_test;
/**
 * 1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ��
 */
import java.util.Scanner;

public class Demo02 {
	 public static void main(String[] args) {
			
		 Scanner scanner = new Scanner(System.in 

);
		 
		 int total = 0;
		 int i = 0;
		 
		 for (; i < 10; i++) {
			
			 total+= i;
			 
			 if(total >= 20){
				 
				  break;
			 }
			 
		 }
		 
		 //��ǰ��:6
		 System.out.println("��ǰ��:" + i);
		 
		 
	 }
}
