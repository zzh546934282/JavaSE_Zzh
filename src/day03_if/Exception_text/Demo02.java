package day03_if.Exception_text;
/**
 * ��ʽ2   ����---debug��bug debug �ҳ��ӣ�
 */
import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("���������֣�");
		//scanner.hasNext()�ж�����������Ƿ�������
        //if(scanner.hasNextInt()==true){
		if(scanner.hasNextInt()){
			int num=scanner.nextInt();
			//java.util.InputMismatchException
			System.out.println("����Ϊ��"+num);

		}else{
			System.out.println("�����������������....");
		}
		System.out.println("ϵͳ������������.....");
		
	}

}
