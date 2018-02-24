package day03_if.练习;
/**
 * 1.	输入一个数，判断是奇数还是偶数
 */
import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		
		System.out.println("请输入一个数");
		
		Scanner scanner=new Scanner(System.in);
		
		int anumber=scanner.nextInt();
		
		if(anumber%2==0){
			System.out.println("偶数");	
		}else{
			System.out.println("奇数");
		}
}
}
