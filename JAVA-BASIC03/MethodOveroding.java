//오버로딩 할것이다. 같은 클래스에서 메소드명이 같은 메소드가 여러개 존재할 때 오버로딩이라고 한다.
//메소드명과 반환형은 같고, 매개변수의 개수나 데이터형은 달라야한다.
//비슷한 기능을 하는 메서드가 여러개 있을 수도 있음 이런 메서드가 각각 다른이름으로 저장되어있다면
//어떨때 어떤 메서드를 사용해야 할지 어렵기 떄문에 . 


public class MethodOveroding {
	int maxresult;
	public MethodOveroding() {
	
	}
		int totalResult(){
			//1~100까지의 합을 구한다.
			int result=0;
			for(int i=1; i<=100; i++) {
				result+=i;
			}
			return result;	
			}

	//1~max까지 합구하는 메소드
	int totalResult2(int max) {
		int result=0;
		for(int i=0; i<=max; i++) {
			result+=i;
		}
		return result;
	}
	void totalResult3()
	{
		int result=0;
		for(int i=0; i<=100; i++) {
			maxresult+=i;
		}
		System.out.print(maxresult);
	}
	
	public static void main(String[] args) {
		MethodOveroding mo= new MethodOveroding();
		
		int r = mo.totalResult();
	
		int rr= mo.totalResult2(10);
		//int rrr= mo.maxresult;
		//System.out.printf("%d",rrr);
		System.out.printf("%d:",rr);
		//System.out.println("maxresult:"+ rrr);
		
		//System.out.println(100);
		//System.out.println(10.2);
		//System.out.println('A');

	}

}
