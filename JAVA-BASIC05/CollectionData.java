import java.util.ArrayList;
//2
import java.util.List;

public class CollectionData {

	public CollectionData() {

	}

	public List getMemver() {
		//ArrayList에서 사원정보를 담아서 리턴한다.
		//ArrayList<MemverVO> al = new ArrayList<MemverVO>();
		//제너릭 사용방법.              얘는 클래스이다. 주석방법위에거보다 밑에거사용
		List<MemverVO> al2= new ArrayList<MemverVO>();
		//list 부모 어레이 자식 일단 제너릭때고보삼
		//ADD라는 메서드 ARRAY 리스트 배열을 이용하는거 값을추가해주는거다
//얘는 순서대로 들어간다. 자동으로 인덱스가 생성된다 012345
		al2.add(new MemverVO("AAAA","기획부","2021-05-10",5000));
		al2.add(new MemverVO("BBBB","총부무","2021-01-01",6000));
		al2.add(new MemverVO("CCCC","인사부","2020-10-10",70000));
		al2.add(new MemverVO("DDDD","총부무","2021-10-10",5500));
		al2.add(new MemverVO("EEEE","인사부","2020-10-10",65000));
		
		return al2;//통채로 내보낸다 
	}
}
//list를 어레이리스트를 대입할 수 없다.	public List getMemver() { 사용해야한다.