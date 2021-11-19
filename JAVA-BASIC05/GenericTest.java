 
//E(element),K(key),V(value) 3개중에 하나 쓰면된다.
public class GenericTest<E> { //제너릭 객체 생성하는거.제너릭 뭘로 선언할까? 한거임
//맴버변수 
	private E username;
	//private Object username;
	public GenericTest() {
	}
	public GenericTest(E username) {
		this.username= username;

		//생성자가 2개이니깐 사용하는 방법도 2개 
	}
	//값을 밖으로 내보내는거getter
	public E getUsername() {
		return username;
	}
	//데이터를 바꾸는거 세팅하는거니깐 반환형 없음
	public void setusername(E username) {
		this.username=username;
	}
	
}

/*
//private String username; -> 여기에는 g1.setUserName(1234)->넣으면 대입안돼
	private Object username;->여기에는 g1.setUserName(1234)->넣으면 대입됌. 오브젝트가 오터언박싱?박싱?해서넣어줌.

*/