package day03_if.if_multi_else;

import java.util.Scanner;

public class Demo01 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("������ʱ��:");
	double time=scanner.nextDouble();
    if(time<=10){
    	System.out.println("�������Ա���Ϊ0��ŮΪ1:");
    	int gender=scanner.nextInt();
    	if(gender==0){
    	System.out.println("�������������������");
    	}else{
    		System.out.println("�������������Ů����");
    	}  	
    }else{
    	System.out.println("��̭");
    }
    






    }
}
