import java.util.ArrayList;
//2
import java.util.List;

public class CollectionData {

	public CollectionData() {

	}

	public List getMemver() {
		//ArrayList���� ��������� ��Ƽ� �����Ѵ�.
		//ArrayList<MemverVO> al = new ArrayList<MemverVO>();
		//���ʸ� �����.              ��� Ŭ�����̴�. �ּ���������ź��� �ؿ��Ż��
		List<MemverVO> al2= new ArrayList<MemverVO>();
		//list �θ� ��� �ڽ� �ϴ� ���ʸ�������
		//ADD��� �޼��� ARRAY ����Ʈ �迭�� �̿��ϴ°� �����߰����ִ°Ŵ�
//��� ������� ����. �ڵ����� �ε����� �����ȴ� 012345
		al2.add(new MemverVO("AAAA","��ȹ��","2021-05-10",5000));
		al2.add(new MemverVO("BBBB","�Ѻι�","2021-01-01",6000));
		al2.add(new MemverVO("CCCC","�λ��","2020-10-10",70000));
		al2.add(new MemverVO("DDDD","�Ѻι�","2021-10-10",5500));
		al2.add(new MemverVO("EEEE","�λ��","2020-10-10",65000));
		
		return al2;//��ä�� �������� 
	}
}
//list�� ��̸���Ʈ�� ������ �� ����.	public List getMemver() { ����ؾ��Ѵ�.