package day03_if.switch_test;

//switch 中的变量 只能用 byte short int char string  来接收

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入成绩:");
		String scroce = scanner.next();

		System.out.println("请再次输入成绩:");
		int scroce1 = scanner.nextInt();

		if (scroce1 == 1) {
			System.out.println("奖励跑车");

		} else if (scroce1 == 2) {
			System.out.println("奖励海外游");

		} else if (scroce1 == 3) {
			System.out.println("奖励苹果笔记本");

		} else if (scroce1 == 4) {
			System.out.println("奖励移动硬盘");

		} else if (scroce1 == 5) {
			System.out.println("什么都不奖励");
		}

		switch (scroce) {

			case "优秀":
				System.out.println("奖励跑车");
				break;
	
			case "良好":
				System.out.println("奖励海外游");
				break;
				
			case "可以":
				System.out.println("奖励苹果笔记本");
				break;
				
			case "及格":
				System.out.println("奖励移动硬盘");
				break;
				
			default:
				System.out.println("什么也不讲理");
				break;

		}

	}
}
