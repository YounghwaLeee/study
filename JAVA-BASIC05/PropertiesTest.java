
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		//key, value 모두 String 인 collection이다.
		
		Properties prop = new Properties(); //다른것들과는 달리 제너릭이 없다. 
		// 컬렉션에 객체 추가 setProperty 라는메서드
		prop.setProperty("네이버", "https//www.naver.com");
		prop.setProperty("네이트", "http://www.nate.com");
		prop.setProperty("다음", "http://www.daum.net");
		prop.setProperty("구글", "http://www.google.com");
		
		//getProperty():키를 이용하여 객체 얻어오기
		
		System.out.println(prop.getProperty("다음")); //왼쪽에 있는게 key 니깐 다음주소 구해짐
		
		//키 전체목록 구하기
		Enumeration e  = prop.propertyNames(); //제너릭이 없다 보니깐 object로 담겨져있다.
		
		while(e.hasMoreElements()) { //객체가 남아있을 경우true,없으면 false //하위에서 상위로 다시 넣어야하니깐 형변환을 해줘야한다.
			//Object boj =e.nextElement(); 이렇게 하면 바로 들어감
			
			String str=(String) e.nextElement();
			System.out.println("key="+str+",vlaue="+prop.getProperty(str));
		}

	
	}

	
	
	public static void main(String[] args) {
		 new PropertiesTest();
	}

}
