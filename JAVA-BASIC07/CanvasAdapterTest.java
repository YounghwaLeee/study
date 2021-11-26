import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CanvasAdapterTest extends MouseAdapter {
	MouseAdapterTest2.MyCanvas mc;
	public CanvasAdapterTest() {
	
	}
	//메소드 재 오버라이딩
	public CanvasAdapterTest(	MouseAdapterTest2.MyCanvas mc) {
		this.mc=mc;
		//내부클래스니깐 잘 불러오지 않는다.
		
	}
	public void mouseRelease(MouseEvent me) {
		if(me.getButton()==1) {
			mc.x=me.getX();
			mc.y=me.getY();
			mc.repaint();
			//클래스가 다르니깐mc를 이쪽으로 넘겨주는 방법(매개변수)통해서 넘겨줌
			
		}
		
	}

}
