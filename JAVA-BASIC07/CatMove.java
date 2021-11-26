import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CatMove extends JFrame {
		int m=0;
		int y=500;//y좌표
	public CatMove() {
		MyCanvas cvs = new MyCanvas();//고양이가 찍히는 캔버스완성
		add(BorderLayout.CENTER,cvs);//보더레이아웃샌터.
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		while(true) {
			cvs.repaint(); //m이 0이라서 그림이 바뀌지는 않음.
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
			//						캔버스좌표			     			  //이미지좌표
		
			g.drawImage(img,     500,y+1,532,y+48,        32*m,0,32*(m+1),48,this);//캔버스크기 정해줌
			}
		
	}

	public static void main(String[] args) {
		
		new CatMove();
	}

}

// 캔버스=도화지