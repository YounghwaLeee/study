
public class AaaBbbMain {

	public AaaBbbMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BBB b =new BBB();
		b.output();
		//하위 클래스로 객체를 생성하면 상위클래스에 대입이 된다.
		AAA a = new BBB();//부모에서 자식을객체선언 자식에서 부모를 객체 선언하는건 절대로 안됌 아예값이 실행안됌.
		a.output();
		
		System.out.println("b.tel="+b.tel);//
		//System.out.println("a.tel="+a.tel);
		System.out.println("a.name=" +a.name);//변수는 원래 aaa를 본다
		System.out.println("a.num="+a.num);//변수는 자기꼐 출력이 된다. 메서드는 둘다 있따면 자식게나온다.
		
		BBB c= (BBB)a;
		c.output();
		
		Object obj = new BBB();
		BBB d = (BBB)obj;
		d.output();

	}

}
//변수는 메서드로 통하지 않으면 접근이 안됌
