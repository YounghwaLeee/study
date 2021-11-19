import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
//key를 set으로 넘겨받아서(리턴)작업.
	public HashMapTest() {
		//Map Interface를 상속받은 클래스는 key ,value 존재한다.
		//1.HashMap은 Key와 Value데이터를 저장한다. 
		//2.TreeMap은 key와 value로 데이터를 저장하고 ,key를 기준으로 정렬된다. key는 중복허용 ㄴ / value 중복허용o 학번은 중복안되는디 이름은 중복된다.
		
	HashMap<Integer,String> hm=new HashMap(); //-><>제너릭 쓰면 형변환을 안해도된다.
	hm.put(1, new String("홍길동"));//객체추가  이렇게도 가능함.
	hm.put(100,"세종대왕");
	hm.put(50, "이순신");
	hm.put(25, "장영실");
	hm.put(33, "유승룡");
		//key	value key를 기준으로 구함.
	//값을 얻어오는 메서드  object 어떤 객체든 다된다. get(Object key)
	//key만 알면 get으로 얻어 올 수 있다. 
	String name=hm.get(100);//int-> Integer로 본다.
	System.out.println("100="+name);
	
	//HashMap에서 key목록을 구하여 Set에 담아준다.
		Set<Integer> keyList=hm.keySet(); //5개의 key 값이 들어가 있음. keylist에 있는건set을 가지고 나온거니깐 어떤 메소드가 있어야한다.
		Iterator<Integer>ii=keyList.iterator(); //메소드를 이용해서 객체가 있나 없나
		while(ii.hasNext()) {// 객체가 있으면true 없으면false
			int k= ii.next();
			System.out.println("key="+k+",+vaule="+hm.get(k)); //set에 들어가면서 섞임 정렬안됌. 무조건 
			
		}
	System.out.println("=========================================");
	
	HashMap<String,MemverVO> hm2= new HashMap<String,MemverVO>();
	hm2.put("홍길동", new MemverVO("홍길동","기획부","2020-10-10",5000));
	hm2.put("이순신", new MemverVO("이순신","총괄부","2020-01-01",6000));
	hm2.put("장영실", new MemverVO("장영실","총무부","2020-07-08",3000));
	hm2.put("세종대왕",new MemverVO("세종대왕","인사부","2020-02-01",7000));
	hm2.put("유승룡", new MemverVO("유승룡","기획부","2020-03-05",6000));
	
	System.out.println("====================key 이용 정보 얻어오기=================");
	
	//		key를 이용한 정보 얻어오기.
	//1.key목록을 가져와야 된다. 
	//2.key 목록을 set으로 가져오니까 get하는 기능이 없기때문에 Iterator 이용해야 한다.
	//key 목록
	Set<String>memberkey=hm2.keySet(); //key 룰 구해야되니까 데이터 타입은string
	//Iterator
	Iterator<String>iii =memberkey.iterator();
	while(iii.hasNext()) {
		String key = iii.next();//
		MemverVO value= hm2.get(key);//겟에 키값을 너으면 벨루가 나옴
		//System.out.println(value.toString()); 주석처리한 이거랑 밑에값이랑 똑같다.
		System.out.print(value.getName());
		System.out.print(","+ value.getDepart());
		System.out.print(","+value.getHire());
		System.out.println(","+value.getSal());
		}
		System.out.println("========value를 이용하여 정보얻어오기========="); //key 없이 value 값 얻어오는 법.
	
		Collection<MemverVO> values=hm2.values();//헤쉬맵에 있는 메서드 , 컬렉션으로 반환한다. 값 타입을 사용해라
		Iterator<MemverVO> memverValue= values.iterator(); 
		while(memverValue.hasNext()) {
			MemverVO vo=memverValue.next();
			System.out.println(vo.toString());
		}
		
	}

	public static void main(String[] args) {
			//생성자 메소드 에서 객체만듬
		new HashMapTest();

	}

}

/*Map(key value) 쌍으로 저장되어야함. .put 이라는 메서드를 가지고 있음
 * 
 * 
 * 
 * 
 */
