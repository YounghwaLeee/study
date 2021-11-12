import java.util.Scanner;
class IfEX01 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);

		int first=0, second=0, add=0, minus=0, mul=0 ,divide=0;
		System.out.print("첫번쨰 정수는");
		first =scan.nextInt();
		System.out.print("두번쨰 정수는");
		second =scan.nextInt();
		
		if(first>0 && second>0) {//두수가 양수일때
				add=first+second;
				minus= first-second;
				mul=first*second;
				divide =first/second;
				System.out.printf("%5d +%5d= %5d\n",first, second,add);
				System.out.printf("%5d - %5d = %5d\n", first,second,add);
				System.out.printf("%5d * %5d = %5d\n," ,first,second,add);
				System.out.printf("%5d / %5d= %5d\n," ,first,second,add);
				
		}else {
			System.out.printf("데이터를 잘못입력하였습니다");
		}
		

	}
}


//두수를 입력받아 입력받은 모든 수가 양수일때는 사칙연산은 한 결과를 출력하고, 
//"두수모두 양수가 아닐때는 데이터를 잘못입력하셨습니다." 라는 메세지를 출력받아