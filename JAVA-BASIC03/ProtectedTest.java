
public class ProtectedTest {
	protected int num=1234;
	String name = "세종대왕";
	protected ProtectedTest(){
		System.out.println("같은 패키지의 생성자 메소드");
		// protected 같은 패기지에 있으니깐 생성이 된거. 
		//ProtectedTest pt =new ProtectedTest(); 얘를 객체로 만든다음에 사용해야함.
	}	
		protected void print(){
			System.out.println("이름=+name"+name);
		}
		
	}
	


//protected 같은 패기지에 있으니깐 생성이 된거. 
		//ProtectedTest pt =new ProtectedTest(); 얘를 객체로 만든다음에 사용해야함.