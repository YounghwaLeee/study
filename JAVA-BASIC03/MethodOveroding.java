//�����ε� �Ұ��̴�. ���� Ŭ�������� �޼ҵ���� ���� �޼ҵ尡 ������ ������ �� �����ε��̶�� �Ѵ�.
//�޼ҵ��� ��ȯ���� ����, �Ű������� ������ ���������� �޶���Ѵ�.
//����� ����� �ϴ� �޼��尡 ������ ���� ���� ���� �̷� �޼��尡 ���� �ٸ��̸����� ����Ǿ��ִٸ�
//��� � �޼��带 ����ؾ� ���� ��Ʊ� ������ . 


public class MethodOveroding {
	int maxresult;
	public MethodOveroding() {
	
	}
		int totalResult(){
			//1~100������ ���� ���Ѵ�.
			int result=0;
			for(int i=1; i<=100; i++) {
				result+=i;
			}
			return result;	
			}

	//1~max���� �ձ��ϴ� �޼ҵ�
	int totalResult2(int max) {
		int result=0;
		for(int i=0; i<=max; i++) {
			result+=i;
		}
		return result;
	}
	void totalResult3()
	{
		int result=0;
		for(int i=0; i<=100; i++) {
			maxresult+=i;
		}
		System.out.print(maxresult);
	}
	
	public static void main(String[] args) {
		MethodOveroding mo= new MethodOveroding();
		
		int r = mo.totalResult();
	
		int rr= mo.totalResult2(10);
		//int rrr= mo.maxresult;
		//System.out.printf("%d",rrr);
		System.out.printf("%d:",rr);
		//System.out.println("maxresult:"+ rrr);
		
		//System.out.println(100);
		//System.out.println(10.2);
		//System.out.println('A');

	}

}
