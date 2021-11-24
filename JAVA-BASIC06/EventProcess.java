import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventProcess implements ActionListener {
	JLabel lbl;
	public EventProcess() {
	
	}
	public EventProcess(JLabel lbl) {
		this.lbl= lbl;
		
	}
	public void actionPerformed(ActionEvent ae) {
		lbl.setText("이벤트가 발생함...");
	}

}
//이벤트를 꼭 하나의 클래스에 할 필요는 없다. 한클래스말고 다른 클래스에서 구현할 수 있다. 