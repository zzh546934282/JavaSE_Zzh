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
		//����Scanner
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("STB�ĳɼ�:");
		double STBScore=scanner.nextDouble();
		
		System.out.print("Java�ĳɼ�:");
		double javaScore=scanner.nextDouble();
		
		System.out.print("SQL�ĳɼ�:");
		double SQLScore=scanner.nextDouble();
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("STB\t\tJava\t\tSQL");
		System.out.println(STBScore+"\t\t"+javaScore+"\t\t"+SQLScore);
		
		System.out.println("-------------------------------------------------------");
		
		//����java��SQL�ĳɼ���
		double w=javaScore-SQLScore;
		System.out.println("java��SQL�ĳɼ���:"+w);
		
		//����3�ſγ̵�ƽ����
		double pjf=STBScore+javaScore+SQLScore;
		System.out.println("3�ſγ̵�ƽ����:"+pjf);
		
	}

}
