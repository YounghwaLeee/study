//상속받고나면 바로 클래스명에 빨간줄 그어져 있음
public class AbstractMain extends AbstractTest {

	public AbstractMain() {
	
	}

	//상속받은 추상클래스내의 모든 추상메소드를 오버라이딩 
	//d오버라이딩 할때는 Abstract 안씀
	public void print() {
		System.out.println("num="+num+",name="+name);
	}
	//상속받은 클래스에서 기능구현을 한것이다
	//변수명은 달라도 되지만, 데이터형, 갯수도 가아야함
	public void setData(int num,String name) {
		this.num= num; //super.num= num
		this.name= name;	//super.name =name (현재클래스에 넘버네임없으니깐슈퍼가능)
		
		
	}
	public void start() {
		numOutput();
		setData(5000,"이순신");
		print();
		
	}
	public static void main(String[] args) {

		AbstractMain am = new AbstractMain();
		am.start();
		
	}

}
