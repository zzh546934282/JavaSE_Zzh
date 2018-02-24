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
		  System.out.print("请输入学员人数:");
		
		  int num = scanner.nextInt();
		  
		  double score = 0;
		  int count = 0;
		  
		  
		  for (int i = 0; i < num; i++) {
			
			     System.out.print("请输入第"+(i+1)+"个学员的成绩");
			     
				 score = scanner.nextDouble();
				 
				 if(score <= 80){
					 continue;
				 }
				  count++;
		  }
		  
		  //80以上学员的百分比  2 / 3 = 0    2.0 / 3 = 0.666
		  double rate = (count * 1.0 / num ) * 100;

		  System.out.println("分数大于等于80分的学生比例:" + rate+"%");
		  
		  
	}
	}
