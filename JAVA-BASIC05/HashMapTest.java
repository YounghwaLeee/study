import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
//key�� set���� �Ѱܹ޾Ƽ�(����)�۾�.
	public HashMapTest() {
		//Map Interface�� ��ӹ��� Ŭ������ key ,value �����Ѵ�.
		//1.HashMap�� Key�� Value�����͸� �����Ѵ�. 
		//2.TreeMap�� key�� value�� �����͸� �����ϰ� ,key�� �������� ���ĵȴ�. key�� �ߺ���� �� / value �ߺ����o �й��� �ߺ��ȵǴµ� �̸��� �ߺ��ȴ�.
		
	HashMap<Integer,String> hm=new HashMap(); //-><>���ʸ� ���� ����ȯ�� ���ص��ȴ�.
	hm.put(1, new String("ȫ�浿"));//��ü�߰�  �̷��Ե� ������.
	hm.put(100,"�������");
	hm.put(50, "�̼���");
	hm.put(25, "�念��");
	hm.put(33, "���·�");
		//key	value key�� �������� ����.
	//���� ������ �޼���  object � ��ü�� �ٵȴ�. get(Object key)
	//key�� �˸� get���� ��� �� �� �ִ�. 
	String name=hm.get(100);//int-> Integer�� ����.
	System.out.println("100="+name);
	
	//HashMap���� key����� ���Ͽ� Set�� ����ش�.
		Set<Integer> keyList=hm.keySet(); //5���� key ���� �� ����. keylist�� �ִ°�set�� ������ ���°Ŵϱ� � �޼ҵ尡 �־���Ѵ�.
		Iterator<Integer>ii=keyList.iterator(); //�޼ҵ带 �̿��ؼ� ��ü�� �ֳ� ����
		while(ii.hasNext()) {// ��ü�� ������true ������false
			int k= ii.next();
			System.out.println("key="+k+",+vaule="+hm.get(k)); //set�� ���鼭 ���� ���ľȉ�. ������ 
			
		}
	System.out.println("=========================================");
	
	HashMap<String,MemverVO> hm2= new HashMap<String,MemverVO>();
	hm2.put("ȫ�浿", new MemverVO("ȫ�浿","��ȹ��","2020-10-10",5000));
	hm2.put("�̼���", new MemverVO("�̼���","�Ѱ���","2020-01-01",6000));
	hm2.put("�念��", new MemverVO("�念��","�ѹ���","2020-07-08",3000));
	hm2.put("�������",new MemverVO("�������","�λ��","2020-02-01",7000));
	hm2.put("���·�", new MemverVO("���·�","��ȹ��","2020-03-05",6000));
	
	System.out.println("====================key �̿� ���� ������=================");
	
	//		key�� �̿��� ���� ������.
	//1.key����� �����;� �ȴ�. 
	//2.key ����� set���� �������ϱ� get�ϴ� ����� ���⶧���� Iterator �̿��ؾ� �Ѵ�.
	//key ���
	Set<String>memberkey=hm2.keySet(); //key �� ���ؾߵǴϱ� ������ Ÿ����string
	//Iterator
	Iterator<String>iii =memberkey.iterator();
	while(iii.hasNext()) {
		String key = iii.next();//
		MemverVO value= hm2.get(key);//�ٿ� Ű���� ������ ���簡 ����
		//System.out.println(value.toString()); �ּ�ó���� �̰Ŷ� �ؿ����̶� �Ȱ���.
		System.out.print(value.getName());
		System.out.print(","+ value.getDepart());
		System.out.print(","+value.getHire());
		System.out.println(","+value.getSal());
		}
		System.out.println("========value�� �̿��Ͽ� ����������========="); //key ���� value �� ������ ��.
	
		Collection<MemverVO> values=hm2.values();//�콬�ʿ� �ִ� �޼��� , �÷������� ��ȯ�Ѵ�. �� Ÿ���� ����ض�
		Iterator<MemverVO> memverValue= values.iterator(); 
		while(memverValue.hasNext()) {
			MemverVO vo=memverValue.next();
			System.out.println(vo.toString());
		}
		
	}

	public static void main(String[] args) {
			//������ �޼ҵ� ���� ��ü����
		new HashMapTest();

	}

}

/*Map(key value) ������ ����Ǿ����. .put �̶�� �޼��带 ������ ����
 * 
 * 
 * 
 * 
 */
