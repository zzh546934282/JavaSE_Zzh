package day04_while.while_text;

import java.util.Scanner;

/**
 * ��ʦÿ�����źƵ�ѧϰ�����Ƿ�ϸ�������ϸ���������С�
   ��ʦ���źư��ŵ�ÿ���ѧϰ����Ϊ��
   �����Ķ��̲ģ�ѧϰ���۲��֣������ϻ���̣����մ��벿�֡�
 * @author zzh
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		String score="No";
//		
//		while(score.equalsIgnoreCase("No")){    //score=="No"  ����ʱ������
//		System.out.println("�����Ķ��̲ģ�ѧϰ���۲���");
//		System.out.println("�����ϻ���̣����մ��벿��");
//		System.out.println("�Ƿ���ɿ���?");
//		score=scanner.next();
//		
//	    }
//		System.out.println("��ɿ���");
		
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