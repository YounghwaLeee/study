import test.ProtectedTest2;
//�ٸ� ��Ű���� �ٸ� Ŭ������ defalut ó�� ��� ���� 
public class ProtectedTestMain extends ProtectedTest2  {
	
	ProtectedTestMain(){
		ProtectedTest pt =new ProtectedTest();
		System.out.println(pt.num);
		pt.print();
		//�ٸ� ��Ű���� Ŭ������ ��ü�� ������ �� ����.
		//ProtectedTest2 pt2 = new ProtectedTest2();
		
		System.out.println("tel=tel");
		telOutput();
	
		}

	public static void main(String[] args) {
	new ProtectedTestMain();
	
	 ProtectedTest2 ppt =  ProtectedTest2.getInstance();
	 System.out.println(ppt.getTel());
	 //
	
	}

}
