package day05_array;

public class Demo02 {
	public static void main(String[] args) {
		//�﷨1                     
		int[] intArray;
		intArray=new int[5];
		
		intArray[0]=100;
		intArray[1]=90;
		intArray[2]=80;
		intArray[3]=70;
		intArray[4]=60;
//		intArray[5]=60;
//		Thread [main] (Suspended (exception ArrayIndexOutOfBoundsException))	
//		Demo02.main(String[]) line: 13	 �������鷶Χ ����
		

		System.out.println(intArray);
		//�﷨2
		//int[] intArray1=new int[5];
		//������ ���Է��� ������ �� ������ �ĺ���
		//int intArray1[]=new int[5];
		    
		//�﷨3
		int[] intArray2=new int[]{100,90,80,70,60};
		
		//�﷨4
		int[] intArray3={100,90,80,70,60};
		
}
}
