import java.util.Scanner;

class DoWhileex 
{
	public static void main(String[] args) 
	{
	
	     Scanner scan = new Scanner(System.in);
	        System.out.println("���� �Է����ּ���");
	        int money;
	        int result1;
	        int Option = 0;
	        int fivethwon = 0;
	        int thouwon1=0;
	        int thouwon2=0;
	        int hunwon=0;
	         //�̰ɿ־����� 
	        do {
	            money = scan.nextInt();//123000;
	            //���� 0���� ������ ���� ��� ������ 0�� ���ö� ���� ����� ���� money�� 10000/50000

	            System.out.print("�Է��� �ݾ�: " + money + "\n");
	            while(money / 50000 > 0){
	                money = money - 50000;
	                fivethwon++;
	            }
	            while(money / 10000 > 0){
	                money = money - 10000;
	                thouwon1++;
	            }
	            while(money / 1000 > 0){
	                money = money - 1000;
	                thouwon2++;
	            }
	            while(money / 100 > 0){
	                money = money - 100;
	                hunwon++;
	            }
	            System.out.printf("������ ��� Ƚ��:%d\n",fivethwon);
	            System.out.printf("  ���� ��� Ƚ��:%d\n",thouwon1);
	            System.out.printf("  õ�� ��� Ƚ��:%d\n",thouwon2);
	            System.out.printf("  ��� ��� Ƚ��:%d\n",hunwon);

	            System.out.printf("���� �ݾ�:%d\n",money);

	            System.out.println("1�� ��� ���� 2�� ����");
	            Option = scan.nextInt();
	        } while(Option==2);
	        //  System.exit(1);
	    }
	}
