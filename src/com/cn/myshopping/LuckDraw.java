package com.cn.myshopping;

import java.util.Scanner;

public class LuckDraw {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in );
		  
		  System.out.print("��������λ��Ա����");
		  
		  // 1234--->��λ��+ʮλ��+��λ��+ǧλ��
		  int vipNo = scanner.nextInt();
		  
		  int gewei,shiwei,baiwei,qianwei;
		  
		  gewei   = vipNo % 10 ;
		  shiwei  = vipNo / 10  % 10;
		  baiwei  = vipNo / 100 % 10;
		  qianwei =  vipNo / 1000 ;
		  
		  int total = gewei+shiwei+baiwei+qianwei;
		  
		  boolean result = total > 20;
		  
		  System.out.println(result);
				 
		  
		
	}

}
