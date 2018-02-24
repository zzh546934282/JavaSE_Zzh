package day02_value.type_change_04;

import java.util.Scanner;

public class Demo03_Guanxi_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
				
		//张三的城市是否小于李四的成绩
		
		
		System.out.print("请输入张三的成绩：");
		int zhangsanScore =scanner.nextInt();
		
		System.out.print("请输入李四的成绩：");
		int lisiScore =scanner.nextInt();
		
		//张三的城市是否小于李四的成绩
		boolean result=zhangsanScore<lisiScore;
		System.out.println(result);
		
	}

}
