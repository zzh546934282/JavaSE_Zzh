package day03_if.if_else_if;

import java.util.Scanner;

public class Demo01 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("������ɼ���");
	double score = scanner.nextDouble();
	 if(score>=60){
		System.out.println("����");
	
	}else if(score>=80){
		System.out.println("����");
	}else if(score>=70){
		System.out.println("����");
	}else if(score>=90){
		System.out.println("����");
	}
	
	
	//�����߼�����   ��ΧӦ��С������Ϊif else if ֵΪtrue ������ֱ������
}
}
