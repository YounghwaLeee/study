import java.util.Scanner ;
class Ex02 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է�=");
		int data =sc.nextInt();
		
		int result= (data>=100 && data<=200)? data : 0;
		System.out.println("result=" +result);
		
		//������ ���� �Է¹޾� �Է¹��� ���� 100~200�����ӳ� �Է¹��� ���� ����ϰ� �ƴϸ� 0�� ����ض�
	}
}
