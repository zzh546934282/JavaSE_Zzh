package day06_multi_circle;

import java.util.Scanner;

/**
 * �������Ҫ����3���� ÿ����5λѧԱ��ƽ����?
 * @author zzh
 *
 */

public class Demo02 {

	public static void main(String[] args) {
		
		for(int i=0;i<3;i++){
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		double[] score=new double[5];
		
		int total = 0;
		
		double avg;
		
		int j;
		for(int i1=0;i1<3;i1++){
		
				for( j=0;j<score.length;j++){
					
					System.out.println("�������"+(i1+1)+"����ĵ�"+(j+1)+"��ͬѧ�ĳɼ�");
					
					score[j]=scanner.nextDouble();
					
					total+=score[j];
					   avg=total/score.length;
					  
				} 
		avg=total/score.length;
		System.out.println("��"+(i1+1)+"�����ͬѧ��ƽ���ɼ�Ϊ��"+avg);
	
	}
}
}}