package day04_while.break_test;
/**
 * �ӿ���̨����5��ѧԱ��Java�ɼ�
 * ������ƽ����
 * break: ���ѭ�������г����쳣�������߼�,
 *        ������Ҫ��ֹ��ǰ����,����������ѭ����
 */
//import java.util.Scanner;         total+=scaner.nextDouble();  total=��ʼ��total+���յ�ֵ
                                                   
//�ӿ���̨����5��ѧԱ��Java�ɼ�     
//������ƽ����
//public class Demo01 {
//	
//	public static void main(String[] args) {
//		
//		int total=0;
//		
//		double ave=0;
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		for(int student=0;student<5;student++){
//			
//			System.out.println("�������"+(student+1)+"��ѧ���ĳɼ�");
//			
//			int score=scanner.nextInt();
//
//			total+=score;
//			
//			ave=total/(student+1);
//		}
//			System.out.println("ƽ����Ϊ��"+ave);
//		
//		
//		
//	}
//
//}




import java.util.Scanner; 
public class Demo01 {
public static void main(String[] args) {
	
			int total=0;
			
			double ave=0;
			
			boolean flag=false;
			
			int student;
			
			Scanner scanner=new Scanner(System.in);
			
			for(student=0;student<5;student++){
				
				System.out.println("�������"+(student+1)+"��ѧ���ĳɼ�");
				
				int score=scanner.nextInt();
							
				if(score<0){
								flag=true;
								break;
							}
					
				total+=score;
					
			}
		   	
			if(flag==false){
		   		
				ave=total/(student+1);	
		   		
				System.out.println("ƽ����Ϊ��"+ave);
		   		
		   	}else{
		   		
		   		System.out.println("�����������������");
		   	}
			
			
			
	
}

}