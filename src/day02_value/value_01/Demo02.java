package day02_value.value_01;
/**
 * 
 * 声明变量语法 2
 * 
 * 
 * 
 * */
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		
		byte y=21;
		
		short z=123;
		
		long d=21324l;
		
		String r="sfsfa";
		
		char e='s';
		
		float q=2.3f;//float的后面要加个f，因为java默认的小数是double。
		double t=22.5;
		boolean i=true;
		
		System.out.println(x+y+z+d+r+e);
		System.out.println(q);
		System.out.println(t);
		System.out.println(i);
		
		
		
		byte k=12;
		byte l=4;
		byte b=(byte)(k+l);
		System.out.println(b);
	}

}
