import java.util.Scanner;

public class ArrayEX01 {

	public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
		// �迭�� �̿��ϴ� ����
		// ����,����,����,����,����,�ѱ���,����) 7������ ������ �Է¹޾� ������ ����� ���϶�.
		
		//������ �������� ���� �����͸� �迭�� ����
		String[] title={"����","����","����","����","����","�ѱ���","����"};
		//�� ������ ������ ����(����)�� �迭
		int jumsu[]=new int[7];//0,1,2,3,4,5,6 ���⿡ ������ �ٵ�����
		
		//�����Է�
		for(int idx=0; idx<title.length; idx++){//1. idx=0 
			System.out.print(title[idx]+"=");
			jumsu[idx]=scan.nextInt();
			
		}
		//���� �迭���� �����ϰ� ������ ���� ��밡���ϴ�.
		int tot=0;
		for(int i=0; i<title.length;i++) {
			tot=tot+jumsu[i];
		}
		
		//���
		int ave = tot/7;
		System.out.println("����="+tot);
		System.out.println("���="+ave);
				
		for(int idx=0; idx<title.length; idx++){
			System.out.println(jumsu[idx]);
			
			
			
		}
			

	}

}
