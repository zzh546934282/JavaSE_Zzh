package com.cn.myshopping;

import java.util.Scanner;

public class GoodsExchange {

	public static void main(String[] args) {
	
	System.out.println("���������ѽ��");
	
	Scanner scanner=new Scanner(System.in);
	
	double money=scanner.nextDouble();
	
	System.out.println("���ѽ��Ϊ��"+money);
	
	
	System.out.println("�Ƿ�μ��Żݻ��");	
	System.out.println("1����50Ԫ����2Ԫ�������¿���1ƿ");	
	System.out.println("2����100Ԫ����3Ԫ����500ml����һƿ");	
	System.out.println("3����100Ԫ����10Ԫ����5�������");	
	System.out.println("4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�");	
	System.out.println("5: ��200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");	
	System.out.println("0��������");	
	
	
	System.out.println("��ѡ��");	
	int choice=scanner.nextInt();
	System.out.println("������"+choice+"�Żݻ");
	String goodName="";//��ȡ��Ʒ��Ϣ
	
	switch(choice){
		case 1:  
			if(money>50){
				money+=2;
			goodName="��50Ԫ����2Ԫ�������¿���1ƿ";
				break;
			}
		case 2:
			if(money>100){
				money+=3;
			goodName="��100Ԫ����3Ԫ����500ml����һƿ";
				break;
			}
		case 3:
			if(money>100){
				money+=10;
		    goodName="��100Ԫ����10Ԫ����5�������";
				break;
			}
		case 4:			
			if(money>200){
				money+=10;
		    goodName="��200Ԫ����10Ԫ�ɻ���1���ղ������˹�";
				break;
			}
		case 5:
			if(money>200){
				money+=20;
			goodName=" ��200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ";
				break;
			}
		case 0:
			goodName="������";								
		    
		default:
			System.out.println("�����������������");	 
	    }
	   System.out.println("������Ŀ��"+goodName);
	   System.out.println("�ܽ��"+money);
	  
	
	
	
	
	}
	 }
			
	


