import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		//Set 인터페이스를 상속받은 클래스는 
		//1. 입력 순서를 유지하지 않는다 ->뭐가 먼저 들어온지 모름
		//2. 중복 데이터를 허용하지 않는다
		
		//숫자데이터로 넣을거임
		double[] data = {12.3 , 3.4, 5.6, 12.3 ,5.2, 9.1,9.1,6.7};
						//{12.3 3.4 5.6 5.2 9.1 6.7}
		
		HashSet<Double> hs = new HashSet<Double>();
		//인스턴스 생성 set은 인터페이스 이기 때문에new해서 객체 생성할수없다. list set map 은 인터페이스여서 객체생성안돈다. 자식걸로 객체를바꿈.
		//HashSet을 이용해서 인스턴스를 만들어 본다.
		
		for(double d :data) {//확장포문 타입 하고 변수 : 변수
			hs.add(d); //데이터를 저장하는 메서드 헤쉬셋변수에 위에 하나씩 넣어주는거 그렇기때문에 반복해서 하나하나 넣어줌
		}
		System.out.println("size="+hs.size());//중복값을 제거하고 출력된다. 집합 지퐙~!!
		//{12.3 3.4 5.6 5.2 9.1 6.7}
		//자료 사이즈의 크기.중복값 제거해야함.
		
		Iterator<Double>ii	= hs.iterator();//컬렉션을 받아내기 위해서 쓰는값. 어떤 데이터가 있는지 궁금할때 안내자. 
		//중요한건 무식해서 처음부터 끝까지 가야됌. hasnext 
		//set 부모클래스  Iterator이라는 인터페이스를 이용해서 꺼낼때
		// index가 필요한 부분이 아니니깐for문ㄴㄴwhile문 이용
		//Iterator는 hasNext 메서드를 가지고 있다.
		while(ii.hasNext()) {//hasNext는 현재 자료 데이터가 있니객체가 있으면true , 없으면 false
			Double iiData =ii.next();//next 하나를 꺼내줘 , 자동으로다음꺼실행

			System.out.println(iiData); //데이터는 다 있는데 순서가 없다.
			
		}
		
		//데이터를 출력하는 기능은 Iterator -> 
	}

		public static void main(String[] args) {
				new HashSetTest();

	}

}
