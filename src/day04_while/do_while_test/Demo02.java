package day04_while.do_while_test;
/**
 * ʹ��do-whileʵ�֣���������¶��뻪���¶ȵĶ��ձ�Ҫ�����������¶�0�ȵ�250�ȣ�ÿ��20��Ϊһ����ձ��е���Ŀ������10����
    ת����ϵ�������¶� = �����¶� * 9 / 5.0 + 32
 * @author zzh
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		double number0=0;
		
		double number1;
		
		int count=0;
		
		System.out.println("�����¶�\t\t�����¶�");
		
		do {
			number1=number0*9/5.0+32;
			
			System.out.println(number0+"\t\t"+number1);
			
			count++;
			
			number0+=20;
			
			
		}while((count<=10)&&(number0<=250));
		
	}
}
