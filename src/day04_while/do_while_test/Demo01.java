package day04_while.do_while_test;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean isOk=false;
		do{
				
			System.out.println("上午阅读教材，学习理论部分");
			System.out.println("下午上机编程，掌握代码部分");				
			System.out.println("是否完成考核?");
			isOk=scanner.nextBoolean();
			
		}while(isOk==false);
		
		System.out.println("完成考核");
		
		
    

	}
}
