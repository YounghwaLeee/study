import java.util.Iterator;
import java.util.TreeSet;

//���ڸ� ������ ������ ���� ���� ������ ���� �ߺ����� ����.
public class TreeSetTest {
	String list[] = {"JAVA","SPRING","����������","JAVA","�ڹ�","ORACLE","������","ORACLE"}; //size�� ��� ����ֳ�.

	public TreeSetTest() {
		start();//�̰� �����̵ȴ�.
		
	}
	public void start() {
		// TreeSet : �Է¼��� �������� �ʴ´�.
		//			 �ߺ������� ������� �ʴ´�.
		//			 �����Ѵ�.
		TreeSet<String> ts = new TreeSet<String>();//�� �־��ָ� �� �Ÿ� ���� �ִ�.
		//TreeSet�� ��ü �߰�
		for(String data:list) {
			ts.add(data);	
		}
		//������������ ���ĵǾ� �ִ�.
		System.out.println(ts.size()); 
		Iterator<String>ii=ts.iterator(); //Iterator�����߰�, 
		while(ii.hasNext()) {
			String d = ii.next();
			System.out.println(d);
		} //��°� ������������ ����. 
		
		//������������ �����Ͽ� ��ü �������� 
		Iterator<String> iii =ts.descendingIterator(); //<>�̰� ���ʸ��̶�� �Ѵ�.
		while(iii.hasNext()) {//iii. ��� ��ü�� �ִ���
			String d = iii.next();
			System.out.println(d);
			//������������ ������.
		}
		
	}
	public static void main(String[] args) {
		 new TreeSetTest();

	}

}


/*
 * 
 * treeset�� ���İ����Ѱ������� ���ͷ��ͷ� ~~
 * 
 */
