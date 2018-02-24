package day06_multi_circle;

import java.util.Scanner;

/**
 * 如果我需要计算3个班 每个班5位学员的平均分?
 * @author zzh
 *
 */

public class Demo02 {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++){
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		double[] score=new double[5];
		
		int total = 0;
		
		double avg;
		
		int j;
		for(int i1=0;i1<3;i1++){
		
				for( j=0;j<score.length;j++){
					
					System.out.println("请输入第"+(i1+1)+"个班的第"+(j+1)+"个同学的成绩");
					
					score[j]=scanner.nextDouble();
					
					total+=score[j];
					   avg=total/score.length;
					  
				} 
		avg=total/score.length;
		System.out.println("第"+(i1+1)+"个班的同学的平均成绩为："+avg);
	
	}
}
}}