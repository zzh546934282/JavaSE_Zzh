package day02_value.type_change_04;

import java.util.Scanner;

public class Demo03_Guanxi_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
				
		//�����ĳ����Ƿ�С�����ĵĳɼ�
		
		
		System.out.print("�����������ĳɼ���");
		int zhangsanScore =scanner.nextInt();
		
		System.out.print("���������ĵĳɼ���");
		int lisiScore =scanner.nextInt();
		
		//�����ĳ����Ƿ�С�����ĵĳɼ�
		boolean result=zhangsanScore<lisiScore;
		System.out.println(result);
		
	}

}
