import java.util.Calendar;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {

	}
	public Vector start() {//2번
		//백터클래스 생성먼저
		Vector v = new Vector();// 객체를 담아번다 제너럴이없으니 다양한걸넣을수 있음 
		
		String username="홍길동";
		Integer num = 25000; 
		Calendar cal = Calendar.getInstance();
		MemverVO vo=new MemverVO("세종대왕","기획부","2021-06-10",1000); //앞에 생성자불러온거.
	
		//Vector객체에 다른 객체 추가하기. 3번
		v.add(username);
		v.addElement(num);
		v.add(1, cal); //1번째 25000이 뒤로밀리고 카랜다가 들어감
		v.addElement(vo);//마지막에 맴버 vo가 들어감
	
		//v.remove(1);
		//v.remove(cal)
		return v;
		
	}
}
	
	//public static void main(String[] args) {
	//	new VectorTest().start() ;//1번 

	//}

//}
/*List(인터페이스 상위클래스로 형변환 되는거) : index 존재한다.
 * 									 저장 순서를 유지한다.

  */
 