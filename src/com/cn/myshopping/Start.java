package com.cn.myshopping;

import java.util.Scanner;

/**
 * MyShopping ��ʼ�˵�
 * @author Mindy
 *
 */
public class Start {

	public static void main(String[] args) {
	
		Scanner scanner =new Scanner(System.in);
		
		 System.out.println("\t\t\t��ӭʹ���������ع���ϵͳ");
		 System.out.println();  //����
		 System.out.println("\t\t\t1.��¼ϵͳ");
		 System.out.println();
		 System.out.println("\t\t\t2.�˳�");
		 System.out.println();
		 System.out.println("***********************************************************************");
		 System.out.print("��ѡ��,����������:");
		 int choice=scanner.nextInt();
		 
		switch(choice){
		    case 1:
		    	System.out.println("\t\t��ӭʹ���������ع������ϵͳ");
				System.out.println();
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				System.out.println();
				System.out.println("\t\t\t1.�ͻ���Ϣ����");
				System.out.println();
				System.out.println("\t\t\t2.�������");
				System.out.println();
				System.out.println("\t\t\t3.�������");
				System.out.println();
				System.out.println("\t\t\t4.ע��");
				System.out.println();
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				System.out.println();
				System.out.println("��ѡ����������");
		    	break;
		    case 2:
		    	System.exit(0);
	   }     
		choice=scanner.nextInt();
		switch(choice){
		    //�ͻ���Ϣ����
		    case 1:
		    	break;
		    //�������
		    case 2:
		
		
		}
}
	
}
