
public class StringBufferTest {

	public StringBufferTest() {
	 start();

	}
	public void start (){
		StringBuffer sb1= new StringBuffer(); //16byte //32 //확보를 두개씩?
		StringBuffer sb2 = new StringBuffer(100); //100byte
		//데이터처리에 대해서는 공간확보는 신경안써도됌
	
		//append() :문자열추가
		sb1.append("Buffer append Test..");
		sb1.append(123456);  //기존에있는 문자열을 합쳐주는거 
		
		//insert(): index 위치 문자 삽입
		sb1.insert(5, "(스트링버퍼)");
		sb1.insert(15, 23235.21542554);
		//012345 7트가 7임 
		//Buffe(스트링버퍼)r a23235.21542554ppend Test..123456 현재데이터
		
		sb1.deleteCharAt(6); //
		sb1.delete(1, 4); //index 1부터 4까지 지우기 
		//0123 45 67
		//Be(트링버퍼)r a23235.21542554ppend Test..123456 현재데이터
		sb1.replace(1, 3, "(자바)"); //index1부터 3까지를 "(자바)"로 치환
					//값 : B(자바)트링버퍼)r a23235.21542554ppend Test..123456
		
		sb1.reverse();//654321..tseT dnepp45524512.53232a r)퍼버링트)바자(B
		
		
		//확보된 공간 확인하기 
		System.out.println("sb1.capacity="+sb1.capacity());
		System.out.println("sb2.capacity="+sb2.capacity());
		System.out.println(sb1);
	}
	public static void main(String[] args)	{
	new StringBufferTest ();

	}

}
