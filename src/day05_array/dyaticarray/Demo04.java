package day05_array.dyaticarray;

import java.util.Scanner;

/**
 *  ��˾�����۶����
	ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
	��һ���ȣ�22,66,44
	�ڶ����ȣ�77,33,88
	�������ȣ�25,45,65
	���ļ��ȣ�11,66,99

 * @author zzh
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
	
		
		int total = 0;
		
		int score[][]=new int[3][4];
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<score.length;i++){
			 
			System.out.println("ÿ�����������·�");
			
			 for(int j=0;j<score[i].length;j++){
				
				System.out.println("�������"+(i+1)+"���ȵ�"+(j+1)+"�·ݵĽ��");
				
				int money=scanner.nextInt();
				
				total+=money;
				
			}
			
			System.out.println("�ܺ�Ϊ��"+total);
			
		}
	}
}
