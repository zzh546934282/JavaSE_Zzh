package HomeWork;

public class VehicleTest {

	  public static void main(String[] args) {
		
		    //创建对象
		    Vehicle vehicle = new Vehicle();
		    
		   
		    //给属性赋值
		    vehicle.speed = 10;
		    vehicle.size = 500;
		  
		    //调用方法
		    vehicle.sizes();
		    vehicle.move();
		    vehicle.setSpeed(100);
		    vehicle.speedUp();
		    vehicle.speedDown();
		   
		    	    
	  }
}
