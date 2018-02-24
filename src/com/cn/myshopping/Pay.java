package com.cn.myshopping;

import java.util.Scanner;

/**
 * 实现购物结算
 * 从控制台接收实际消费金额
 * 消费总额 = 实际消费金额  * 8折
 * 打印输出
 * @author Mindy
 *
 */
public class Pay {

	 public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("********************消费单********************");
		  
		  String t_shirt_str = "T恤";
		  String t_shot_str  = "网球鞋";
		  String t_ball_str  = "网球拍";
		  
		  int t_shirt = 245;
		  int t_shot  = 570;
		  int t_ball  = 320;
		  
		  int t_shirt_num = 2;
		  int t_shot_num  = 1;
		  int t_ball_num  = 1;
		  
		  
		  
		  System.out.println("购买物品\t\t单价\t\t个数金额");
		  
		  System.out.println(t_shirt_str  + "\t\t" + t_shirt + "\t\t"
		                     + t_shirt_num + "\t\t" + (t_shirt * t_shirt_num));
		  
		  System.out.println(t_shot_str  + "\t\t" + t_shot + "\t\t"
                           + t_shot_num  + "\t\t" + (t_shot * t_shot_num));
		  
		  System.out.println(t_ball_str  + "\t\t" + t_ball + "\t\t"
                           + t_ball_num   + "\t\t" + (t_ball * t_ball_num));
		  
		  
		  int total = (t_shirt * t_shirt_num)+(t_shot * t_shot_num)+(t_ball * t_ball_num);
		  
		  System.out.println("消费总金额:" + total);
		  
		 
		  System.out.print("请输入实际消费金额:");
		  double money = scanner.nextDouble();
		  
		  double diff = money - total;
		  
		  System.out.print("找钱:"+diff);
		  
		  
		  double jifen = 33;
		  
		  System.out.println("本次购物所获积分:"+jifen);
		  
		  
		  System.out.print("请输入折扣:");
		  
		  double rate = scanner.nextDouble();
		  
		  
		  double t_shirt_rate = 245 * rate;
		  double t_shot_rate  = 570 * rate;
		  double t_ball_rate  = 320 * rate;
		  
		  System.out.println(t_shirt_str + "折扣价格< 100吗:" + (t_shirt_rate < 100));
		  System.out.println(t_shot_str  + "折扣价格 < 100吗:" + (t_shot_rate  < 100));
		  System.out.println(t_ball_str  + "折扣价格 < 100吗:" + (t_ball_rate  < 100));
		  
		  
		  
	 }
	 
}
