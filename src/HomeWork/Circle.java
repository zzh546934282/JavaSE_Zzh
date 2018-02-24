package HomeWork;



public class Circle {
	
	public final double PI=3.14;
	
	double r;
	
	double area;
	
	double perimeter;
	
	double x;
	
	double y;
	
	public void getArea(double r){
		this.r=r;
		area=PI*r*r;
		System.out.println("圆面积为："+area);
		
	}
	public void getPerimeter(){
			
		perimeter=2*PI*r;
		System.out.println("圆的周长为："+perimeter);
	}
	public int getpointx(int x){
		this.x=x;
			System.out.println("圆心的横坐标为："+x);
			return x;
	}
	public int getpointy(int y){
		this.y=y;
		System.out.println("圆心的纵坐标为："+y);
		return y;
				
	}
	public int getpointa(int a){
		System.out.println("随机点的横坐标为："+a);
		
		return a;
	}
	public int getpointb(int b){
		System.out.println("随机点的纵坐标为："+b);
		return b;
	}
	public void cal(double d){
		if(d<r*r){
			
			System.out.println("点在圆内");
			
		}else if(d==r*r){
			
			System.out.println("点在圆上");
			
		}else{
			
			System.out.println("点在圆外");
			
		}
		
		
	}
}
