package day06_multi_circle;

import java.util.Scanner;

/**
 * ����3���༶��4��ѧԱ������
����ÿ���༶����ѧԱƽ���֣�
ͳ�Ƴɼ�����85��ѧԱ��
 * @author zzh
 *
 */
public class Demo08 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i;
		int j;
		int[] score=new int[4];
		int total=0;
		double avgre = 0;
		int count=0;
		
		for(i=0;i<3;i++){
		
			for(j=0;j<score.length;j++){
				
			System.out.println("�������"+(i+1)+"���"+(j+1)+"��ͬѧ�ĳɼ���");
			
				score[j]=scanner.nextInt();				
				
				if(score[j]>=80){
					count++;
				} 
				
				total+=score[j];
				 
				 avgre=total/score.length;
			
				 
			}
			System.out.println("��"+(i+1)+"��ͬѧ��ƽ�����ǣ�"+avgre);
			System.out.println("���а�80��������"+count+"����");
			
			
			
		}
	}
}
