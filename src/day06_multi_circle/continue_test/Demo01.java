package day06_multi_circle.continue_test;

import java.util.Scanner;

/**
 *
 * ����3���༶��4��ѧԱ������
 * ����ÿ���༶����ѧԱƽ���֣�
 * ͳ�Ƴɼ�����85��ѧԱ�� 
 * 
 * */
public class Demo01 {

	public static void main(String[] args) {
	
		Scanner scanner =new Scanner(System.in);
		int count=0;
		
		for (int i = 0; i < 3; i++) {
			int total = 0;
			int[] score =new int[4];
			for (int j = 0; j < score.length; j++) {
				System.out.print("�������"+(j+1)+"ѧ���ĳɼ�:");
				score[j]=scanner.nextInt();
					/*if(score[j]>85){
						count+=1;
					}*/
				
				if(score[j]<=85){
					continue;
				}
				count+=1;
			}
			
			
			for (int j = 0; j < score.length; j++) {
				    total+=score[j];
		    	}
			
			
		System.out.println("��"+(i+1)+"�����4��ѧ����ƽ���ɼ���"+total/4);
	    }
		
		System.out.println("���а༶�ɼ�����85��ѧԱ�� ��"+count);
     }
     
}	

