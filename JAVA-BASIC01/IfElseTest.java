import java.util.Scanner;

class IfElseTest 
{
	public static void main(String[] args) 
	{
		//����1. ������ ���� ¦���� 100�� ���Ͽ� ���
				//Ȧ���� 200�� ���Ͽ� ���

		Scanner scan = new Scanner(System.in);
		System.out.printf("���� ������ �Է�=");
		int data=scan.nextInt();

			int result=0;       //if�� �ۿ��� result ���� �������ش�. ������ ����=0���� �����߱⋚���� �ι� ����Ʈ�� ���� �ʾƵ� �ȴ�.
			
			if(data%2==0){
			result= data * 100;
			}else{
				result=data *200;
			}

			System.out.printf("%d-->%d\n",data,result);
}

}
/*
	if~else��
	

	if(���ǹ�){
		���ǹ��� ���ϋ� ����;
	}else{
		���ǹ��� �����ϋ� ����;
	}

*/

/*		if(data%2==0){
				int result =data*100;
					System.out.printf("%d-->%d\n",data,result);
		}
			else{
				int result =data*200;
					System.out.printf("%d-->%d\n",data,result);
	}*/