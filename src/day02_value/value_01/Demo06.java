package day02_value.value_01;

/**
* 常量
* 1 一定声明赋值后,值不能再改变的变量称为常量
* 2 类里方法外
* 3 final修饰的变量就是常量
* 4 常量名全部大写
*/
public class Demo06 {
	
	public final static double PI=3.14;
	
	static double r= 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo06 m=new Demo06();
		
		System.out.println(m.PI);
		
		//计算圆的周长。
		double tolal=2*PI*r;
		System.out.println(tolal);
		//计算圆的面积。
		double area=PI*r*r;
		System.out.println(area);
		
		
	}

}
