package day02_value.type_change_04;

public class Demo01 {
	public static void main(String[] args) {
		//������ת��������ô�Ľ���С�Ķ�û�¡�
		//��С���򣬴�С����byte��short��int��long��float��double��
		
		//���� 
		       byte b= 2;
		       int x=b;
		
		//ǿ������ת���������ѧ���ˣ����ǵá�
	


		       
	//��ʦ�ʼ�	       
		       
/**
 * ����ת��
 * @author Mindy
 *
 */


	
		
		    /**
		     * 1 ��ͬ�������ͱ�����ֵ
		     */
		    int num01 = 100;
		    
		    int num02 = num01;
		    
		    
		    
		    /**
		     * 1 �Զ�����ת��: Ŀ���������ʹ���Դ��������(С�ܲ��Ŵ��)
		     * int <----------------short
		     * Ŀ����������      Դ��������
		     */
		    short shortValue = 50;
		    
		    int intValue = shortValue;
		    System.out.println(intValue);
		    
		    /**
		     * 2 ǿ������ת��: Ŀ����������С��Դ��������(���ܲ���С��--ǿ��)
		     * short<-----int
		     */
		    shortValue = (short)intValue;
		    
		    
		    //float<-----short int long �Զ�����ת��
		    float floatValue = 100;
		    
		    floatValue = shortValue;  //100.0
		    
		    floatValue = intValue;
		    
		    long longVlaue = 1999;
		    
		    floatValue = longVlaue;
		    
		    
		    //short int long<------float ǿ������ת��
		    
		    shortValue = (short) floatValue;
		    
		    //����ת�ͣ��������ʽ�Ľ�����Զ�߬�������������͡�
		    floatValue=(floatValue+shortValue)/intValue;
		    
	}
		  
}



