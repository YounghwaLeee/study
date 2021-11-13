
public class BufferTest1_ex {

	public BufferTest1_ex() {
		
		start();
		
	}
	public void start() {
		StringBuffer sb1= new StringBuffer();
		StringBuffer sb2= new StringBuffer(100);
		
		sb1.append("Buffer append Test..");
		sb1.append(123456);
		//append 문자열 추가 
		
		sb1.insert(5, "(스트링버퍼");
		sb1.insert(15, 23235.21542554);
		    //Buffe(스트링버퍼r ap23235.21542554pend Test..123456
		//삭제 
		sb1.deleteCharAt(6);
		    //Buffe(트링버퍼r ap23235.21542554pend Test..123456
		sb1.delete(1, 4);
			//Be(트링버퍼r ap23235.21542554pend Test..123456
		
		sb1.replace(1, 3, "(자바)");
			//B(자바)트링버퍼r ap23235.21542554pend Test..123456

		System.out.println(sb1);
		
	}
	
	
	
	public static void main(String[] args) {
		new BufferTest1_ex();

	}

}
