//1.Thread 클래스 상속				여기안에 start메소드가 있다. 스레드안에.
public class ThreadTest1 extends Thread {
	String msg;
	public ThreadTest1() {}
	public ThreadTest1(String msg) {
		this.msg=msg;
		
	}
	//스레드 구현코드를 run()오버라이딩 한다.
	public void run() {
		for(int i=1;;i++) {
			System.out.println(msg+"="+i);
		}
	}
	

	public static void main(String[] args) {
		ThreadTest1 tt1= new ThreadTest1("첫번쨰스레드"); //start를 한다고 해서 두개중에 뭐가 실행될지는 모름
		//3.스레드 시작하기 위해서는 start()메소드호출
		tt1.start();
		
		ThreadTest1 tt2= new ThreadTest1("두번째스레드");
		tt2.start();
		
		ThreadTest1 tt3= new ThreadTest1("세번째스레드");
		tt3.start();

	}

}


// 스레드로 만드는 방법 thread start 하면 저절로 실행이된다.
//runable 인터페이스를 상속받아서 구현하는 방법

// 1. 스레드상속2.  run메서드 3. 객체만들어서start 버튼 Thread 안에 start 라는 메서드가 있기때문에 객체.start 하면된다.
 