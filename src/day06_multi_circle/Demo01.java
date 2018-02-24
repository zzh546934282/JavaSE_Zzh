package day06_multi_circle;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		
		System.out.println("请输入5个同学的成绩");
		
		Scanner scanner=new Scanner(System.in);
		
		double[] score=new double[5];
		
		int total = 0;
		
		double avg;
		
		for(int i=0;i<score.length;i++){
			
			score[i]=scanner.nextDouble();
			
			total+=score[i];
			
		} 
		   avg=total/score.length;
		   System.out.println("5个同学的平均成绩为："+avg);
	}
}
