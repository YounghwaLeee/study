//3���� �ٿ� ������ 

import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args) 
	{
		// Scanner �ֿܼ��� ����, ����, �Ǽ� ���� �Է¹޴� Ŭ����
		//1.��ü�� ����
		
		Scanner scan =new Scanner(System.in); //��ĳ�ʴ� ��ü�� �־�� ������.new

		//��ĳ�� ��ü scan��ä��=������.(�޼���)
		

		//2. �� �Է¹޴� �޼��带 ȣ���Ѵ�.
		// ��ü��. �޼ҵ�()
		// nextInt() : ������ �Է�, nextDouble() : �Ǽ��� �Է�, next() : 1���� �ܾ ���ڿ��� �Է�
		// nextLine() :������ ���ڿ��� �Է� 
		System.out.print("������ �Է��ϼ���..->");
		int num=scan.nextInt();
		System.out.print("�ι��� ����->");
		int num2=scan.nextInt(); 	
		
		int sum= num + num2;
		int minus =num-num2;
		int multiple =num * num2;
		int devied =num /num2;
		
		System.out.println("sum="+sum);
		System.out.println("minus="+minus);
		System.out.println("multiple="+multiple);
		System.out.println("devied="+devied);
		
	

	}
}
