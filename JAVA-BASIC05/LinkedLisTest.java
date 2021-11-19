//��̴� �̸��� �迭��� �߰��� �о���ų� �߰��Ҷ� �ð��� ���̰ɸ�
/*�Ѵ� ������ �ְ� �ߺ��� ��� 
 * ��ũ��� ���� ����ó�� �̾��� �ִ�. �߰��� �� �߰��ϰų� �����ϴ°� ����.�� ������ �ۿ� �� next �� ����ϴ�����.
 * 
 * 
 */
 
import java.util.LinkedList;

public class LinkedLisTest {

	public LinkedLisTest() {
		start();
	}


	public void start() {
		//LinkedList : List,Deque, Queue =�� ��ӹ��� ��⸸�鶧/
		//			: �Է� ������ ������ �ϴµ� Queue��(���Լ���)���� �Է¼����� �����ϰ�,����� �����Էµ� ��ü�� ��µȴ�
		//			 �ƿ�ǲ- ��µ� ��ü�� �÷��ǿ��� ��������.
		//				Deque �϶� ���ʿ��� ��ü�� �Է¶Ǵ� ����� �� �ִ�.
		
		LinkedList<String> ll = new LinkedList<String>();
	
		// ��ü�߰� 
		ll.offer("ȫ�浿");
		ll.offer(new String("�������"));
		//ll.offer(1234); ->��Ʈ���̾ƴϿ��� ���� . 
		ll.offer(String.valueOf(1234)); // ���ڸ� ���ڷ� �ٲپ��ִ� valueof
		ll.offer(5678+"");
		
		System.out.println("size->"+ ll.size());
		
		//��ü������
		//String data=ll.pop();// ���� �տ��ִ� ��ü�� ������� �÷��ǿ��� ������.
		//System.out.println("data="+data); //ȫ�浿 ���
		//System.out.println("size-->"+ll.size());
		
		//true : �÷��ǿ� ��ü�� ����. false: �÷��ǿ� �����ִ� ��ü�� �ִ�.
		while(!ll.isEmpty()) {//��ü�� �������� ���ڸ��� �ֳľ��� �����
			String data = ll.pop(); //pop �Ѱ��������ش�. ��? ��� ����Ǵϱ�.������� �����ش�  �����ִ¾ָ� ����Ÿ ���� ��� �� �� ������ ���� �����鼭 ������ϱ� ��ü���� �پ��
			int cnt = ll.size();
			System.out.println(data+",������ü��="+cnt);			
		}
		
	}
	public static void main(String[] args) {
		new LinkedLisTest();

	}

}
