
public class MetthodMain {

	public static void main(String[] args) {
	//         mt는 객체이면서 인스턴스 이다. (결국은 변수이름) 	instancd=reference변수
						//생성자메소드 객체사용할때 클래스에 생성자 메소드
		MethodTest mt=	new MethodTest(); 
		MethodTest mt2= new MethodTest("010-1234-5555");
		
		//객체내의 맴버영역의 변수를 다른데이터로 수정하기
		//객체명.맴버변수 
		mt.name ="이순신";
		System.out.println("mt.name"+mt.name);
		System.out.println("mt2.name"+ mt2.name);
		
		//
		MethodTest mt3 = new MethodTest(100,"세종대왕");
		     //MethodTest mt3 = new MethodTest("세종대왕",100);
		
		System.out.println("mt3.num="+mt3.num); //100
		System.out.println("mt3.name="+mt3.name); //세종대왕
		System.out.println("mt3.tel="+mt3.tel); //02-1234-1234
	 	
		MethodTest mt4= new MethodTest("장영실",200);
		 //같은 클래스지만 객체마다 데이터가 다다름
		System.out.println("mt4.num="+mt4.num);//200
		System.out.println("mt4.name="+mt4.name);//장영실
		System.out.println("mt4.tel="+mt4.tel);
	}

}
