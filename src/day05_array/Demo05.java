package day05_array;

import java.util.Scanner;

/**
 * 有一个数列：8，4，2，1，23，344，12
循环输出数列的值
求数列中所有数值的和
猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数 
 * @author zzh
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		int total=0;
		
		int intArray[]={8,4,2,1,23,344,12};
		
		for(int i=0;i<intArray.length;i++)//循环输出数列的值
		{     
		 System.out.print(intArray[i]+"\t");
		 total+=intArray[i];//求数列中所有数值的和		 
		}
		
		System.out.println("所有数值的和为："+total);
		
		Scanner scanner=new Scanner(System.in);//从键盘中任意输入一个数据，判断数列中是否包含此数 
	
		System.out.println("请输入一个数");
		
		int number=scanner.nextInt();
		
		for(int i=0;i<intArray.length;i++){                        
		   
			if(number==intArray[i]){
		    
		    	System.out.println("数组中存在这个数");
		    	
		    	break;
		   
			}else{
				
				System.out.println("数组中不存在这个数");
				
				break;
			}
		    		    
		}
	}
	
}
