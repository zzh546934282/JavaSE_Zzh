package HomeWork;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circle=new Circle();
				
	
		
		circle.getArea(3);
		circle.getPerimeter();
		int x=circle.getpointx(1);
        int y=circle.getpointy(1);
        int a=circle.getpointa(1);	
        int b=circle.getpointb(4);
        int d=(a-x)*(a-x)+(b-y)*(b-y);
        circle.cal(d);
	}
	
	
}
