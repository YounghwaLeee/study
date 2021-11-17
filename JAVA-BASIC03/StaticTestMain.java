import java.util.Calendar;

public class StaticTestMain {

	public StaticTestMain() {
		
	}

	
	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		StaticTest ss2 = new StaticTest();
		
		ss.setAddr("영등포구");
		//마포구가 없어지고 영등포구가 들어감.
		
		String address=ss2.getAddr();
			System.out.println("address="+address);
		//static 맴버변수는 객체생성하지 않고 사용할 수 있다.
		//
			System.out.println("name="+StaticTest.addr);
		
			
			Calendar now =Calendar.getInstance();
			System.out.println(now.get(Calendar.YEAR));
	} 

}
