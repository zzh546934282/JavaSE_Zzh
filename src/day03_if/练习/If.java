package day03_if.��ϰ;

import java.util.Scanner;

/**
 * 2.���ݳɼ������Ӧ�ĵȼ���ʹ��if���֧��switch���ֱ�ʵ�֡�
 *      a)	A��   [90,100]
		b)	B��   [80,90)
		c)	C��   [70,80)
		d)	D��   [60,70)
		e)	E��   [0,60)

 * @author zzh
 *
 */
public class If {
	
	public static void main(String[] args) {
		
		System.out.println("������ɼ�");
		
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
