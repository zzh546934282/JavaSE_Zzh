package day03_if.Exception_text;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入数字");
		
		//scanner.hasNextInt();判断输入的内容是否为数字
		//if(scanner.hasNextInt()==true){
		if(scanner.hasNextInt()){
			int num =scanner.nextInt();
			
			System.out.println("数字为："+num);
		}
		else{
			System.out.println("输入错误，请重新输入...... ");
		}
		System.out.println("系统继续正常运行...... ");
	}
}
