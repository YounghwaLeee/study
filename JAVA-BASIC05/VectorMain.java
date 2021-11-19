import java.util.Calendar;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		//VectorTest클래스의 start()메소드를 호출하면 Vector가 리턴된다.
		//리턴안에는 객체가 4가지가 있다. 홍길동 카랜다 맴버 ~~있음
		
		VectorTest vt = new VectorTest(); // 1. 객체생성
		Vector vvv=vt.start();
		
		String aaa = (String)vvv.elementAt(0); //String이 들어가 있음 0번째를 개설했는데 얘가 스트링이아니네? object
		System.out.println("aaa="+aaa);
		Calendar ccc =(Calendar)vvv.get(1);
		System.out.println("ccc="+ccc);
		Integer iii =(Integer)vvv.elementAt(2);
		System.out.println("iii="+iii);
		MemverVO vo=(MemverVO)vvv.elementAt(3);//"세종대왕","기획부","2021-06-10",1000
		vo.memverPrint();
		
		System.out.println(vvv.toString());
		
	}

	public static void main(String[] args) {
		new VectorMain();

	}

}
