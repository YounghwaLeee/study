import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CatMove extends JFrame {
		int m=0;
		int y=500;//y��ǥ
	public CatMove() {
		MyCanvas cvs = new MyCanvas();//����̰� ������ ĵ�����ϼ�
		add(BorderLayout.CENTER,cvs);//�������̾ƿ�����.
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		while(true) {
			cvs.repaint(); //m�� 0�̶� �׸��� �ٲ����� ����.
			if(m==3) {
				m=0;
			}else if(m!=3) {
				m++;
			}
			y=y+10;
		try {
	        Thread.sleep(200);
	     } catch(Exception e) {
	    	 
	     	}
		} 
				

		
	}
	
	class MyCanvas extends Canvas{
			ImageIcon icon = new ImageIcon("img/cat.png");
			Image img = icon.getImage();
	
		public void paint(Graphics g) {
			//						ĵ������ǥ			     			  //�̹�����ǥ
		
			g.drawImage(img,     500,y+1,532,y+48,        32*m,0,32*(m+1),48,this);//ĵ����ũ�� ������
			}
		
	}

	public static void main(String[] args) {
		
		new CatMove();
	}

}

// ĵ����=��ȭ��