package day03_if.练习;

import java.util.Scanner;

/**
 * 我想买车，买什么车决定于我在银行有多少存款
如果我的存款超过500万，我就买凯迪拉克
否则，如果我的存款超过100万，我就买帕萨特
否则， 如果我的存款超过50万，我就买依兰特
否则， 如果我的存款超过10万，我就买奥托
否则， 如果我的存款10万以下 ，我买捷安特
 * @author zzh
 * 如果循环中只有一条操作则可以去掉大括号。
 */
public class Practise {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
   System.out.println("请输入我有多少万");
   int money=scanner.nextInt();
   if(money>=500){
System.out.println("我买凯迪拉克");	   
   }else if(money>=100){
	   System.out.println("我买帕萨特");
   }else if(money>=50){
	   System.out.println("我买伊兰特");
   }else if(money>=10){
	   System.out.println("我买奥拓");
   }else if(money<10){
	   System.out.println("我买捷安特");
   }
}
}
