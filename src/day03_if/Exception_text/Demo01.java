package day03_if.Exception_text;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("����������");
		
		//scanner.hasNextInt();�ж�����������Ƿ�Ϊ����
		//if(scanner.hasNextInt()==true){
		if(scanner.hasNextInt()){
			int num =scanner.nextInt();
			
			System.out.println("����Ϊ��"+num);
		}
		else{
			System.out.println("�����������������...... ");
		}
		System.out.println("ϵͳ������������...... ");
	}
}
