package day03_if.switch_test;


/**
 * if�ĸ���������ϰ
 * ����źƵ�java�ɼ�����90ͬʱ���ֳɼ�����80���Գ�ȥ��
 * ����
 * ����źƵ�java�ɼ�����80ͬʱ���ֳɼ�����99Ҳ���Գ�ȥ��
 * @author Mindy
 *
 */
public class Demo04 {

	  public static void main(String[] args) {
		
		  
		  double javaScore = 99;
		  double musicScore = 99;
		  
		  if(((javaScore >=90) && (musicScore >=80))
				  ||
			  ((javaScore >=80) &&(musicScore >=99))){
			  
			    System.out.println("��ȥ��...");
		  }
		  
		  
	}
}
