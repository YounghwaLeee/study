//3교시 붙여 넣을것 

import java.util.Scanner;
class ScannerTest 
{
	public static void main(String[] args) 
	{
		// Scanner 콘솔에서 정수, 문자, 실수 등을 입력받는 클래스
		//1.객체를 생성
		
		Scanner scan =new Scanner(System.in); //스캐너는 객체가 있어야 생성됌.new

		//스캐너 객체 scan객채명=변수명.(메서드)
		

		//2. 값 입력받는 메서드를 호출한다.
		// 객체명. 메소드()
		// nextInt() : 정수가 입력, nextDouble() : 실수가 입력, next() : 1개의 단어가 문자열로 입력
		// nextLine() :한줄이 문자열로 입력 
		System.out.print("정수를 입력하세요..->");
		int num=scan.nextInt();
		System.out.print("두번재 정수->");
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
