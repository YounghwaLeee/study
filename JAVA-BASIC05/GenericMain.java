import java.util.Calendar;

//���ʸ��׽�Ʈ �ɹ������� ��ƾ� �Ѵ�.
public class GenericMain {

	public GenericMain() {
		String data= "����� ������ �����";
		GenericTest gt= new GenericTest();
		gt.setusername(data);
		
		GenericTest gt2 = new GenericTest();
		
		//���� ���� �ִ� �����Ͱ� ī�����̴�.
		Calendar now= Calendar.getInstance();// ī���ٸ� ��Ʈ���� ���� �� ����-> ��¿���� ī���� ��� ��Ʈ�������� ���ʸ��� ���� ������ȴ�.
		
		GenericTest<MemverVO> gt3 = new GenericTest<MemverVO>();
		gt3.setusername(new MemverVO("ȫ","��ȹ��","2021-01-21",8000));
		
		GenericTest<Calendar> gt4= new GenericTest<Calendar>(now);
		MemverVO vo= gt3.getUsername();
		System.out.println(vo.toString());
		
		System.out.println(gt4.getUsername());
				}

	public static void main(String[] args) {
		new GenericMain();
		
	}

}
