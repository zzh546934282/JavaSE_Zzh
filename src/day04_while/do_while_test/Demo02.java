package day04_while.do_while_test;
/**
 * 使用do-while实现：输出摄氏温度与华氏温度的对照表，要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
    转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 32
 * @author zzh
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		double number0=0;
		
		double number1;
		
		int count=0;
		
		System.out.println("摄氏温度\t\t华氏温度");
		
		do {
			number1=number0*9/5.0+32;
			
			System.out.println(number0+"\t\t"+number1);
			
			count++;
			
			number0+=20;
			
			
		}while((count<=10)&&(number0<=250));
		
	}
}
