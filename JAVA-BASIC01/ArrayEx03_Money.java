import java.util.Scanner;

public class ArrayEx03_Money {

	public static void main(String[] args) {
		
		int [] num= new int[10];
		Scanner scan = new Scanner(System.in);
		
		
		
		do {
			System.out.println("�ݾ�=");
			int money =scan.nextInt();
			
			
			//ȭ�����
			//ȭ������� ������ 2������ �ʱ�ȭ�Ͽ� �����Ѵ�.
							//=5������0.0��������//���ȣ�� ��� �ٲ�����
			int result[][]= {{50000,0},{10000,0},{5000,0},{1000,0},{500,0},
							{100,0},{50,0},{10,0},{5,0},{1,0}};
			
			//ȭ����� ���
			for(int row=0; row<result.length;row++) {//0~9���� ����� ����.
				result[row][1]=money/ result[row][0]; 
			money-= result[row][1]*result[row][1];	//���� ������ ȭ��ݾ׸�ŭ ���� �۾��� �ؾ���
				
				
			}//��� //1000���̻��϶� 
			for(int row=0;row<result.length;row++) {
				if(result[row][1]>0) {
				System.out.print(result[row][0]+"="+result[row][1]);
				if(result[row][0]>=1000) {
					System.out.println("��");
				}else {
					System.out.println("��");
				}
			}
		}	
		//����Ȯ��
			System.out.print("��� �Ͻðڽ��ϱ�?(1.��2.�ƴϿ�)");//�ƴϿ��� ���� stop
			if(scan.nextInt()==2) {
				break;
			}
		
		}while(true); 
		
	
	
	} 



}


//for(  �迭�� ��������  :  �迭 .�÷���   )
//      	�ش纯���� ����
