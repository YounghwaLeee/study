import java.util.Scanner;
class IfEX01 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);

		int first=0, second=0, add=0, minus=0, mul=0 ,divide=0;
		System.out.print("ù���� ������");
		first =scan.nextInt();
		System.out.print("�ι��� ������");
		second =scan.nextInt();
		
		if(first>0 && second>0) {//�μ��� ����϶�
				add=first+second;
				minus= first-second;
				mul=first*second;
				divide =first/second;
				System.out.printf("%5d +%5d= %5d\n",first, second,add);
				System.out.printf("%5d - %5d = %5d\n", first,second,add);
				System.out.printf("%5d * %5d = %5d\n," ,first,second,add);
				System.out.printf("%5d / %5d= %5d\n," ,first,second,add);
				
		}else {
			System.out.printf("�����͸� �߸��Է��Ͽ����ϴ�");
		}
		

	}
}


//�μ��� �Է¹޾� �Է¹��� ��� ���� ����϶��� ��Ģ������ �� ����� ����ϰ�, 
//"�μ���� ����� �ƴҶ��� �����͸� �߸��Է��ϼ̽��ϴ�." ��� �޼����� ��¹޾�