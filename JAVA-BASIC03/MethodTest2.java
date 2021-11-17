
public class MethodTest2 {

	//1.전원 켜는 기능 
	boolean power= false; //true 켜침, false: 꺼짐
	
	//채널 관련된것 // 최소 최대는 고정 now는 매번 바뀜'
	//상수화 시킨다. 한번 대입되면 변경될수 없게끔 만드는거.
	final int CHANNEL_MIN =1;  //이시스템안에서 최소번호는 무조건 1번이얌!!
	//데이터형 왼쪽에 final 키워드를 표기 , 상수화된 변수는 모든 변수명을 대문자로 표시한다 
	
	final int CHANNEL_MAX =20;
	int channerNow = 11;
	
	
	public MethodTest2() {
	//생성자 메서드는 new 하고 할떄 사용 이걸 생성자 public MethodTest2() 메서드라고 한다.
	}
	//power버튼을 누른 경우 
	// 메서드 생성규칙 1. 반환형 메소드명 (매개변수,매개변수, ....필요한만큼){
	//	실행문 ; // 기능구현 
	// }

	//메소드명은 소문자시작,합성어일 경우 두번째 단어부터 대문자로 ()가 있다.
	// void powerStart (앞소문자인데) void PowerStart =하면 안된다
	//{여기안에서는 모든걸 사용할수있음.}
	//
	void powerStart() {
		power = !power; //트루를 펄스로 펄스를 트루로
		//void 반환형이 없다.
		
//		if(power) {
//			power =false;
//		}else {
//			power =true;
//		}
		
		System.out.println("power="+power);
		
	}
	//단을 입력하면 구구단을 구하여 반환하는 메소드를 생성 or 반환 안하는 메소드를 생성
	 //void 는 반환형이 없기 때문에 내보낼수 없다. 구구단 앞에 써줄 수 없음 . 
		String gugudan(int dan){
			//실행문- 실행한 결과가 밖으로 내보내는것. 실행문1개만 내보낸다.
			String result ="";
			for(int i=2;i<10;i++) {
				result += dan + "*"+i+"="+dan*i+"\n";
			}
			
			return result; 
			//어떤 데이터가 밖으로 나가는지 알려줌. 구구단이 스트링을 통해서 문자로 나간다.
	}
		//채널 번호 올리기 
		//1.채널만 바꾸면 되니깐 반환형이 없음
		 void cahnnelUp() {
			if(channerNow==CHANNEL_MAX) {
				channerNow=CHANNEL_MIN;
			}else {
				channerNow++;
			}
			cahnnelPrint();//현재 클래스의 다른 메소드 호출
		}
		
		//채널 번호 내리기 
		void cahnnelDown() {
			if(channerNow==CHANNEL_MIN) { //현재체널이 가장 작은 채널이면 1버이면 
				channerNow=CHANNEL_MAX;
			}else {
				channerNow--;	
			}
			
			cahnnelPrint();
		
	}
		//채널번호 출력하는 메소드
		void cahnnelPrint () {
			System.out.println("채널번호:"+channerNow);
		}

		//클래스가 같다는 얘기는 한집에 있따는 얘기이다. 

		//static 키워드 - 없을때는sum이라는 메서드를 사용할  경우
		static void sum(int max) {
			int tot=0;
			for(int i=1; i<=max; i++) {
				tot+=i;
			}
			System.out.println("1~" +max+"의 합은"+tot);
		}
}