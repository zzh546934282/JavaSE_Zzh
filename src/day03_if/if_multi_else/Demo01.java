package day03_if.if_multi_else;

import java.util.Scanner;

public class Demo01 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("请输入时间:");
	double time=scanner.nextDouble();
    if(time<=10){
    	System.out.println("请输入性别，男为0，女为1:");
    	int gender=scanner.nextInt();
    	if(gender==0){
    	System.out.println("进入决赛，分入男子组");
    	}else{
    		System.out.println("进入决赛，分入女子组");
    	}  	
    }else{
    	System.out.println("淘汰");
    }
    






    }
}
