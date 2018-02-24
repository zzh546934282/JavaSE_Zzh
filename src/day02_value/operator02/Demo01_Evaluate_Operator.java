package day02_value.operator02;

public class Demo01_Evaluate_Operator {
	

	public static final int NUM=2;//常量必须在方法外申明。
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int num;

	    num = NUM+1000;  //常量
	    
	    System.out.println(num);
	    
	    int value = 90;
	    num = value;    //变量
	    System.out.println(num);
	    
	    
	    num = 1000 + value;  //表达式
	    System.out.println(num);
	    
		int nu=324;
		int x=nu+22;
		System.out.println(x);
		
		nu=22;
		System.out.println(nu);
		
		
		
	}

}
