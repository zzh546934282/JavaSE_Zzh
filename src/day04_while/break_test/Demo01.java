package day04_while.break_test;
/**
 * 从控制台接收5个学员的Java成绩
 * 并计算平均分
 * break: 如果循环过程中出现异常或其他逻辑,
 *        我们需要终止当前操作,并跳出整个循环体
 */
//import java.util.Scanner;         total+=scaner.nextDouble();  total=初始的total+接收的值
                                                   
//从控制台接收5个学员的Java成绩     
//并计算平均分
//public class Demo01 {
//	
//	public static void main(String[] args) {
//		
//		int total=0;
//		
//		double ave=0;
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		for(int student=0;student<5;student++){
//			
//			System.out.println("请输入第"+(student+1)+"个学生的成绩");
//			
//			int score=scanner.nextInt();
//
//			total+=score;
//			
//			ave=total/(student+1);
//		}
//			System.out.println("平均分为："+ave);
//		
//		
//		
//	}
//
//}




import java.util.Scanner; 
public class Demo01 {
public static void main(String[] args) {
	
			int total=0;
			
			double ave=0;
			
			boolean flag=false;
			
			int student;
			
			Scanner scanner=new Scanner(System.in);
			
			for(student=0;student<5;student++){
				
				System.out.println("请输入第"+(student+1)+"个学生的成绩");
				
				int score=scanner.nextInt();
							
				if(score<0){
								flag=true;
								break;
							}
					
				total+=score;
					
			}
		   	
			if(flag==false){
		   		
				ave=total/(student+1);	
		   		
				System.out.println("平均分为："+ave);
		   		
		   	}else{
		   		
		   		System.out.println("输入错误，请重新输入");
		   	}
			
			
			
	
}

}