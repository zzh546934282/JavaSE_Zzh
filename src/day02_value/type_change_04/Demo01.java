package day02_value.type_change_04;

public class Demo01 {
	public static void main(String[] args) {
		//自类型转换：这儿用大的接收小的都没事。
		//大小排序，从小到大，byte，short，int，long，float，double。
		
		//例如 
		       byte b= 2;
		       int x=b;
		
		//强制类型转换：这个我学过了，都记得。
	


		       
	//老师笔记	       
		       
/**
 * 类型转换
 * @author Mindy
 *
 */


	
		
		    /**
		     * 1 相同数据类型变脸赋值
		     */
		    int num01 = 100;
		    
		    int num02 = num01;
		    
		    
		    
		    /**
		     * 1 自动类型转换: 目标数据类型大于源数据类型(小萝卜放大坑)
		     * int <----------------short
		     * 目标数据类型      源数据类型
		     */
		    short shortValue = 50;
		    
		    int intValue = shortValue;
		    System.out.println(intValue);
		    
		    /**
		     * 2 强制类型转换: 目标数据类型小于源数据类型(大萝卜放小坑--强切)
		     * short<-----int
		     */
		    shortValue = (short)intValue;
		    
		    
		    //float<-----short int long 自动类型转换
		    float floatValue = 100;
		    
		    floatValue = shortValue;  //100.0
		    
		    floatValue = intValue;
		    
		    long longVlaue = 1999;
		    
		    floatValue = longVlaue;
		    
		    
		    //short int long<------float 强制类型转换
		    
		    shortValue = (short) floatValue;
		    
		    //向上转型：整个表达式的结果将自动攥成最大的数据类型。
		    floatValue=(floatValue+shortValue)/intValue;
		    
	}
		  
}



