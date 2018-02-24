package day05_array.dyaticarray;

import java.util.Scanner;

/**
 *  公司年销售额求和
	某公司按照季度和月份统计的数据如下：单位(万元)
	第一季度：22,66,44
	第二季度：77,33,88
	第三季度：25,45,65
	第四季度：11,66,99

 * @author zzh
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
	
		
		int total = 0;
		
		int score[][]=new int[3][4];
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<score.length;i++){
			 
			System.out.println("每季度有三个月份");
			
			 for(int j=0;j<score[i].length;j++){
				
				System.out.println("请输入第"+(i+1)+"季度第"+(j+1)+"月份的金额");
				
				int money=scanner.nextInt();
				
				total+=money;
				
			}
			
			System.out.println("总和为："+total);
			
		}
	}
}
