import java.util.Scanner;

class ForTest03 
{
	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("단입력");
		int dan=scan.nextInt();
		
		for(int i=2; i<=9;i++) {
			int result=dan*i;
			System.out.printf("%d *%d=%d\n",dan,i,result);
		}
		
			}
		}
/*
실행 단입력=5
5*2=10
5*3=15
5*4=20


5*9=45

*/