
import test.DefaultData;
import test.LottoOOP;
//����Ǿ� �׽�Ʈ���� ����Ʈ �� ���� ���� �ʿ��� �׷� ��ü�����!!
public class ModifierTest {

	public ModifierTest() {
		//LottoOOP lotto= new LottoOOP();
		//lotto.lottoStart(); 
		
		
		DefaultData dd= new DefaultData();
		//��ü��.�������
		//System.out.println("�̸�"+dd.name);
		System.out.println("�̸�"+dd.getName());
		//System.out.println("����ó"+dd.tel);
		
		
		//���系�� �����ϴ� ���� ����, ��Ŭ�������� �ٸ� Ŭ������ ��üȭ��Ű������ ��Ű���� �ٸ� .
		//������׽�Ʈ���� �ζ� �����Ǹ� ����ϴ°��̴�. ���� �����ڴ� ����� ����ϴ� 
		//Ŭ������ ���ؼ� �� ����Ǿ� �׽�Ʈ�� �ζ� �����Ǹ� ���� �ִ°� ���°�.
		//�ζ� ������ ���ϱ� 1. ��Ű���� �ٸ� = �׷� ����Ʈ �ؾ���. �ٸ� ���̵ȰŴ�.
		DefaultData dd2 = new DefaultData("�̼���","010-8888-8888");
		dd2.sum();
		
		DefaultData.sum();
		//DefaultData.getName();
		
	}

	public static void main(String[] args) {
		//����������
		//Ŭ���� :public ,default(����)
		//�����ڸ޼ҵ�,�޼ҵ� ,�ɹ�����: public,protected, default,private
		//���⿡�� test ��Ű�� �ȿ��ִ� �ζǰ� �ʿ��ؿ�~~
		//�ۺ��� ������ ����Ʈ ���� ���°Ŵϱ� �ٸ� ��Ű���� ������� ���ϰ� �ȴ�.
	
		
		//public - �������� �Ұų� ���ų�
		//default-���� Ŭ���� �� �ִ°��� ������ٰŴ�.
		//���-protected,private-����Ҷ� ���� �Ұ��̴�.
		new ModifierTest();
	}

}
