package 算法;

import java.util.Scanner;




/**
 * 商场推出幸运抽奖活动
   抽奖规则：
    顾客的四位会员卡号的  1234 --->1+2+3+4
    各位数字之和大于20，
    则为幸运顾客。
 * @author Mindy
 *
 */
public class Demo01_shang_yu {

	 public static void main(String[] args) {
			
		  Scanner scanner = new Scanner(System.in );
		  
		  System.out.print("请输入四位会员卡号");
		  
		  // 1234--->各位数+四位数+百位数+千位数
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
