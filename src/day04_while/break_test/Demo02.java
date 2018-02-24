package day04_while.break_test;
/**
 * 1~10之间的整数相加，得到累加值大于20的当前数
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
		 
		 //当前数:6
		 System.out.println("当前数:" + i);
		 
		 
	 }
}
