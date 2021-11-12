import java.util.Scanner;
class ForTest04 
{
	public static void main(String[] args) 
	{
	

				Scanner scan= new Scanner(System.in);
		System.out.println("정수입력");
		int max=scan.nextInt();
		
		
		int total=0,dooTotal=0,evenTotal=0;//전체합,홀수합,짝수합
		
		for(int i=1; i<=max;++i) {
			total+=i;
			if(i%2==0) {
				evenTotal+=i;
			
			}else{
				dooTotal +=i;
			}
	
	}
	
			System.out.printf("1~%d까지의 합은%d\n",max,total);
			System.out.printf("1~%d까지의 홀수의 합은%d\n",max,dooTotal);
			System.out.printf("1~%d까지의 짝수의 합은%d\n",max,evenTotal);
			



	}
}


/*
실행을 하면 정수입력=100엔터티면

1~100까지의 합은 5050
1~100까지의 홀수의 합은 2500
1~100까지의 짝수의 합은 2550
*/