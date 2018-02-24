package com.cn.myshopping;

import java.util.Scanner;

/**
 * 顾客	 折  扣
	普通顾客购物满100元	9折
	会员购物        	    8折
	会员购物满200元	    7.5折
 * @author Mindy
 *
 */
public class Pay2 {
public static void main(String[] args) {
    double money;
	
    Scanner scanner=new Scanner(System.in);
	  	System.out.print("请输入是否是会员，是Y//否\t\t");
	  	String vip=scanner.next();
	  	System.out.print("请输入购物金额\t\t\t");
	  	int price=scanner.nextInt();
    
    if(vip.equals("Y")){    //不能用 vip=="Y"
    	
    	if(price>=200){
    	  System.out.println("商品折扣为\t\t\t\t7.5折");
    	  money=price*0.75;
    	  System.out.println("需要支付"+"\t\t\t\t"+money);
    	
         }else{
    	  System.out.println("商品折扣为\t\t\t\t8折");
    	  money=price*0.8;
    	  System.out.println("需要支付"+"\t\t\t\t"+money);
        } 	
   
    
    }else{
    	
    	if(price>=100){
    	  System.out.println("商品折扣为：\t\t9折");
    	  money=price*0.9;
    	  System.out.println("需要支付："+"\t\t"+money);
    	
    	}else{
    	  System.out.println("\t\t不打折"); 		
    	}
    }
    




}

}
