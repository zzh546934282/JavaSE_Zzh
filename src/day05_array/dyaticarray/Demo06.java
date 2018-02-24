package day05_array.dyaticarray;

public class Demo06 {
	 public static void main(String[] args) {
		    
		    
		    String[][] cities = new String[3][4];
		    //给一级菜单赋值
		    cities[0][0] = "辽宁省";   
		    cities[1][0] = "河北省";
		    cities[2][0] = "江苏省";
		    
		    cities[0][1] = "沈阳";
		    cities[0][2] = "大连";
		    cities[0][3] = "铁岭";
		    
		    cities[1][1] = "石家庄";
		    cities[1][2] = "保定";
		    cities[1][3] = "唐山";
		    
		    
		    cities[2][1] = "南京";
		    cities[2][2] = "昆山";
		    cities[2][3] = "无锡";
		    
		    
		    //遍历二维数组
		    for (int i = 0; i < cities.length; i++) {
				
		    	System.out.println(cities[i][0]);
		    	
		    	for (int j = 1; j < cities[i].length; j++) {
					
		    		  System.out.println("........"+cities[i][j]);
				}
		    	
		    	System.out.println("---------------------");
			}
		    
		    
		    
	  }
	  
	  
	  

}
