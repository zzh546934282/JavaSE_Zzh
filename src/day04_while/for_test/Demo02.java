package day04_while.for_test;

import java.util.Scanner;

//�ӿ���̨����5��ѧԱ��Java�ɼ�
//������ƽ����
public class Demo02 {
	
	public static void main(String[] args) {
		
		int total=0;
		
		double ave=0;
		
		Scanner scanner=new Scanner(System.in);
		
		for(int student=1;student<=5;student++){
			
			System.out.println("�������"+student+"��ѧ���ĳɼ�");
			
			int score=scanner.nextInt();

			total+=score;
			
			ave=total/student;
		}
			System.out.println("ƽ����Ϊ��"+ave);
		
		
		
	}

}
