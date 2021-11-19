import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//

public class ObjectCompareTest {

	public ObjectCompareTest() {
		//List 란 컬렉션이 있는거다.
		//arraylist 편리하게 쓸수 있는 배열 index 들어가있음 
		//배열은 확장된for문이 사용가능함 (데이터타입: 배열)
		//여기데이터는 key 가 없기 때문에 문자로 정렬한다.
		List<MemverVO> mem= new ArrayList<MemverVO> ();
		mem.add(new MemverVO("홍길동","기획부","2020-10-10",5000)); //추가 add v1으로 들어가고
		mem.add(new MemverVO("이순신","총괄부","2020-01-01",6000));//v2 들어감
		mem.add(new MemverVO("장영실","총무부","2020-07-08",3000));
		mem.add(new MemverVO("세종대왕","인사부","2020-02-01",7000));
		mem.add(new MemverVO("유승룡","기획부","2020-03-05",6000));
		mem.add(new MemverVO("김삿갓","영업부","2021-02-10",5000));
		
		System.out.println("==정렬전 데이터=====================");
		//제너릭객체 로 변수선언 / 컬렉션객체 for(MemverVO vo:mem) 확장된 for문 사용법
		for(MemverVO vo:mem) {//arraylist 데이터 얻을때 get을 썻는데 확장된for문으로 대신 사용가능
			System.out.println(vo.toString());
			
		}
		
		System.out.println("==== 급여를 오름차순으로 정렬 ====");
		//객체가 전체 있는 컬렉션 ,정렬할 기준이되는 기능이 있는 comparator 객체를 넣어주면 된다.
		Collections.sort(mem, new CompareAscSal());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("==급여를 내림차순으로 정렬===");
		Collections.sort( mem, new CompareDescSal());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("=======이름을 오름차순으로 정렬======");		
		Collections.sort(mem, new CompareAscName());
		for(MemverVO vo: mem) {
			System.out.println(vo.toString());
		}
		System.out.println("====이름을 내림차순으로 정렬====");{
		Collections.sort(mem, new compareDescName());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
			
		System.out.println("====입사일을 오름차순으로 정렬====");
		Collections.sort(mem, new compareAscHire());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("====입사일을 내림차순으로 정렬====");
		Collections.sort(mem, new compareDescHire());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		}
		
	}
	//정렬하는 클래스는 Comparator 인터페이스를 상속받아 만든다.
	//숫자를 이용한 오름차순 정렬하는 클래스 
	//내부클래스 (우리가 지으면됌)
	class CompareAscSal implements Comparator <MemverVO>{ //비교할 데이터가 맴버브이오에 담김
		public int compare(MemverVO v1, MemverVO v2) { //v1 5000, v2 6000
			//    조건식 
			//왼쪽 객체의 값이 작으면 -, 왼쪽 객체의 값이 크면 + 를 같으면 0을 리턴 
			return(v1.getSal()< v2.getSal())?-1  :  (v1.getSal()>v2.getSal())? 1:0;
			
		}
		
	}
	//숫자를 이용한 내림차순 정렬하는 클래스
	class CompareDescSal implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			return (v1.getSal() < v2.getSal())? 1: (v1.getSal()> v2.getSal())?-1:0;
			
		}
	}
	//이름을 오름차순으로 정렬하는 클래스
	class CompareAscName implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			//왼쪽이 작으면 음수 , 왼쪽이 크면 양수 , 같으면 0
			//"A"  "a" ->"A"-"a"  ->65-97=-32 

			return v1.getName().compareToIgnoreCase(v2.getName());//
			}
	}
	//이름을 내림차순으로 정렬하는 클래스 
	class compareDescName implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			//"A"                            "a" -> "A"-"a" -> 65-97 =+32 -는 교환
			//'a'                            "A" -> "a"-"A" -> 97-65=32 
			
			
			return v2.getName().compareTo(v1.getName()); //==>-나온얘기는 왼쪽에 있는게 크고 오른쪽이 크다는 말
					
		}
	}
	
	//입사일 기준으로 오름차순 정렬하는 클래스            이건 데이터가 저장되어 있는 메소드명
	class compareAscHire implements Comparator<MemverVO>{
		public int compare(MemverVO obj1, MemverVO obj2) {
			
			return obj1.getHire().compareTo(obj2.getHire());
		}
	}
	//입사일을 기준으로 내림차순 정렬하는 클래스 
	class compareDescHire implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			return v2.getHire().compareTo(v1.getHire());
		}
	}
	public static void main(String[] args) {
				new ObjectCompareTest();

	}

}
