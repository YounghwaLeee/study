//클래스명과 메소드명이 똑같다. 매게변수가 없는 생성자를 이클립스에서 생성됌
public class MethodTest2Main {

	public MethodTest2Main() {

	}

	public static void main(String[] args) {
		
		//현재 필요로 하는 메소드 2에 들어가있음.
		 MethodTest2 mt = new  MethodTest2();
		 
		 String gugu=mt.gugudan(8);  //메소드호출
		 System.out.println(gugu);
		 
		 //반환형이 없는 메소드 호출
		 mt.powerStart();
		 //얘는 왼쪽에 변수 선언할 수 없음 . 반환하는 데이터가 없기 때문에
		 
		//객채명.
		 mt.cahnnelUp();
		 mt.cahnnelUp();
		 mt.cahnnelDown();
		// static 키워드 - static  없는 메소드는 반드시 객체를 만들어메소드를 호출ㄹ해야 한다.
		 mt.sum(20);
		// sum이라는 메소드를 포함하고 있는 클래스는 MethodTest2 객체로 만들고 
		// 객채명.sum 이라고 하면된다
		//static이 메소드의 반환형 왼쪽에 있는 경우는 메소드를 객체생성하지 않고 호출할수 있따,.
		 MethodTest2.sum(50);    //객체를 통해 쓴게아니라 클래스.을 쓴거임
	}

}
