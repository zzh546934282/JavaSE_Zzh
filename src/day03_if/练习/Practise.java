package day03_if.��ϰ;

import java.util.Scanner;

/**
 * �����򳵣���ʲô�����������������ж��ٴ��
����ҵĴ���500���Ҿ��򿭵�����
��������ҵĴ���100���Ҿ���������
���� ����ҵĴ���50���Ҿ���������
���� ����ҵĴ���10���Ҿ������
���� ����ҵĴ��10������ ������ݰ���
 * @author zzh
 * ���ѭ����ֻ��һ�����������ȥ�������š�
 */
public class Practise {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
   System.out.println("���������ж�����");
   int money=scanner.nextInt();
   if(money>=500){
System.out.println("���򿭵�����");	   
   }else if(money>=100){
	   System.out.println("����������");
   }else if(money>=50){
	   System.out.println("����������");
   }else if(money>=10){
	   System.out.println("�������");
   }else if(money<10){
	   System.out.println("����ݰ���");
   }
}
}
