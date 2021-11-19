import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		//Set �������̽��� ��ӹ��� Ŭ������ 
		//1. �Է� ������ �������� �ʴ´� ->���� ���� ������ ��
		//2. �ߺ� �����͸� ������� �ʴ´�
		
		//���ڵ����ͷ� ��������
		double[] data = {12.3 , 3.4, 5.6, 12.3 ,5.2, 9.1,9.1,6.7};
						//{12.3 3.4 5.6 5.2 9.1 6.7}
		
		HashSet<Double> hs = new HashSet<Double>();
		//�ν��Ͻ� ���� set�� �������̽� �̱� ������new�ؼ� ��ü �����Ҽ�����. list set map �� �������̽����� ��ü�����ȵ���. �ڽİɷ� ��ü���ٲ�.
		//HashSet�� �̿��ؼ� �ν��Ͻ��� ����� ����.
		
		for(double d :data) {//Ȯ������ Ÿ�� �ϰ� ���� : ����
			hs.add(d); //�����͸� �����ϴ� �޼��� �콬�º����� ���� �ϳ��� �־��ִ°� �׷��⶧���� �ݺ��ؼ� �ϳ��ϳ� �־���
		}
		System.out.println("size="+hs.size());//�ߺ����� �����ϰ� ��µȴ�. ���� ����~!!
		//{12.3 3.4 5.6 5.2 9.1 6.7}
		//�ڷ� �������� ũ��.�ߺ��� �����ؾ���.
		
		Iterator<Double>ii	= hs.iterator();//�÷����� �޾Ƴ��� ���ؼ� ���°�. � �����Ͱ� �ִ��� �ñ��Ҷ� �ȳ���. 
		//�߿��Ѱ� �����ؼ� ó������ ������ ���߉�. hasnext 
		//set �θ�Ŭ����  Iterator�̶�� �������̽��� �̿��ؼ� ������
		// index�� �ʿ��� �κ��� �ƴϴϱ�for������while�� �̿�
		//Iterator�� hasNext �޼��带 ������ �ִ�.
		while(ii.hasNext()) {//hasNext�� ���� �ڷ� �����Ͱ� �ִϰ�ü�� ������true , ������ false
			Double iiData =ii.next();//next �ϳ��� ������ , �ڵ����δ���������

			System.out.println(iiData); //�����ʹ� �� �ִµ� ������ ����.
			
		}
		
		//�����͸� ����ϴ� ����� Iterator -> 
	}

		public static void main(String[] args) {
				new HashSetTest();

	}

}
