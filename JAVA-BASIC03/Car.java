//car는 상속받은게 없으니 오브젝트가 들어가있음 
public class Car extends Object {
	int speed=0;
	final int SPEED_MAX=180;
	final int SPEED_MIN=0;
	String carName = "그랜져";
	
	public Car() { 
		System.out.println("Car()생성자메소드 실행");
		//얘가 생성자
		//상속 관계일떄는 상위클래스에 매개 변수 없는 생성자가 있어야 한다 이말임.
		//매개변수 없는게 실행됌 얘말고 매개변수 있는게 실행되어야 된다고 할때
	}
	
	public Car(String carName) {
		this.carName =carName;
		System.out.println("Car(string)생성자메소드 실행");
	
	}
	public void speedUp (){
		speed++;//차가 계쏙 올라가면 터지니깐 한계설정 final int SPEED_MAX=108;상수로
		if(speed>=SPEED_MAX )speed=SPEED_MAX; //스피드가 현재속도보다 올라가면 최고속도로 안올라가게 새팅해라잉
		System.out.println("car.speedUp->speed="+speed);
	}//메서드 생성
	public void SpeedDown() {
		speed--;
		if(speed<=SPEED_MIN) {
			speed=SPEED_MIN; //스피드가 0보다 작으면 스피느는 최소 데이터다
		System.out.println("speedDown-speed"+speed);
		}
	}

}
 //카 클래스를 상속받을 트럭의 클래스를 만들것이다.