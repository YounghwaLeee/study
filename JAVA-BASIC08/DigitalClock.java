import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable {
	
	Calendar now;
	JLabel lbl= new JLabel("12:24:28",JLabel.CENTER); //jlabel �� final ������ ����. 
	Font fnt = new Font("����",Font.BOLD,80); //font  Font.__,
	int x; int y;

	public DigitalClock() {
		
		super("�ð�");
		add(lbl);
		lbl.setFont(fnt);

	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public String getTimer= {
			now=Calendar.getInstance(); //Ķ���� ��ü�� �������ָ� ���� �ð��� �ѹ������´�.�굵 ��� ������ �Ǿ��Ѵ�.
			SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss"); 
			return.fmt.format(now.getTime());
			
	}


	public static void main(String[] args) {
//		DigitalClock dc1= new DigitalClock(0,0);
//		Thread t1= new Thread(dc1);
//		t1.start();
//		
//		DigitalClock dc2= new DigitalClock(0,0);
//		Thread t2= new Thread(dc2);
//		t1.start();
//		
//		DigitalClock dc3= new DigitalClock(0,0);
//		Thread t3= new Thread(dc3);
//		t1.start();

	}
}