import java.util.Scanner;
class  IfTest
{
	public static void main(String[] args) 
	{

		//어떤수를 입력받아 짝수일때는 출력하고 짝수가 아니면 출력하지 마라

			Scanner scan=new Scanner (System.in);
			System.out.printf("0보다 큰 정수를 입력하세요");
			int num =scan.nextInt();
			
			if(num%3!=0){
				//if(num/3!=num/3.0){
				System.out.printf("%d은 짝수 입니다.\n",num);
				
			
			}
		System.out.println("end....");
	}
}

//3의 배수일때 구하는 방법
//if(num%3==0)

//3의배수가 아닐떄 출력해라
//if(num%3!=0){
//if(num/3!=num/3.0){
//System.out.printf("%d은 짝수 입니다.\n",num);

/*num=5(홀수) ,num=8이 들어가 있따(짝수)
모든 양의 정수를 홀수 짝수를 구하는 수식은

(1.% 나머지 짝수는 2로 나눈게 0
짝수로 구하는 수식  =num%2==0

홀수는 나눈 나머지 1

2.num/2       정수로나눈값
1=0
2=1
3=1

num/2.0         실수로 나눈값
1  /  2.0=0.5
2  /  2.0=1.0
3  /  2.0=1.5 
 
)

*/


/*

조건문은 반드시 논리형 결과여야 한다.
if(조건문or수식or변수or상수(리터럴실제값){
참일때 실행할 실행문을;
실행문;
실행문;
:


if(5+6)=에러난이유 논리형이 아니여서 (수식에 해당됌)
상수도 논리형
그렇냐 아니냐 ! 틀리냐 아니냐 !


			int a=100+200;
			if(true){
				System.out.printf("조건문 내의 문장이 실행됨");
				
				기본

}

*/