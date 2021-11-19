
//클래스에서 interface를 상속받을 경우 implements 키워드를 이용한다.
//interface는 여러개 상속받을수 있다. 개수의 제한은 없다.
//상속받은 모든 추상메소드는 오버라이딩 해야한다. 
public class InterfaceMain implements InterfaceTest1, InterfaceTest2{

	public InterfaceMain() {
		}
	//추상메소드 오버라이딩 
	public void output() {}
	//기능 구현 할거 없어도 오버라이딩해야함 인터페이스 테스트1 output을 오버라이딩한거
	public int sum() {
		return 5050;
	}
	public void oddSum() {
		int sum=0;
		for(int i=1; i<=MAX;i+=2) {
			sum+=i;
		}
	System.out.println("1~max까지의 합은"+sum);
	//반환형이 없으니깐 (리턴) 안에서 바로 출력을 해줌
	}

	public int evenSum() {
		int sum=0;
		for(int i=2; i<=MAX;i+=2) {
			sum+=i;
		}
		return sum;
	}
	
	public void resultPrint (int data) {
		System.out.println("결과갑="+data);
	}
	public void start() {
		resultPrint(sum()); //합이구해짐 1~100결과값은 5050
		oddSum();//1~100까지의 홀수의 합 2500
		resultPrint(evenSum());//2550
	}
	public static void main(String[] args) {
		new InterfaceMain (). start();

	}

}
