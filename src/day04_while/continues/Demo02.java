package day04_while.continues;

import java.util.Scanner;
/**
 * 
 * @author zzh
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		  
		  Scanner scanner = new Scanner(System.in 

	);
		  System.out.print("������ѧԱ����:");
		
		  int num = scanner.nextInt();
		  
		  double score = 0;
		  int count = 0;
		  
		  
		  for (int i = 0; i < num; i++) {
			
			     System.out.print("�������"+(i+1)+"��ѧԱ�ĳɼ�");
			     
				 score = scanner.nextDouble();
				 
				 if(score <= 80){
					 continue;
				 }
				  count++;
		  }
		  
		  //80����ѧԱ�İٷֱ�  2 / 3 = 0    2.0 / 3 = 0.666
		  double rate = (count * 1.0 / num ) * 100;

		  System.out.println("�������ڵ���80�ֵ�ѧ������:" + rate+"%");
		  
		  
	}
	}
