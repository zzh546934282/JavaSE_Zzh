package 算法;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 计算3-1
 * 
 * 用反码，补码计算
 * 
 * */
public class Ma {

	
	
	private final int  D=2;
	public static final int Y=2;
	private int X;
	public int getX(){
		return X;
	}
	public void setX(int X){
		this.X=X;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*  3：  0000 0011        -1：  1000 0001       相加得到
		 反码：  0000 0011       反码： 1111 1110       0000 0010
		 补码：  0000 0011       补码： 1111 1111       0000 0010

		*/
		Ma m=new Ma();
		m.setX(6); 
		int x=m.getX();
		
		System.out.println(m.D);
		
		
	}

}
