package com.cn.myshopping;

import java.util.Scanner;

/**
 * ʵ�ֹ������
 * �ӿ���̨����ʵ�����ѽ��
 * �����ܶ� = ʵ�����ѽ��  * 8��
 * ��ӡ���
 * @author Mindy
 *
 */
public class Pay {

	 public static void main(String[] args) {
	
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("********************���ѵ�********************");
		  
		  String t_shirt_str = "T��";
		  String t_shot_str  = "����Ь";
		  String t_ball_str  = "������";
		  
		  int t_shirt = 245;
		  int t_shot  = 570;
		  int t_ball  = 320;
		  
		  int t_shirt_num = 2;
		  int t_shot_num  = 1;
		  int t_ball_num  = 1;
		  
		  
		  
		  System.out.println("������Ʒ\t\t����\t\t�������");
		  
		  System.out.println(t_shirt_str  + "\t\t" + t_shirt + "\t\t"
		                     + t_shirt_num + "\t\t" + (t_shirt * t_shirt_num));
		  
		  System.out.println(t_shot_str  + "\t\t" + t_shot + "\t\t"
                           + t_shot_num  + "\t\t" + (t_shot * t_shot_num));
		  
		  System.out.println(t_ball_str  + "\t\t" + t_ball + "\t\t"
                           + t_ball_num   + "\t\t" + (t_ball * t_ball_num));
		  
		  
		  int total = (t_shirt * t_shirt_num)+(t_shot * t_shot_num)+(t_ball * t_ball_num);
		  
		  System.out.println("�����ܽ��:" + total);
		  
		 
		  System.out.print("������ʵ�����ѽ��:");
		  double money = scanner.nextDouble();
		  
		  double diff = money - total;
		  
		  System.out.print("��Ǯ:"+diff);
		  
		  
		  double jifen = 33;
		  
		  System.out.println("���ι����������:"+jifen);
		  
		  
		  System.out.print("�������ۿ�:");
		  
		  double rate = scanner.nextDouble();
		  
		  
		  double t_shirt_rate = 245 * rate;
		  double t_shot_rate  = 570 * rate;
		  double t_ball_rate  = 320 * rate;
		  
		  System.out.println(t_shirt_str + "�ۿۼ۸�< 100��:" + (t_shirt_rate < 100));
		  System.out.println(t_shot_str  + "�ۿۼ۸� < 100��:" + (t_shot_rate  < 100));
		  System.out.println(t_ball_str  + "�ۿۼ۸� < 100��:" + (t_ball_rate  < 100));
		  
		  
		  
	 }
	 
}
