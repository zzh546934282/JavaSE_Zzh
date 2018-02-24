package com.cn.myshopping;

import java.util.Scanner;

/**
 * MyShopping 开始菜单
 * @author Mindy
 *
 */
public class Start {

	public static void main(String[] args) {
	
		Scanner scanner =new Scanner(System.in);
		
		 System.out.println("\t\t\t欢迎使用我行我素购物系统");
		 System.out.println();  //换行
		 System.out.println("\t\t\t1.登录系统");
		 System.out.println();
		 System.out.println("\t\t\t2.退出");
		 System.out.println();
		 System.out.println("***********************************************************************");
		 System.out.print("请选择,请输入数字:");
		 int choice=scanner.nextInt();
		 
		switch(choice){
		    case 1:
		    	System.out.println("\t\t欢迎使用我行我素购物管理系统");
				System.out.println();
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				System.out.println();
				System.out.println("\t\t\t1.客户信息管理");
				System.out.println();
				System.out.println("\t\t\t2.购物结算");
				System.out.println();
				System.out.println("\t\t\t3.真情回馈");
				System.out.println();
				System.out.println("\t\t\t4.注销");
				System.out.println();
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				System.out.println();
				System.out.println("请选择，输入数字");
		    	break;
		    case 2:
		    	System.exit(0);
	   }     
		choice=scanner.nextInt();
		switch(choice){
		    //客户信息管理
		    case 1:
		    	break;
		    //购物结算
		    case 2:
		
		
		}
}
	
}
