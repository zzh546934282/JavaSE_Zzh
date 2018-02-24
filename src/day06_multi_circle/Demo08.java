package day06_multi_circle;

import java.util.Scanner;

/**
 * 若有3个班级各4名学员参赛，
计算每个班级参赛学员平均分，
统计成绩大于85分学员数
 * @author zzh
 *
 */
public class Demo08 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i;
		int j;
		int[] score=new int[4];
		int total=0;
		double avgre = 0;
		int count=0;
		
		for(i=0;i<3;i++){
		
			for(j=0;j<score.length;j++){
				
			System.out.println("请输入第"+(i+1)+"班第"+(j+1)+"个同学的成绩：");
			
				score[j]=scanner.nextInt();				
				
				if(score[j]>=80){
					count++;
				} 
				
				total+=score[j];
				 
				 avgre=total/score.length;
			
				 
			}
			System.out.println("第"+(i+1)+"班同学的平均分是："+avgre);
			System.out.println("所有班80分以上有"+count+"个人");
			
			
			
		}
	}
}
