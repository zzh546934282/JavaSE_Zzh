package day05_array.dyaticarray;

public class Demo06 {
	 public static void main(String[] args) {
		    
		    
		    String[][] cities = new String[3][4];
		    //��һ���˵���ֵ
		    cities[0][0] = "����ʡ";   
		    cities[1][0] = "�ӱ�ʡ";
		    cities[2][0] = "����ʡ";
		    
		    cities[0][1] = "����";
		    cities[0][2] = "����";
		    cities[0][3] = "����";
		    
		    cities[1][1] = "ʯ��ׯ";
		    cities[1][2] = "����";
		    cities[1][3] = "��ɽ";
		    
		    
		    cities[2][1] = "�Ͼ�";
		    cities[2][2] = "��ɽ";
		    cities[2][3] = "����";
		    
		    
		    //������ά����
		    for (int i = 0; i < cities.length; i++) {
				
		    	System.out.println(cities[i][0]);
		    	
		    	for (int j = 1; j < cities[i].length; j++) {
					
		    		  System.out.println("........"+cities[i][j]);
				}
		    	
		    	System.out.println("---------------------");
			}
		    
		    
		    
	  }
	  
	  
	  

}
