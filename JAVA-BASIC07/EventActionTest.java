import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventActionTest extends JFrame implements ActionListener {
   //ActionEvent(class), ActionListener(interface)
   JButton btn = new JButton("Ŭ���ϼ���");
   JButton btn2 = new JButton("Ȯ��");
   public EventActionTest() {
      add(BorderLayout.NORTH,btn);
      add(BorderLayout.SOUTH,btn2);

      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);

      //�̺�Ʈ ó��
      //1. �������̽� ��� �޴´�.
      //2. �̺�Ʈ�� �߻��ϴ� ���۷�Ʈ�� ����Ѵ�.
      btn.addActionListener(this);
      btn2.addActionListener(this);
   }
   //3. �߻�޼ҵ带 �������̵� �Ѵ�. �̺�Ʈ ����
   public void actionPerformed(ActionEvent ae) {
      Object obj = ae.getSource();
      //JButton eventBtn = (JButton)ae.getSource();
      if(obj ==btn) {
         gugudan(7);
      }else if(obj ==btn2) {
         System.exit(0);
      }
   }
   /*public void actionPerformed(ActionEvent ae) {
      //getActionCommend() : �̺�Ʈ�� �߻��� ���۳�Ʈ�� ���� ���Ѵ�.
      String event = ae.getActionCommand();
      if(event.equals("Ŭ���ϼ���")) {
         //������
         gugudan(6);
      }else if(event.equals("Ȯ��")) {
         //���α׷�����
         System.exit(0);
      }
   }*/
   public void gugudan(int dan) {
      for(int i=2;i<10;i++) {
         System.out.println(dan+"*"+i+"="+(dan*i));
      }
   }
   public static void main(String[] args) {
      new EventActionTest();
   }
}