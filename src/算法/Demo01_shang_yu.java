package �㷨;

import java.util.Scanner;




/**
 * �̳��Ƴ����˳齱�
   �齱����
    �˿͵���λ��Ա���ŵ�  1234 --->1+2+3+4
    ��λ����֮�ʹ���20��
    ��Ϊ���˹˿͡�
 * @author Mindy
 *
 */
public class Demo01_shang_yu {

	 public static void main(String[] args) {
			
		  Scanner scanner = new Scanner(System.in );
		  
		  System.out.print("��������λ��Ա����");
		  
		  // 1234--->��λ��+��λ��+��λ��+ǧλ��
		  int vipNo = scanner.nextInt();
		  
		  int gewei,shiwei,baiwei,qianwei;
		  
		  gewei   = vipNo % 10 ;
		  shiwei  = vipNo / 10  % 10;
		  baiwei  = vipNo / 100 % 10;
		  qianwei =  vipNo / 1000 ;
		  
		  int total = gewei+shiwei+baiwei+qianwei;
		  
		  boolean result = total > 20;
		  
		  System.out.println(result);
				 
		  
		  
	}


}
