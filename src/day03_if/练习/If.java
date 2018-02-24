package day03_if.练习;

import java.util.Scanner;

/**
 * 2.根据成绩输出对应的等级，使用if多分支和switch语句分别实现。
 *      a)	A级   [90,100]
		b)	B级   [80,90)
		c)	C级   [70,80)
		d)	D级   [60,70)
		e)	E级   [0,60)

 * @author zzh
 *
 */
public class If {
	
	public static void main(String[] args) {
		
		System.out.println("请输入成绩");
		
		Scanner scanner=new Scanner(System.in);
		
		double score=scanner.nextDouble();
		
		if(score>=90){
			System.out.println("A");
	    }else if(score>=80){
	    	System.out.println("B");	    	
	    }else if(score>=70)	{
	    	System.out.println("C");
	    }else if(score>=60){
	    	
	    }		
			
			
			
			
			
			
		}
		
	}
}
