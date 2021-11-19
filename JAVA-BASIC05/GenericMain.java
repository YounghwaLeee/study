import java.util.Calendar;

//제너릭테스트 맴버변수에 담아야 한다.
public class GenericMain {

	public GenericMain() {
		String data= "서울시 마포구 백범로";
		GenericTest gt= new GenericTest();
		gt.setusername(data);
		
		GenericTest gt2 = new GenericTest();
		
		//만약 지금 있는 데이터가 카랜더이다.
		Calendar now= Calendar.getInstance();// 카랜다를 스트링에 담을 수 없음-> 어쩔떄는 카랜다 담고 스트링담을떈 제너릭을 만들어서 넣으면된다.
		
		GenericTest<MemverVO> gt3 = new GenericTest<MemverVO>();
		gt3.setusername(new MemverVO("홍","기획부","2021-01-21",8000));
		
		GenericTest<Calendar> gt4= new GenericTest<Calendar>(now);
		MemverVO vo= gt3.getUsername();
		System.out.println(vo.toString());
		
		System.out.println(gt4.getUsername());
				}

	public static void main(String[] args) {
		new GenericMain();
		
	}

}
