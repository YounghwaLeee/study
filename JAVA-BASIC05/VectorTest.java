import java.util.Calendar;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {

	}
	public Vector start() {//2��
		//����Ŭ���� ��������
		Vector v = new Vector();// ��ü�� ��ƹ��� ���ʷ��̾����� �پ��Ѱɳ����� ���� 
		
		String username="ȫ�浿";
		Integer num = 25000; 
		Calendar cal = Calendar.getInstance();
		MemverVO vo=new MemverVO("�������","��ȹ��","2021-06-10",1000); //�տ� �����ںҷ��°�.
	
		//Vector��ü�� �ٸ� ��ü �߰��ϱ�. 3��
		v.add(username);
		v.addElement(num);
		v.add(1, cal); //1��° 25000�� �ڷιи��� ī���ٰ� ��
		v.addElement(vo);//�������� �ɹ� vo�� ��
	
		//v.remove(1);
		//v.remove(cal)
		return v;
		
	}
}
	
	//public static void main(String[] args) {
	//	new VectorTest().start() ;//1�� 

	//}

//}
/*List(�������̽� ����Ŭ������ ����ȯ �Ǵ°�) : index �����Ѵ�.
 * 									 ���� ������ �����Ѵ�.

  */
 