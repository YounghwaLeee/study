import test.ProtectedTest2;
//다른 패키지의 다른 클래스는 defalut 처럼 사용 가능 
public class ProtectedTestMain extends ProtectedTest2  {
	
	ProtectedTestMain(){
		ProtectedTest pt =new ProtectedTest();
		System.out.println(pt.num);
		pt.print();
		//다른 패키지의 클래스는 객체를 생성할 수 없다.
		//ProtectedTest2 pt2 = new ProtectedTest2();
		
		System.out.println("tel=tel");
		telOutput();
	
		}

	public static void main(String[] args) {
	new ProtectedTestMain();
	
	 ProtectedTest2 ppt =  ProtectedTest2.getInstance();
	 System.out.println(ppt.getTel());
	 //
	
	}

}
