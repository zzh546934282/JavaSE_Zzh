package day04_while.do_while_test;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean isOk=false;
		do{
				
			System.out.println("�����Ķ��̲ģ�ѧϰ���۲���");
			System.out.println("�����ϻ���̣����մ��벿��");				
			System.out.println("�Ƿ���ɿ���?");
			isOk=scanner.nextBoolean();
			
		}while(isOk==false);
		
		System.out.println("��ɿ���");
		
		
    

	}
}
