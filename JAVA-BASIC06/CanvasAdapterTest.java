import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CanvasAdapterTest extends MouseAdapter {
	MouseAdapterTest2.MyCanvas mc;
	public CanvasAdapterTest() {
	
	}
	//�޼ҵ� �� �������̵�
	public CanvasAdapterTest(	MouseAdapterTest2.MyCanvas mc) {
		this.mc=mc;
		//����Ŭ�����ϱ� �� �ҷ����� �ʴ´�.
		
	}
	public void mouseRelease(MouseEvent me) {
		if(me.getButton()==1) {
			mc.x=me.getX();
			mc.y=me.getY();
			mc.repaint();
			//Ŭ������ �ٸ��ϱ�mc�� �������� �Ѱ��ִ� ���(�Ű�����)���ؼ� �Ѱ���
			
		}
		
	}

}
