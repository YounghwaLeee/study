
public class StaticTest {
	int num=0;
	String name="ȫ�浿";
	//���� Ŭ������ ��� ��ü���� 1���� �����Ѵ� (���� ������ ���)
	static String addr="������";
	//static �� ���� ���� ������ �Ǿ����
	public StaticTest() {
	}
	//�ּҸ� �����ϴ� �޼ҵ�(��ȯ���� ����)
	void setAddr(String addr) { //���̵�� ��ȯ�ϴ°� ���µ� �Ű������� ��Ʈ�� ��弼���� ����.this �Ű������� �ִٰ� �����Ҷ� ��ȣ�� ���� �� ����߉�
		System.out.print(num);
		addr = " ";
		this.addr =addr;// �������̴ٶ�°� �˷��� addr�� ���� ������ �𸣱⶧���� this.addr�̶�°��̴�.��������°� ���ž�addr�� �̹̼����Ѱ����� �� �Ű������� �����ߴ�
		System.out.print(addr);
	}
	void AddrNumber2()
	{
		int i=0;
		for(i=0; i<100; i++)
		{
			num+=num;
		}
	}
//	int AddrNumber() {
//		int i=0;
//		for(i=0; i<100; i++)
//		{
//			num+=num;
//		}
//		//System.out.print(a);
//		return num;
//	}
	String getAddr() {//int flaot double char String
		return addr; //�׳� ���̴� �������� �����ִ�. addr�� ���� �����ֵ� ��µǴ°Ծƴ�
	}
	
	public static void main(String[] args) {
		StaticTest sa = new StaticTest();
		System.out.println(sa.num);
		
		
		//sa.setAddr("�̿�ȭ");
		
		//System.out.print(sa.name);
	}
}
