import java.util.Iterator;
import java.util.TreeSet;

//문자를 가지고 데이터 정렬 집합 순서도 없고 중복값도 없음.
public class TreeSetTest {
	String list[] = {"JAVA","SPRING","스프링레임","JAVA","자바","ORACLE","스프링","ORACLE"}; //size는 몇개가 들어있나.

	public TreeSetTest() {
		start();//이게 실행이된다.
		
	}
	public void start() {
		// TreeSet : 입력순서 유지하지 않는다.
		//			 중복데이터 허용하지 않는다.
		//			 정렬한다.
		TreeSet<String> ts = new TreeSet<String>();//다 넣어주면 그 거만 쓸수 있다.
		//TreeSet에 객체 추가
		for(String data:list) {
			ts.add(data);	
		}
		//오름차순으로 정렬되어 있다.
		System.out.println(ts.size()); 
		Iterator<String>ii=ts.iterator(); //Iterator선언했고, 
		while(ii.hasNext()) {
			String d = ii.next();
			System.out.println(d);
		} //찍는거 오름차순으로 정렬. 
		
		//내림차순으로 정렬하여 객체 가져오기 
		Iterator<String> iii =ts.descendingIterator(); //<>이걸 제너릭이라고 한다.
		while(iii.hasNext()) {//iii. 라는 객체가 있느냐
			String d = iii.next();
			System.out.println(d);
			//내림차순으로 찍힌다.
		}
		
	}
	public static void main(String[] args) {
		 new TreeSetTest();

	}

}


/*
 * 
 * treeset은 정렬가능한가봉가요 인터렉터롱 ~~
 * 
 */
