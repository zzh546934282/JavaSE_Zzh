package day04_while.while_text;

import java.util.Scanner;

/*
 * 2012年培养学员25万人，每年增长25%，请问按此增长速度，到哪一年培训学员人数将达到100万人？
 */
public class Demo03 {
	
	public static void main(String[] args) {
		int year=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入学校2012年有多少学员");
		int sum=scanner.nextInt();
		
		System.out.println("请输入学校每年的增长率");
		double grow=scanner.nextDouble();
		
		while(sum<=100){
			sum=sum+(int)(sum*grow);
			year++;	
		}
		System.out.println("从2012年起，需要"+year+"年学员人数将达到100万人");
		
	}
}
