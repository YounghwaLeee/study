import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable {
	
	Calendar now;
	JLabel lbl= new JLabel("12:24:28",JLabel.CENTER); //jlabel 에 final 변수가 있음. 
	Font fnt = new Font("굴림",Font.BOLD,80); //font  Font.__,
	int x; int y;

	public DigitalClock() {
		
		super("시계");
		add(lbl);
		lbl.setFont(fnt);

	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public String getTimer= {
			now=Calendar.getInstance(); //캘린더 객체를 생성해주면 현재 시간을 한번가져온다.얘도 계속 세팅이 되야한다.
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