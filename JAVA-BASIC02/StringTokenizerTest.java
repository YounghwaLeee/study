import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		String txt = "서울시, 마포구,,,,,,,,,, 신수동, 거구빌딩, 3층, 비트캠프, 교육센터";
		
		StringTokenizer st = new StringTokenizer(txt,",.");
		int tokencount = st.countTokens();
		System.out.println("토큰수"+ tokencount);
		
		while(st.hasMoreElements()) {//true :남은 토큰이 있을때 ,false :남은토큰이없을때
			String token = st.nextToken();
			System.out.println(token);
		
			}
		}
		
		//스트링버퍼나 스트링 빌더를 사용하는게 효율이다.
	//스트링이랑 스트링 버퍼의 차이점 
	//스트링은 주소 옮겨다님 스트링버퍼는 주소가 생겨도 옮겨다니지 않음

	public static void main(String[] args) {
		new StringTokenizerTest();

	}

}
