package day02_value.scanner03;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * 
 * */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入一个byte类型的整数");
		byte b=scanner.nextByte();
		
		System.out.println("请输入一个int类型的整数");
		int i=scanner.nextInt();
		
		System.out.println("请输入一个short类型的整数");
		short s=scanner.nextShort();
		
		System.out.println("请输入一个long类型的整数");
		long l=scanner.nextLong();
	
		System.out.println("请输入一个float类型的整数");
		float c=scanner.nextFloat();
		
		System.out.println("请输入一个double类型的整数");
		double d=scanner.nextDouble();
		
		System.out.println("请输入一个boolean类型的整数");
		boolean n=scanner.nextBoolean();
		
		System.out.println("请输入一个String类型的整数");
		String t=scanner.next();//String比较特殊。
		
		
//		这儿不能接受char。
	}

}
