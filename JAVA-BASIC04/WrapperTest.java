
public class WrapperTest {

	public WrapperTest() {
		//WrapperTest 기본 데이터형의 정보를 객체로 변경시키는 클래스이다
		//Byte Short Integer,Long
		//Float,Doubld
		//Boolean
		//Character
		
		int a = 1234;    
		Integer i= Integer.valueOf(a);
		
		System.out.println("a="+a);
		System.out.println("i="+i);
		//취소선 될수있으면 사용하지마~ 구현은 되는디 그냥쓰지말어~
		//static은 객체 만들지말고 사용해도 된다.
		
		Object obj= a;	//오토박싱
		Object obj2 = i;
		System.out.println("obj="+obj);
		System.out.println("obj2="+obj2);
		
		int x = i; //오토언박싱
		System.out.println(x);
		
		
		//자바 버전에 따라 결과값 달라짐.
		//1.1,1.2,   1.3 1.4 5 6 7 8 9  12 13 14 15 16
		
		/*오토박싱 integer i=a;
		 * 오토언박싱	int b =i;
		 * */
		 
		
	}

	public static void main(String[] args) {
	new WrapperTest();

	}

}
