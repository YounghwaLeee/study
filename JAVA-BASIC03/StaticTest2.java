
public class StaticTest2 {


		// static
		//�ɹ������� �������� Ⱥ��public static int a=100;
					//	static int b=200;
		//�޼ҵ��� ��ȯ�� ���ʿ� ǥ���Ѵ�.
		//��ȯ���� public static void method(){}
		// ���� �����ڰ� ���ٸ� public void method(){}
		
		//�ɹ������� ����ǥ�� �Ҽ�����.
		//static{}���� ���๮�� ǥ���� �� �ֵ�.
		//static{}�� �����ڸ޼���� static{}�� ���� ����ȴ�.
	
		static {
			//static{}���� ���๮�� ǥ�� �Ҽ��ִ�.
		for(int i=1; i<=10; i++) {
			System.out.println(i);  //���๮ 
		}
	}
	
		public StaticTest2() {
			System.out.println("StaticTest2()�޼ҵ����");
		}
	public static void main(String a[]) {
		new StaticTest2();

	}

}
//������ �޼��尡 ?