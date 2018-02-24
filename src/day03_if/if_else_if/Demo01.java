package day03_if.if_else_if;

import java.util.Scanner;

public class Demo01 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入成绩：");
	double score = scanner.nextDouble();
	 if(score>=60){
		System.out.println("及格");
	
	}else if(score>=80){
		System.out.println("良好");
	}else if(score>=70){
		System.out.println("可以");
	}else if(score>=90){
		System.out.println("优秀");
	}
	
	
	//程序逻辑错误   范围应从小到大，因为if else if 值为true 输出结果直接跳出
}
}
