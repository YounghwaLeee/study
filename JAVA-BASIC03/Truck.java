//car가 상위 트럭이 상속받는거다. extend 키워드를 이용하여 클래스를 상속받는다.
//상속은 클래스는 1개만 상속 받을수 있다.
//상속 은 클래스명 옆에 extends 한다음에 상속받고싶은 클래스 명을 적어주면 끝
//트럭은 car 에 기능을 다 구현 할 수 있다. 
//상속 관계일떄는 상위클래스에 매개 변수 없는 생성자가 있어야 한다
public class Truck extends Car{
	int speed = 100; 
	public Truck() {
		System.out.println("truck()생성자메소드실행");
		
		System.out.println("Truck.speed->"+speed);
		super.speedUp();
		//super가 있냐 없냐에 따라 상속된클래스인지 아닌지를 구분 할 수 있다.
		
	}
	public Truck(String carName) {
		//상위클래스의 생성자메소드 호출
		//반드시 첫번쨰 실행문이여야 한다.
		super(carName);
		//상위클래스의 생성자메서드 호출
		System.out.println("Truck(String)생성자실행~~~");
		
		//상위클래스에 그랜져를 소나타로 불러올래요
		//상위클래스에 원하는걸 불러오기 위해선 강제로 불러오면됌 
		//트럭이 하위임 
		
	} //생성자메서드가 하나더 있으려면 매게변수가 있어야함
	
	//overriding 이라고 한다. 반환형,메소드명,매개변수가 같은 메소드를 재정의하는걸 의미한다.
	//상위클래스의 메서드를 하위클래스에서 재정의 
	public void speedUp() {
		//원래 상속받는거 1씩 속도가 증가하게 되어있는데 난 따로 10씩 증가하는걸 만들게
		speed +=10;
		if(speed>=SPEED_MAX){
			speed=SPEED_MAX;
		}
		System.out.println("truck.speed="+speed);
	}
	//하위에서 오버라이딩 한거말고 상위클래스걸 다시 사용하고 싶을땐 
	
	public static void main (String a[]) {
		Truck t= new Truck(); //얘가 생성자 메서드 
		//트럭이라는 객채를 생성해야함.
		System.out.println("t.speed="+t.speed);
		//상위클래스의 메소드 호출 객체이름이t이다 
		t.speedUp();
		t.speedUp();
		t.SpeedDown();
		//매개변수 없는게 실행됌 얘말고 매개변수 있는게 실행되어야 된다고 할때
		//상위 클래스의 생성자를 선택적으로 호출하기
		Truck tt=new Truck("소나타");
		System.out.println("tt.carName="+tt.carName);
		
	}
}

//상속관계를 먼저 하고 상속이 되어있으면 상위클래스에 가서 
//생성자 메서드 매개변수 없는걸 실행한다

//스피드 업이라는건 1증가 

//매개변수 없는게 실행됌 얘말고 매개변수 있는게 실행되어야 된다고 할때