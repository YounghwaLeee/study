import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

//key를 기준으로 정렬한다.
public class TreeMapTest {

	public TreeMapTest() {
		TreeMap<String,MemverVO> tm = new TreeMap<String,MemverVO>(); //데이터는HASH맵게 만듬
		//treemap 에 들어간거다.
		//TreeMap은 key,value를 가진다.
		//key를 기준으로 정렬한다.
		
		HashMap<String,MemverVO> hm2= new HashMap<String,MemverVO>();
		tm.put("홍길동", new MemverVO("홍길동","기획부","2020-10-10",5000));
		tm.put("이순신", new MemverVO("이순신","총괄부","2020-01-01",6000));
		tm.put("장영실", new MemverVO("장영실","총무부","2020-07-08",3000));
		tm.put("세종대왕",new MemverVO("세종대왕","인사부","2020-02-01",7000));
		tm.put("유승룡", new MemverVO("유승룡","기획부","2020-03-05",6000));
		tm.put("김삿갓", new MemverVO("김삿갓","영업부","2021-02-10",5000));
		
		System.out.println("==========key를 이용해서 객체 얻어오기===========");
		Set<String> keyList=tm.keySet();
		Iterator<String> ii= keyList.iterator(); //Itreator값을 모두 꺼내는거라고한다. 
		while(ii.hasNext()) {
			MemverVO vo=tm.get(ii.next());
			System.out.println(vo.toString());
		}
		System.out.println("===value를 이용한 객체 얻어오기==="); 
			
		Collection<MemverVO> value  =tm.values();
		Iterator<MemverVO> iii= value.iterator(); 
		while(iii.hasNext()) {//객체가 있나 없나 확인해서 hasNext
			MemverVO vo=iii.next();
			System.out.println(vo.toString());
		}	
			
	}

	public static void main(String[] args) {
			new TreeMapTest();

	}

}
