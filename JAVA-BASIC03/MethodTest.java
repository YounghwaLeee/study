
public class MethodTest {
		//멤버영역 ,전역변수     //this 현재 클래스가 있는 맴버
	int num=12; 
	String name ="홍길동";
	String tel; //초기값이 없어서 null
	//생성자 메소드 (생성자 메소드가 뭐가 있냐에 따라서 1가지 이상 설정할 수 있다)	
	
	//MethodTest(){} 생략시 자동 추가 (자바가상머신이) 상속관계가 아닐때에만 추가해준다.
	//자바가상머신이 다 넣어주진 않고 상속관계일때만 넣어준다. 이럴땐 필요하던 안하던 매게변수가 없는 생성자 하나를 넣어준다
	//매개변수는 데이터형이 다르거나 데이터의 변수의 갯수가 달라야 한다.
	MethodTest(){}
	MethodTest(String tel){
	System.out.println("연락처"+tel);
		//메서드 내에 지역변수. 
	}
	//생성자 메서드를 여러개 만들수 있는데 매개변수가 문제임
	//데이터타입이 같고 변수의 개수가 같으면 안됌. 

	//MethodTest(String name){
		
	//}
	MethodTest(int num){
		
	}
	
	MethodTest(int num, String name){
		//현재객체(현재클래스)
		this.num=num; 
		this.name=name;
		String tel ="12345";
		//this.tel="02-1234-1234"; //얘는 위에 
		
		//	 100이라는 값을 전역맴버영역에 넣어야 100이 살아있음 
		//mt3가 구현됌 100대입,세종대왕
		//대입후 지역변수이기 때문에 없어지지만. 실행후 맴버영역에 데이터를 남겨놔야 할때
	}
	MethodTest(String name, int num){
		//생성자 메소드에서 다른 생성자 메소드 호출하기 
		//생성자 메소드에서 다른 생성자를 호출 때는 메소드명을 직접 표기할수 없다.
		//그대신 this 라는 키워드를 쓴다 
		//MethodTest(num,name); ->쓸수없다\
		//this() 이용하여 다른 생성자 메소드를 호출할때는 반드시 첫번째실행문이여야 한다.
		this(num,name);      //생성자 메소드에서서는 this가 첫뻔쨰임.일빠따로와야됌
		//메소드명만 this()로 호출해서 첫번째줄에 넣어야됌
		
	}
}










