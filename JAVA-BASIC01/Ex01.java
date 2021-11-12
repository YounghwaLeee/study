import java.util.Scanner;
class Ex01 
{
	public static void main(String[] args) 
	{	//데이터얻어오기
	Scanner input= new Scanner(System.in);
		System.out.print("정수");
		int n1=input .nextInt();
		System.out.print("정수");
		int n2=input.nextInt(); 
		// 계산 
		int result=(n1>n2)? n1:n2;
		System.out.println(n1+"과"+n2+"중에 큰값은"+result+ "result입니다.");
	
	}
}

/*
두수를 입력받아 큰값을 출력하라.
*/