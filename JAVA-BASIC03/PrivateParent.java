
public class PrivateParent {
//여기가 맴버 private 접근 제한자는 다른 클래스에 객체를 통하여 접근할 수 없다
	//private 상속 안해줭 
	private int num =200;
	//생성자 메서드에 private 접근제한자는 객체를 생성할 수 없다.
//	private PrivateParent() {
//		
//	}
	PrivateParent(){
		
	}
	//객체를 통해서 접근불가 
	// 상속안함
	private void getData() {
		System.out.println("번호"+num);
	}

}
//같은 클래스 안에서는 접근하기 쉬움 
//안에서만 서로 접근할 수 있겠금 서로서로 자기들 끼리만 캡슐화