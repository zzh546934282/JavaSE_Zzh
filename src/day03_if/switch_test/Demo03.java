package day03_if.switch_test;

/**
 * switch��������������ֻ����  byte short int  char String
 *
 */
public class Demo03 {

	  public static void main(String[] args) {
		
		    
		    
		    String result1 = "����";//���� ���� ���� ���� ������
		   
		  
		    switch(result1){
		    
		          case "����":
		        	  System.out.println("�����ܳ�");
		        	  break;  //�������switch�﷨
		        	  
		          case "����":
		        	  System.out.println("����������");
		        	  break;
		         
		          case "����":
		        	  System.out.println("����ƻ���ʼǱ�");
		        	  break;
		          
		          case "����":
		        	  System.out.println("�����ƶ�Ӳ��");
		        	  break;
		          
		          default:
		        	  System.out.println("ʲôҲ������");
		        	  break;
		        		  
		    }
		    
		    int result2 = 1;
		    
		    switch(result2){
		    
	          case 1:
	        	  System.out.println("�����ܳ�");
	        	  break;  //�������switch�﷨
	        	  
	          case 2:
	        	  System.out.println("����������");
	        	  break;
	          
	          default:
	        	  System.out.println("ʲôҲ������");
	        	  break;
	        		  
	       }
		    
            byte result3 = 1;
		    //short result3 = 1;
		    //long result3 = 1;  long������
		    //float result3 = 1; ������
		    //double result3 = 1;������
		    //char result3 = '��';
		    //boolean result3 = true; ������
		    
		    switch(result3){
		    
	          case 1:
	        	  System.out.println("�����ܳ�");
	        	  break;  //�������switch�﷨
	        	  
	          case 2:
	        	  System.out.println("����������");
	        	  break;
	          
	          default:
	        	  System.out.println("ʲôҲ������");
	        	  break;
	        		  
	       }
		    
		    
		    
		    
		    
		    
		    
	  }
}
