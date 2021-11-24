import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowEventTest extends JFrame implements WindowListener{

	public WindowEventTest() {
		
		 setSize(500,500);
	      setVisible(true);
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      this.addWindowListener(this);
		
	}
	public static void main(String[] args) {
		new WindowEventTest();

	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Openen");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
		//dispose();
		//System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Iconified");
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Deiconified"); //아이콘이 되었던게 확장되면
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activate"); //활성화되면
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Deactivated"); //비활성화되면
		
	}

}
