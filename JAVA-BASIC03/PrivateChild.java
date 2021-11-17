
public class PrivateChild extends PrivateParent {

	public PrivateChild() {
		// 상위클래스 private 멤버변수는 상속되지 않는다.
		//System.out.println("num--->"+num);->에러가난다
		
		//getData();
	}
	//private void getData() {
		//System.out.println("PrivateChild~~~");
	//}

}
