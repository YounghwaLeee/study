import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class CatCat extends JFrame{
	int y=200  ; //�̹����� ó�� �����ϴ� �ʱⰪ x��ǥ
	int x=200 ;//��                     y��ǥ
	Dimension dim;//�������� ������ ���ϴ� ���(1) 
	public CatCat() {
		MyCanvas cvs = new MyCanvas();//����̰� ������ ĵ�����ϼ�
		add(BorderLayout.CENTER,cvs);//�������̾ƿ�����.
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		dim = cvs.getSize();//������ ������ ���ϴ� ���(2)
							//������ setsize()�Ʒ���
		
		while(true) {//��¹ݺ���
			cvs.repaint();//ĵ������ ����ϱ�
			x= x+10;//x��ǥ�� ���������༭ ĵ������ �̵��ϵ��� ��
			
			//dim.getWidth�� ��ȯ���� double�̱⶧���� int�� ����ȯ
			if(x>(int)dim.getWidth()) {//x��ǥ�� ���� �����Ӻ��� ũ�� x���� 0���� �ؼ� �������� ����
				x=0; 
			}else if(x<0) {//x���� ��� �پ� �ǿ������� ���� 0���� �۾����� ���������� �������� �����Ӱ��� ū ������ ����
				x=(int)dim.getWidth();
			}
				
			
			try {
	            Thread.sleep(200);
	         } catch(Exception e) {
	            
	         }
		}
	}
	class MyCanvas extends Canvas{//ĵ����Ŭ������ ��ӹ���
		ImageIcon icon = new ImageIcon("img/cat.jpg");
		Image img = icon.getImage();

	public void paint(Graphics g) {
						//x��ǥ,y��ǥ, �׸���, �׸�����
		g.drawImage(img, x,y,100,100,this);
	}
}
	public static void main(String[] args) {
		new CatCat();
	}

}
