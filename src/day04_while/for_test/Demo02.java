package day04_while.for_test;

import java.util.Scanner;

//从控制台接收5个学员的Java成绩
//并计算平均分
public class Demo02 {
	
	public static void main(String[] args) {
		
		int total=0;
		
		double ave=0;
		
		Scanner scanner=new Scanner(System.in);
		
		for(int student=1;student<=5;student++){
			
			System.out.println("请输入第"+student+"个学生的成绩");
			
			int score=scanner.nextInt();

			total+=score;
			
			ave=total/student;
		}
			System.out.println("平均分为："+ave);
		
		
		
	}

}
