import java.util.Scanner;

public class OOP_Ex01 {

	public OOP_Ex01() {
//		int dan = danInput();
//		String result= gugudan(dan);
//		System.out.println(result);
//		
		//System.out.println(gugudan((danInput)));
		
		
	} //new 하면 생성자 메서드가 실행이 된다.
	//단입력받기
			//지역변수이다int
			int danInput() {
			Scanner scan= new Scanner (System.in);
			
			System.out.print("단입력=");
			return scan.nextInt();
			}
			//정수하나를 입력받아서 리턴해주는 메서드.
			
			//구구단 출력하기
			String gugudan(int dan) {
				String gugu="";
				for(int i=2; i<=9; i++) {
					gugu+= dan+"*"+i+"="+dan*i+"\n";
					
				}
			return gugu; //gugu가 스트링으로 리턴된다.구구단은 실행하면 
			}
			
		void start() {
			int dan = danInput();
			String result = gugudan(dan);
			System.out.println(result);
		}	
		
		public static void main(String[] args) {
			OOP_Ex01 oop = new OOP_Ex01();  //얘만 남겨놓고 실행할 수 있다.
		
		//System.out.println(oop.gugudan(oop.danInput()));
				oop.start();
}

}
//콘솔에서 단을 입력받아 입력받은 구구단을 출력하라.
//(기능적으로 나눠져있다.)1.단을입력 2.구구단출력 3.단을 생성하여 출력 

/*
1. 단을입력-Scanner  단을 입력받을때만 사용하는 거니까 메소드 안에서만 하면된다.



*/