import java.util.Scanner;

public class OOP_Ex01 {

	public OOP_Ex01() {
//		int dan = danInput();
//		String result= gugudan(dan);
//		System.out.println(result);
//		
		//System.out.println(gugudan((danInput)));
		
		
	} //new �ϸ� ������ �޼��尡 ������ �ȴ�.
	//���Է¹ޱ�
			//���������̴�int
			int danInput() {
			Scanner scan= new Scanner (System.in);
			
			System.out.print("���Է�=");
			return scan.nextInt();
			}
			//�����ϳ��� �Է¹޾Ƽ� �������ִ� �޼���.
			
			//������ ����ϱ�
			String gugudan(int dan) {
				String gugu="";
				for(int i=2; i<=9; i++) {
					gugu+= dan+"*"+i+"="+dan*i+"\n";
					
				}
			return gugu; //gugu�� ��Ʈ������ ���ϵȴ�.�������� �����ϸ� 
			}
			
		void start() {
			int dan = danInput();
			String result = gugudan(dan);
			System.out.println(result);
		}	
		
		public static void main(String[] args) {
			OOP_Ex01 oop = new OOP_Ex01();  //�길 ���ܳ��� ������ �� �ִ�.
		
		//System.out.println(oop.gugudan(oop.danInput()));
				oop.start();
}

}
//�ֿܼ��� ���� �Է¹޾� �Է¹��� �������� ����϶�.
//(��������� �������ִ�.)1.�����Է� 2.��������� 3.���� �����Ͽ� ��� 

/*
1. �����Է�-Scanner  ���� �Է¹������� ����ϴ� �Ŵϱ� �޼ҵ� �ȿ����� �ϸ�ȴ�.



*/