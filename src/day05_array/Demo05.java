package day05_array;

import java.util.Scanner;

/**
 * ��һ�����У�8��4��2��1��23��344��12
ѭ��������е�ֵ
��������������ֵ�ĺ�
������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ�������� 
 * @author zzh
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		int total=0;
		
		int intArray[]={8,4,2,1,23,344,12};
		
		for(int i=0;i<intArray.length;i++)//ѭ��������е�ֵ
		{     
		 System.out.print(intArray[i]+"\t");
		 total+=intArray[i];//��������������ֵ�ĺ�		 
		}
		
		System.out.println("������ֵ�ĺ�Ϊ��"+total);
		
		Scanner scanner=new Scanner(System.in);//�Ӽ�������������һ�����ݣ��ж��������Ƿ�������� 
	
		System.out.println("������һ����");
		
		int number=scanner.nextInt();
		
		for(int i=0;i<intArray.length;i++){                        
		   
			if(number==intArray[i]){
		    
		    	System.out.println("�����д��������");
		    	
		    	break;
		   
			}else{
				
				System.out.println("�����в����������");
				
				break;
			}
		    		    
		}
	}
	
}
