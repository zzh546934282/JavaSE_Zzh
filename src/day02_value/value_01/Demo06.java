package day02_value.value_01;

/**
* ����
* 1 һ��������ֵ��,ֵ�����ٸı�ı�����Ϊ����
* 2 ���﷽����
* 3 final���εı������ǳ���
* 4 ������ȫ����д
*/
public class Demo06 {
	
	public final static double PI=3.14;
	
	static double r= 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo06 m=new Demo06();
		
		System.out.println(m.PI);
		
		//����Բ���ܳ���
		double tolal=2*PI*r;
		System.out.println(tolal);
		//����Բ�������
		double area=PI*r*r;
		System.out.println(area);
		
		
	}

}
