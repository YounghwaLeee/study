import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventActionTest2 extends JFrame{
   JButton okbtn = new JButton("OK");
   JLabel lbl = new JLabel("jjjj",JLabel.CENTER);
   public EventActionTest2() {
      add(BorderLayout.NORTH,okbtn);
      add(lbl);

      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      //�̺�Ʈ���
      okbtn.addActionListener(new EventProcess(lbl));
      //���⼱ �̺�Ʈ ����ϴ°͸� �ִ�.
      
   }
   public static void main(String[] args) {
      new EventActionTest2();
   }
}