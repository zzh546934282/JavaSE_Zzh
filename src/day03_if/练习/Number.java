package day03_if.��ϰ;
/**
 * 1.	����һ�������ж�����������ż��
 */
import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		
		System.out.println("������һ����");
		
		Scanner scanner=new Scanner(System.in);
		
		int anumber=scanner.nextInt();
		
		if(anumber%2==0){
			System.out.println("ż��");	
		}else{
			System.out.println("����");
		}
}
}
