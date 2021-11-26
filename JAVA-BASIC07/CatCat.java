import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class CatCat extends JFrame{
	int y=200  ; //이미지가 처음 시작하는 초기값 x좌표
	int x=200 ;//ㅇ                     y좌표
	Dimension dim;//프레임의 사이즈 구하는 방법(1) 
	public CatCat() {
		MyCanvas cvs = new MyCanvas();//고양이가 찍히는 캔버스완성
		add(BorderLayout.CENTER,cvs);//보더레이아웃샌터.
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		dim = cvs.getSize();//프레임 사이즈 구하는 방법(2)
							//순서는 setsize()아래에
		
		while(true) {//출력반복문
			cvs.repaint();//캔버스를 출력하기
			x= x+10;//x좌표를 증가시켜줘서 캔버스가 이동하도록 함
			
			//dim.getWidth는 반환값이 double이기때문에 int로 형변환
			if(x>(int)dim.getWidth()) {//x좌표의 값이 프레임보다 크면 x값을 0으로 해서 왼쪽으로 보냄
				x=0; 
			}else if(x<0) {//x값이 계속 줄어 맨왼쪽으로 가서 0보다 작아지면 오른쪽으로 나오도륵 프레임가장 큰 값으로 변경
				x=(int)dim.getWidth();
			}
				
			
			try {
	            Thread.sleep(200);
	         } catch(Exception e) {
	            
	         }
		}
	}
	class MyCanvas extends Canvas{//캔버스클래스를 상속받음
		ImageIcon icon = new ImageIcon("img/cat.jpg");
		Image img = icon.getImage();

	public void paint(Graphics g) {
						//x좌표,y좌표, 그림폭, 그림높이
		g.drawImage(img, x,y,100,100,this);
	}
}
	public static void main(String[] args) {
		new CatCat();
	}

}
