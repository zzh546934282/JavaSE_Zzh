package day06_multi_circle.continue_test;

import java.util.Scanner;

/**
 *
 * 若有3个班级各4名学员参赛，
 * 计算每个班级参赛学员平均分，
 * 统计成绩大于85分学员数 
 * 
 * */
public class Demo01 {

	public static void main(String[] args) {
	
		Scanner scanner =new Scanner(System.in);
		int count=0;
		
		for (int i = 0; i < 3; i++) {
			int total = 0;
			int[] score =new int[4];
			for (int j = 0; j < score.length; j++) {
				System.out.print("请输入第"+(j+1)+"学生的成绩:");
				score[j]=scanner.nextInt();
					/*if(score[j]>85){
						count+=1;
					}*/
				
				if(score[j]<=85){
					continue;
				}
				count+=1;
			}
			
			
			for (int j = 0; j < score.length; j++) {
				    total+=score[j];
		    	}
			
			
		System.out.println("第"+(i+1)+"个班的4个学生的平均成绩："+total/4);
	    }
		
		System.out.println("所有班级成绩大于85分学员数 ："+count);
     }
     
}	

