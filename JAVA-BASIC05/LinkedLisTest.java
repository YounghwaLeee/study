//어레이는 이름에 배열방식 중간에 읽어오거나 추가할때 시간이 많이걸림
/*둘다 순서도 있고 중복도 허용 
 * 링크드는 각각 열차처럼 이어져 있다. 중간에 뭘 추가하거나 삭제하는건 좋네.지 다음애 밖에 모름 next 를 사용하는이유.
 * 
 * 
 */
 
import java.util.LinkedList;

public class LinkedLisTest {

	public LinkedLisTest() {
		start();
	}


	public void start() {
		//LinkedList : List,Deque, Queue =를 상속받음 대기만들때/
		//			: 입력 순서를 유지를 하는데 Queue일(선입선출)떄는 입력순서를 유지하고,출력은 먼저입력된 객체가 출력된다
		//			 아웃풋- 출력된 객체는 컬렉션에서 지워진다.
		//				Deque 일때 양쪽에서 객체를 입력또는 출력할 수 있다.
		
		LinkedList<String> ll = new LinkedList<String>();
	
		// 객체추가 
		ll.offer("홍길동");
		ll.offer(new String("세종대왕"));
		//ll.offer(1234); ->스트링이아니여서 에러 . 
		ll.offer(String.valueOf(1234)); // 숫자를 문자로 바꾸어주는 valueof
		ll.offer(5678+"");
		
		System.out.println("size->"+ ll.size());
		
		//객체얻어오기
		//String data=ll.pop();// 제일 앞에있는 객체가 얻어지고 컬렉션에서 삭제됌.
		//System.out.println("data="+data); //홍길동 출력
		//System.out.println("size-->"+ll.size());
		
		//true : 컬렉션에 객체가 없다. false: 컬렉션에 남아있는 객체가 있다.
		while(!ll.isEmpty()) {//객체가 있을때만 들어가자마자 있냐없냐 물어볼거
			String data = ll.pop(); //pop 한개씩꺼내준다. 왜? 계속 실행되니깐.순서대로 나가준다  나가주는애를 데이타 값에 담고 그 그 변수에 담음 나가면서 사라지니깐 객체수는 줄어듬
			int cnt = ll.size();
			System.out.println(data+",남은객체수="+cnt);			
		}
		
	}
	public static void main(String[] args) {
		new LinkedLisTest();

	}

}
