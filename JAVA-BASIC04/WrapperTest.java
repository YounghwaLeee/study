
public class WrapperTest {

	public WrapperTest() {
		//WrapperTest �⺻ ���������� ������ ��ü�� �����Ű�� Ŭ�����̴�
		//Byte Short Integer,Long
		//Float,Doubld
		//Boolean
		//Character
		
		int a = 1234;    
		Integer i= Integer.valueOf(a);
		
		System.out.println("a="+a);
		System.out.println("i="+i);
		//��Ҽ� �ɼ������� ���������~ ������ �Ǵµ� �׳ɾ�������~
		//static�� ��ü ���������� ����ص� �ȴ�.
		
		Object obj= a;	//����ڽ�
		Object obj2 = i;
		System.out.println("obj="+obj);
		System.out.println("obj2="+obj2);
		
		int x = i; //�����ڽ�
		System.out.println(x);
		
		
		//�ڹ� ������ ���� ����� �޶���.
		//1.1,1.2,   1.3 1.4 5 6 7 8 9  12 13 14 15 16
		
		/*����ڽ� integer i=a;
		 * �����ڽ�	int b =i;
		 * */
		 
		
	}

	public static void main(String[] args) {
	new WrapperTest();

	}

}
