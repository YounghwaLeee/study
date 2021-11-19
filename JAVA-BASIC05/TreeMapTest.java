import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

//key�� �������� �����Ѵ�.
public class TreeMapTest {

	public TreeMapTest() {
		TreeMap<String,MemverVO> tm = new TreeMap<String,MemverVO>(); //�����ʹ�HASH�ʰ� ����
		//treemap �� ���Ŵ�.
		//TreeMap�� key,value�� ������.
		//key�� �������� �����Ѵ�.
		
		HashMap<String,MemverVO> hm2= new HashMap<String,MemverVO>();
		tm.put("ȫ�浿", new MemverVO("ȫ�浿","��ȹ��","2020-10-10",5000));
		tm.put("�̼���", new MemverVO("�̼���","�Ѱ���","2020-01-01",6000));
		tm.put("�念��", new MemverVO("�念��","�ѹ���","2020-07-08",3000));
		tm.put("�������",new MemverVO("�������","�λ��","2020-02-01",7000));
		tm.put("���·�", new MemverVO("���·�","��ȹ��","2020-03-05",6000));
		tm.put("���", new MemverVO("���","������","2021-02-10",5000));
		
		System.out.println("==========key�� �̿��ؼ� ��ü ������===========");
		Set<String> keyList=tm.keySet();
		Iterator<String> ii= keyList.iterator(); //Itreator���� ��� �����°Ŷ���Ѵ�. 
		while(ii.hasNext()) {
			MemverVO vo=tm.get(ii.next());
			System.out.println(vo.toString());
		}
		System.out.println("===value�� �̿��� ��ü ������==="); 
			
		Collection<MemverVO> value  =tm.values();
		Iterator<MemverVO> iii= value.iterator(); 
		while(iii.hasNext()) {//��ü�� �ֳ� ���� Ȯ���ؼ� hasNext
			MemverVO vo=iii.next();
			System.out.println(vo.toString());
		}	
			
	}

	public static void main(String[] args) {
			new TreeMapTest();

	}

}
