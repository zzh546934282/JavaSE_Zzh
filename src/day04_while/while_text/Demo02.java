package day04_while.while_text;

import java.util.Scanner;

/**
 * 老师每天检查张浩的学习任务是否合格，如果不合格，则继续进行。
   老师给张浩安排的每天的学习任务为：
   上午阅读教材，学习理论部分，下午上机编程，掌握代码部分。
 * @author zzh
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		String score="No";
//		
//		while(score.equalsIgnoreCase("No")){    //score=="No"  运行时出问题
//		System.out.println("上午阅读教材，学习理论部分");
//		System.out.println("下午上机编程，掌握代码部分");
//		System.out.println("是否完成考核?");
//		score=scanner.next();
//		
//	    }
//		System.out.println("完成考核");
		
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