package day04_while.while_text;

import java.util.Scanner;

/*
 * 2012������ѧԱ25���ˣ�ÿ������25%�����ʰ��������ٶȣ�����һ����ѵѧԱ�������ﵽ100���ˣ�
 */
public class Demo03 {
	
	public static void main(String[] args) {
		int year=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������ѧУ2012���ж���ѧԱ");
		int sum=scanner.nextInt();
		
		System.out.println("������ѧУÿ���������");
		double grow=scanner.nextDouble();
		
		while(sum<=100){
			sum=sum+(int)(sum*grow);
			year++;	
		}
		System.out.println("��2012������Ҫ"+year+"��ѧԱ�������ﵽ100����");
		
	}
}
