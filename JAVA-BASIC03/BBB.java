
//상속클래스 

public class BBB extends AAA {
	int num=200;
	String tel ="010-1234-1234";
	public BBB() {
	
	}
	public void output() {
		System.out.println("번호="+num+",연락처="+tel+",이름"+name);
	}
}
//두개다 아웃풋이 있을경우에는 객체로 선언된 자식클래스가 선언한다.
/*



메인메서드랑 이름이 같으니깐 생성자 메서드라고 한다.
*/