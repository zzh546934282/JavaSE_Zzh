package day02_value.operator02;

import java.util.Scanner;

public class Demo02_Evaluate_Operator {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
        * 
        *      
        *  
        * 
        * */
		//创建Scanner
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("STB的成绩:");
		double STBScore=scanner.nextDouble();
		
		System.out.print("Java的成绩:");
		double javaScore=scanner.nextDouble();
		
		System.out.print("SQL的成绩:");
		double SQLScore=scanner.nextDouble();
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("STB\t\tJava\t\tSQL");
		System.out.println(STBScore+"\t\t"+javaScore+"\t\t"+SQLScore);
		
		System.out.println("-------------------------------------------------------");
		
		//计算java和SQL的成绩差
		double w=javaScore-SQLScore;
		System.out.println("java和SQL的成绩差:"+w);
		
		//计算3门课程的平均分
		double pjf=STBScore+javaScore+SQLScore;
		System.out.println("3门课程的平均分:"+pjf);
		
	}

}
