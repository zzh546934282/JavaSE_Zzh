package day03_if.switch_test;

import java.util.Scanner;

public class Demo02 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("ÇëÊäÈëĞÇÆÚÊı");
	int result=scanner.nextInt();
	switch(result){
		case 1:System.out.println("Èâ");
		case 2:System.out.println("²Ë");
		case 3:System.out.println("ÉÕ¿¾");
		case 4:System.out.println("ºº±¤");
		case 5:System.out.println("³Ô");
		case 6:System.out.println("ºÈÌÀ");
		case 7:System.out.println("²»³Ô");
	}
      	
}
}
