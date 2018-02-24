package day03_if.switch_test;


/**
 * if的复杂条件练习
 * 如果张浩的java成绩大于90同时音乐成绩大于80可以出去玩
 * 或者
 * 如果张浩的java成绩大于80同时音乐成绩大于99也可以出去玩
 * @author Mindy
 *
 */
public class Demo04 {

	  public static void main(String[] args) {
		
		  
		  double javaScore = 99;
		  double musicScore = 99;
		  
		  if(((javaScore >=90) && (musicScore >=80))
				  ||
			  ((javaScore >=80) &&(musicScore >=99))){
			  
			    System.out.println("出去玩...");
		  }
		  
		  
	}
}
