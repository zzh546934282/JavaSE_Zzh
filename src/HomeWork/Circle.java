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
		System.out.println("Բ���Ϊ��"+area);
		
	}
	public void getPerimeter(){
			
		perimeter=2*PI*r;
		System.out.println("Բ���ܳ�Ϊ��"+perimeter);
	}
	public int getpointx(int x){
		this.x=x;
			System.out.println("Բ�ĵĺ�����Ϊ��"+x);
			return x;
	}
	public int getpointy(int y){
		this.y=y;
		System.out.println("Բ�ĵ�������Ϊ��"+y);
		return y;
				
	}
	public int getpointa(int a){
		System.out.println("�����ĺ�����Ϊ��"+a);
		
		return a;
	}
	public int getpointb(int b){
		System.out.println("������������Ϊ��"+b);
		return b;
	}
	public void cal(double d){
		if(d<r*r){
			
			System.out.println("����Բ��");
			
		}else if(d==r*r){
			
			System.out.println("����Բ��");
			
		}else{
			
			System.out.println("����Բ��");
			
		}
		
		
	}
}
