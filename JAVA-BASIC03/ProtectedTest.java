
public class ProtectedTest {
	protected int num=1234;
	String name = "�������";
	protected ProtectedTest(){
		System.out.println("���� ��Ű���� ������ �޼ҵ�");
		// protected ���� �б����� �����ϱ� ������ �Ȱ�. 
		//ProtectedTest pt =new ProtectedTest(); �긦 ��ü�� ��������� ����ؾ���.
	}	
		protected void print(){
			System.out.println("�̸�=+name"+name);
		}
		
	}
	


//protected ���� �б����� �����ϱ� ������ �Ȱ�. 
		//ProtectedTest pt =new ProtectedTest(); �긦 ��ü�� ��������� ����ؾ���.