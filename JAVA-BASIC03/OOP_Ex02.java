import java.util.Scanner;

public class OOP_Ex02 {
			int dan;//�Է¹��� ���� ������ ���� �ʱⰪ�� ������ =0
			String gugu="";//�������� ������ ����=null�� ������ ���� ���ٴ°� ����
	 
	public OOP_Ex02() {
	} 		//���Է¹ޱ�
			int danInput() { //ȣ���
			Scanner scan= new Scanner (System.in);
			
			System.out.print("���Է�=");
			return scan.nextInt(); //����
			}
			
			//������ ����ϱ�
			void gugudan() {
				for(int i=1; i<=9; i++) {
					gugu+= dan+"*"+i+"="+dan*i;
						}
			 //gugu�� ��Ʈ������ ���ϵȴ�.�������� �����ϸ� 
			}
			
		void start() {
			dan = danInput();  //���Է� �޴� �޼��带 ȣ��
			gugudan(); //�� dan�̶� ������ �ɹ�����dan�� �ִ�.
			System.out.println(gugu);
		}	
		
		public static void main(String[] args) {
			OOP_Ex02 ar1= new OOP_Ex02 ();
				
		//System.out.println(oop.gugudan(oop.danInput()));
				
}

}
//�ֿܼ��� ���� �Է¹޾� �Է¹��� �������� ����϶�.
//(��������� �������ִ�.)1.�����Է� 2.��������� 3.���� �����Ͽ� ��� 

/*
1. �����Է�-Scanner  ���� �Է¹������� ����ϴ� �Ŵϱ� �޼ҵ� �ȿ����� �ϸ�ȴ�.



*/