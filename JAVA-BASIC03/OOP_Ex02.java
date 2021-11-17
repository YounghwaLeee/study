import java.util.Scanner;

public class OOP_Ex02 {
			int dan;//입력받은 단을 저장할 변수 초기값이 없으니 =0
			String gugu="";//구구단을 저장할 변수=null은 생성된 적이 없다는걸 뜻함
	 
	public OOP_Ex02() {
	} 		//단입력받기
			int danInput() { //호출됨
			Scanner scan= new Scanner (System.in);
			
			System.out.print("단입력=");
			return scan.nextInt(); //리턴
			}
			
			//구구단 출력하기
			void gugudan() {
				for(int i=1; i<=9; i++) {
					gugu+= dan+"*"+i+"="+dan*i;
						}
			 //gugu가 스트링으로 리턴된다.구구단은 실행하면 
			}
			
		void start() {
			dan = danInput();  //단입력 받는 메서드를 호출
			gugudan(); //이 dan이란 변수는 맴버변수dan에 있다.
			System.out.println(gugu);
		}	
		
		public static void main(String[] args) {
			OOP_Ex02 ar1= new OOP_Ex02 ();
				
		//System.out.println(oop.gugudan(oop.danInput()));
				
}

}
//콘솔에서 단을 입력받아 입력받은 구구단을 출력하라.
//(기능적으로 나눠져있다.)1.단을입력 2.구구단출력 3.단을 생성하여 출력 

/*
1. 단을입력-Scanner  단을 입력받을때만 사용하는 거니까 메소드 안에서만 하면된다.



*/