import java.util.List;

public class ArrayListTest {//�÷����ڽ� list ��״� ���� �߻�޼��峻�뿡�� ���⼱ �ϼ��̵Ǿ��ֵ�.���� �»�� ��������� �ߺ����� ���� �� ����. ���� ����

	public ArrayListTest() {
		//5���� ����� ������ ����.�÷��ǵ����Ͱ�ä���� 
		CollectionData data= new CollectionData();
		List<MemverVO> lst =data.getMemver(); //���ʸ� ����Ÿ�Կ� ���� <MemverVO> ���� String ����Ÿ�Ե��� ���� �ֵ�.
		//<> ���� � ���� Ÿ���̵� ���� �� �ֵ�.�ٸɹ��� �޼��尪���
//��ȯ�� ����Ÿ �� �ɹ� �� ����Ʈ Ÿ���̴ϱ� ����Ʈ�� ������ ���� 
		MemverVO vo2 = new MemverVO("ZZZ","��ȹ������","2020-01-02",5000);
		lst.add(2,vo2);//��st�� �� ���� al2 ���̴�
				//���ʸ� ������ ����ȯ ���ϰ� ����
				//�״�� �پ��� �� ������
		//lst.remove(1);
		//�ε��� 2������ ���Ŵϱ� �����ϸ� 3��°�� ���ִ�.
		//lst.remove(vo2);
		for(int i=0; i<lst.size();i++) {
			MemverVO vo = lst.get(i);//get�ϰ� ���°���� ������� ���� �������� �ִ�.
			vo.memverPrint();
		}		
	}

	public static void main(String[] args) {
	new ArrayListTest();
	}

}
//get�ɹ��� ȣ���ϸ��