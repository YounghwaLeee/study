import java.util.Scanner;

public class ArrayScore {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//������ ������ ���� Ȯ������
		
		System.out.print("�л���=");
		int cnt= Integer.parseInt(scan.nextLine());
		//1.�л��� cnt�Է¹ޱ�
		//nextLine �� ���ڷ� �ٲ����
		String[] name =new String[cnt];
		int jumsu[][]= new int [cnt+2][6];//�л������� ������ �迭//2.�л�����ŭ �л��̸��Ǽ����ȴ�
		
		//�̸��� ������ �Է¹޾� �迭�� ����
		String[] title= {"����","����","����"};
		for(int i=0; i<cnt; i++) {//0,1,2 ��� ���ȣ�� ���
			System.out.print("�̸�=");
			name[i]=scan.nextLine();    //3������ 3���̸��� �Է¹ްڴ� �̸���
			for(int j=0; j<title.length;j++) {//0,1,2 0�϶� 0��°�� �ϴ� ���� �־��� ���� 0,1,2�� ����ȣ
				System.out.print(title[j]+"=");
				jumsu[i][j]= Integer.parseInt(scan.nextLine());
			}
		}
		//���κ� ����,���
		//���� ����
		 	for(int i=0; i<cnt;i++) {//0,1,2
		 		for(int j=0; j<3;j++) {//0,1,2 0=����1=����2=����
		 			jumsu[i][3]+=jumsu[i][j];//���κ�����
		 			jumsu[cnt][j] += jumsu[i][j];//��������
		 		
		 	}
		 		//���κ� ���
		 		jumsu[i][4] = jumsu[i][3]/3;
	}
		 		//���� ���
		 	for(int i=0; i<3; i++) {
		 		jumsu[cnt+1][i] =jumsu[cnt][i]/cnt;
		 	}
		
		 	//�������ϱ� 
		 	for(int i=0; i<cnt; i++) {//0,1,2,3
		 		
		 		//i�� �������� ��ġ
		 		for(int j=0; j<cnt; j++) {
		 			//������			//��������
		 			if(jumsu[i][3] < jumsu[j][3]) {
		 				jumsu[i][5]++;
		 				
		 			}
		 		}
		 		jumsu[i][5]++;
		 	}
		 	
		 	//���������� ���� 
		 	for(int i=0; i<cnt-1; i++) {//3��->0,1,
		 		//				3-1-0
		 		for(int j=0; j<cnt-1-i; j++) {// 0,1
		 			if(jumsu[j][5]	> jumsu[j+1][5] ) {
		 				//��ȯ
		 				//�̸��ٲٱ�
		 				String nameTemp=name[j];
		 				name[j]=name[j+1];
		 				name[j+1]=nameTemp;
		 				for(int k=0; k<jumsu[j].length;k++) {
		 					int temp =jumsu[j][k];
		 					jumsu[j][k]=jumsu[j+1][k];
		 					jumsu[j+1][k]= temp;
		 					
		 					//0,1,2,3,4,5
		 				}
		 				
		 			}
		 			
		 		}
		 		
		 	}
		
			System.out.println("===============================================================");
			System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
			System.out.println("===============================================================");
		
			for(int i=0;i<cnt; i++) {
				//�̸����-name�̶� ���� �־��
				System.out.println(name[i]+"\t");
				//�������=����,����,����,����,���
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				
				System.out.println();
			}
			
			//���� ���� ������3�����̴ϱ� 3������
			System.out.println("����\t");
			for(int i=0; i<3; i++) {
				System.out.print(jumsu[cnt][i]+"\t");
					
				}
					System.out.println();
					//�������
					System.out.println("���\t");
					for(int i=0; i<3; i++) {
						System.out.print(jumsu[cnt+1][i]+"\t");
						
					}
					
					System.out.println();
				}
			
			
}

			
			
	
	
	///���� ����� ���ϸ� �ȴ�
	//}	
		



//1.�л��� 2.���� 3. ������ �Է� �޾ƾ� �Ѵ� . 
//�׷��� ���� = ���,����,��������,����� ���ؾ� �Ѵ�
// ������ �������� ���ְ� , ����/3�� �ϰ� 
//���ı��� ��������Ѵ�. �� �𸣰ڴ� ~