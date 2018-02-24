package HomeWork;

/**
 * 交通工具类
 * @author Mindy
 *
 */
public class Vehicle {

	  
	  //属性： 速度(speed)、 体积(size)等， 
	  int speed;    //速度(speed)
	  double size; //体积(size)
	  
	  //打印体积
	  public void sizes(){
		  
		System.out.println("汽车体积为："+size+"平方厘米");  
		  
	  }
	  
	  
	  //移动(move())
	  public void move(){
		  
		  System.out.println("移动.......");
	  }
	  
	  
	  //设置速度(setSpeed(int speed))
	  public void setSpeed(int speed){
		  
		  this.speed =speed;
	  
	  System.out.println("汽车初始速度为:"+speed);
	  }
	  
	  //加速 speedUp()
	  public void speedUp(){
		  
		   System.out.println("加速....");
		   speed += 1;
		   System.out.println(speed);
	  }
	  
	  
	  //减速 speedDown()
	  public void speedDown(){
		
		  System.out.println("减速....");
		    speed-=1;
		    System.out.println(speed);
	  }
	  
	  
	  
	  
}
