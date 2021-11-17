
import test.DefaultData;
import test.LottoOOP;
//모디피어 테스트에서 디폴트 값 네임 텔이 필요해 그럼 객체만들어!!
public class ModifierTest {

	public ModifierTest() {
		//LottoOOP lotto= new LottoOOP();
		//lotto.lottoStart(); 
		
		
		DefaultData dd= new DefaultData();
		//객체명.멤버변수
		//System.out.println("이름"+dd.name);
		System.out.println("이름"+dd.getName());
		//System.out.println("연락처"+dd.tel);
		
		
		//현재내가 생성하는 곳은 여기, 이클래스에서 다른 클래스를 객체화시키고있음 패키지가 다름 .
		//모디피테스트에서 로또 오오피를 사용하는것이다. 접근 제한자는 사용을 허용하는 
		//클래스에 의해서 이 모디피어 테스트가 로또 오오피를 쓸수 있는가 없는가.
		//로또 오오피 보니깐 1. 패키지가 다름 = 그럼 임폴트 해야함. 다른 방이된거다.
		DefaultData dd2 = new DefaultData("이순신","010-8888-8888");
		dd2.sum();
		
		DefaultData.sum();
		//DefaultData.getName();
		
	}

	public static void main(String[] args) {
		//접근제한자
		//클래스 :public ,default(생략)
		//생성자메소드,메소드 ,맴버변수: public,protected, default,private
		//여기에서 test 패키지 안에있는 로또가 필요해여~~
		//퍼블릭이 없으면 디폴트 값을 갖는거니까 다른 패키지면 사용하지 못하게 된다.
	
		
		//public - 공용으로 할거냐 말거냐
		//default-같은 클래스 에 있는것은 허용해줄거다.
		//상속-protected,private-상속할때 같이 할것이다.
		new ModifierTest();
	}

}
