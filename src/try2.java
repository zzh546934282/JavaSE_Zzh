import java.util.ArrayList;
import java.util.Collection;


public class try2 {

	public static void main(String[] args) {
		
		//ֻҪnew �ͻᴴ�������ڶ��п��ٿռ䣬���ܳ��������Դ�����ͬ���ַ�����
		//���ָ�� �� ��ַ
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1==s2);     //false  

		
		//���������������ڳ��������Ѵ��ڸ��ַ���������£������ٳ������п����µĿռ�
		//���ָ�����ص�ַ
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);     //true
		
		//��==�����ڻ������Ͷ��ԣ��ж���ֵ�Ƿ���ȡ��������жϵ��ǵ�ַ
		int s5 =130;
		int s6 =130;
		System.out.println(s5==s6);    //true
		System.out.println(s1.equals(s2)); //true
		
		
		//8��������͵İ�װ���У�����Float��Double û�г����أ��������
		//��ֵ��-128��127��Χ�ڣ������ڳ������п����µĿռ�
		Integer s9 = 130;
		Integer s10 = 130;
		System.out.println(s9==s10); //false
		
		Integer s11 = 110;
		Integer s12 = 110;
		System.out.println(s11==s12);//true
		
		Collection a = new ArrayList();
		a.add(1);
		a.add("234");
		a.add('a');
		System.out.println(a.toString());
		System.out.println(a.contains('a'));
		
		Collection b = new ArrayList();
		b.add(2);
		b.add("234");
		b.add('a');
		System.out.println(a.retainAll(b));
		System.out.println(a);
		
		
	}
}
