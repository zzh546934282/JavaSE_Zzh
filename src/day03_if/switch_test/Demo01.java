package day03_if.switch_test;

//switch �еı��� ֻ���� byte short int char string  ������

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("������ɼ�:");
		String scroce = scanner.next();

		System.out.println("���ٴ�����ɼ�:");
		int scroce1 = scanner.nextInt();

		if (scroce1 == 1) {
			System.out.println("�����ܳ�");

		} else if (scroce1 == 2) {
			System.out.println("����������");

		} else if (scroce1 == 3) {
			System.out.println("����ƻ���ʼǱ�");

		} else if (scroce1 == 4) {
			System.out.println("�����ƶ�Ӳ��");

		} else if (scroce1 == 5) {
			System.out.println("ʲô��������");
		}

		switch (scroce) {

			case "����":
				System.out.println("�����ܳ�");
				break;
	
			case "����":
				System.out.println("����������");
				break;
				
			case "����":
				System.out.println("����ƻ���ʼǱ�");
				break;
				
			case "����":
				System.out.println("�����ƶ�Ӳ��");
				break;
				
			default:
				System.out.println("ʲôҲ������");
				break;

		}

	}
}
