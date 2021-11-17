
public class StaticTest2 {


		// static
		//맴버변수의 데이터형 횐쪽public static int a=100;
					//	static int b=200;
		//메소드의 반환형 왼쪽에 표기한다.
		//반환형은 public static void method(){}
		// 접근 제한자가 없다면 public void method(){}
		
		//맴버영역에 실행표기 할수없다.
		//static{}에는 실행문을 표기할 수 있따.
		//static{}과 생성자메서드는 static{}이 먼저 실행된다.
	
		static {
			//static{}에는 실행문을 표기 할수있다.
		for(int i=1; i<=10; i++) {
			System.out.println(i);  //실행문 
		}
	}
	
		public StaticTest2() {
			System.out.println("StaticTest2()메소드실행");
		}
	public static void main(String a[]) {
		new StaticTest2();

	}

}
//생성자 메서드가 ?