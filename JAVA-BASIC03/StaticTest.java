
public class StaticTest {
	int num=0;
	String name="홍길동";
	//현재 클래스의 모든 객체에서 1개만 존재한다 (공통 변수로 사용)
	static String addr="마포구";
	//static 이 들어가면 공통 변수가 되어버림
	public StaticTest() {
	}
	//주소를 변경하는 메소드(반환형은 없다)
	void setAddr(String addr) { //보이드는 반환하는건 없는데 매개변수로 스트렝 어드세스가 있음.this 매개변수가 있다가 실행할때 괄호에 뭔가 를 써줘야됌
		System.out.print(num);
		addr = " ";
		this.addr =addr;// 같은놈이다라는걸 알려줌 addr은 누가 누군지 모르기때문에 this.addr이라는것이다.마포구라는걸 쓸거야addr을 이미선언한건지만 난 매개변수로 선언했다
		System.out.print(addr);
	}
	void AddrNumber2()
	{
		int i=0;
		for(i=0; i<100; i++)
		{
			num+=num;
		}
	}
//	int AddrNumber() {
//		int i=0;
//		for(i=0; i<100; i++)
//		{
//			num+=num;
//		}
//		//System.out.print(a);
//		return num;
//	}
	String getAddr() {//int flaot double char String
		return addr; //그냥 값이다 마포구를 갖고있다. addr은 값만 갖고있따 출력되는게아님
	}
	
	public static void main(String[] args) {
		StaticTest sa = new StaticTest();
		System.out.println(sa.num);
		
		
		//sa.setAddr("이영화");
		
		//System.out.print(sa.name);
	}
}
