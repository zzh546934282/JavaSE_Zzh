package com.cn.myshopping;

import java.util.Scanner;

/**
 * �˿�	 ��  ��
	��ͨ�˿͹�����100Ԫ	9��
	��Ա����        	    8��
	��Ա������200Ԫ	    7.5��
 * @author Mindy
 *
 */
public class Pay2 {
public static void main(String[] args) {
    double money;
	
    Scanner scanner=new Scanner(System.in);
	  	System.out.print("�������Ƿ��ǻ�Ա����Y//��\t\t");
	  	String vip=scanner.next();
	  	System.out.print("�����빺����\t\t\t");
	  	int price=scanner.nextInt();
    
    if(vip.equals("Y")){    //������ vip=="Y"
    	
    	if(price>=200){
    	  System.out.println("��Ʒ�ۿ�Ϊ\t\t\t\t7.5��");
    	  money=price*0.75;
    	  System.out.println("��Ҫ֧��"+"\t\t\t\t"+money);
    	
         }else{
    	  System.out.println("��Ʒ�ۿ�Ϊ\t\t\t\t8��");
    	  money=price*0.8;
    	  System.out.println("��Ҫ֧��"+"\t\t\t\t"+money);
        } 	
   
    
    }else{
    	
    	if(price>=100){
    	  System.out.println("��Ʒ�ۿ�Ϊ��\t\t9��");
    	  money=price*0.9;
    	  System.out.println("��Ҫ֧����"+"\t\t"+money);
    	
    	}else{
    	  System.out.println("\t\t������"); 		
    	}
    }
    




}

}
