import java.util.Scanner;
class ForTest04 
{
	public static void main(String[] args) 
	{
	

				Scanner scan= new Scanner(System.in);
		System.out.println("�����Է�");
		int max=scan.nextInt();
		
		
		int total=0,dooTotal=0,evenTotal=0;//��ü��,Ȧ����,¦����
		
		for(int i=1; i<=max;++i) {
			total+=i;
			if(i%2==0) {
				evenTotal+=i;
			
			}else{
				dooTotal +=i;
			}
	
	}
	
			System.out.printf("1~%d������ ����%d\n",max,total);
			System.out.printf("1~%d������ Ȧ���� ����%d\n",max,dooTotal);
			System.out.printf("1~%d������ ¦���� ����%d\n",max,evenTotal);
			



	}
}


/*
������ �ϸ� �����Է�=100����Ƽ��

1~100������ ���� 5050
1~100������ Ȧ���� ���� 2500
1~100������ ¦���� ���� 2550
*/