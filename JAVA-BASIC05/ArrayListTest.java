import java.util.List;

public class ArrayListTest {//컬랙션자식 list 얘네는 완전 추상메서드내용에서 여기선 완성이되어있따.먼저 온사람 순서는있찌만 중복값은 있을 수 있음. 들어온 순서

	public ArrayListTest() {
		//5명의 사원의 정보를 리턴.컬랙션데이터객채만듬 
		CollectionData data= new CollectionData();
		List<MemverVO> lst =data.getMemver(); //제너릭 변수타입에 변수 <MemverVO> 여긴 String 변수타입들이 들어갈수 있따.
		//<> 여긴 어떤 변수 타입이든 들어올 수 있따.겟맴버의 메서드값사용
//반환값 데이타 갯 맴바 가 리스트 타입이니까 리스트만 넣을수 있음 
		MemverVO vo2 = new MemverVO("ZZZ","기획승진부","2020-01-02",5000);
		lst.add(2,vo2);//ㅣst가 곧 리턴 al2 값이다
				//제너릭 때문에 형변환 안하고 들어옴
				//그대신 다양한 거 못넣음
		//lst.remove(1);
		//인덱스 2번쨰에 들어간거니까 실행하면 3번째에 들어가있다.
		//lst.remove(vo2);
		for(int i=0; i<lst.size();i++) {
			MemverVO vo = lst.get(i);//get하고 몇번째인지 적어줘야 값을 내보낼수 있다.
			vo.memverPrint();
		}		
	}

	public static void main(String[] args) {
	new ArrayListTest();
	}

}
//get맴버로 호출하면됌