package com.cn.myshopping;

import java.util.Scanner;

public class GoodsExchange {

	public static void main(String[] args) {
	
	System.out.println("请输入消费金额");
	
	Scanner scanner=new Scanner(System.in);
	
	double money=scanner.nextDouble();
	
	System.out.println("消费金额为："+money);
	
	
	System.out.println("是否参加优惠活动：");	
	System.out.println("1：满50元，加2元换购百事可乐1瓶");	
	System.out.println("2：满100元，加3元换购500ml可乐一瓶");	
	System.out.println("3：满100元，加10元换购5公斤面粉");	
	System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");	
	System.out.println("5: 满200元，加20元可换购欧莱雅爽肤水一瓶");	
	System.out.println("0：不换购");	
	
	
	System.out.println("请选择：");	
	int choice=scanner.nextInt();
	System.out.println("您符合"+choice+"优惠活动");
	String goodName="";//获取商品信息
	
	switch(choice){
		case 1:  
			if(money>50){
				money+=2;
			goodName="满50元，加2元换购百事可乐1瓶";
				break;
			}
		case 2:
			if(money>100){
				money+=3;
			goodName="满100元，加3元换购500ml可乐一瓶";
				break;
			}
		case 3:
			if(money>100){
				money+=10;
		    goodName="满100元，加10元换购5公斤面粉";
				break;
			}
		case 4:			
			if(money>200){
				money+=10;
		    goodName="满200元，加10元可换购1个苏泊尔炒菜锅";
				break;
			}
		case 5:
			if(money>200){
				money+=20;
			goodName=" 满200元，加20元可换购欧莱雅爽肤水一瓶";
				break;
			}
		case 0:
			goodName="不换购";								
		    
		default:
			System.out.println("输入错误，请重新输入");	 
	    }
	   System.out.println("换购项目："+goodName);
	   System.out.println("总金额"+money);
	  
	
	
	
	
	}
	 }
			
	


