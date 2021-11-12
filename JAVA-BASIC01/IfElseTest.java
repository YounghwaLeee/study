import java.util.Scanner;

class IfElseTest 
{
	public static void main(String[] args) 
	{
		//문제1. 임이의 값이 짝수면 100을 곱하여 출력
				//홀수면 200을 곱하여 출력

		Scanner scan = new Scanner(System.in);
		System.out.printf("양의 정수를 입력=");
		int data=scan.nextInt();

			int result=0;       //if문 밖에서 result 값을 지정해준다. 변수의 선언=0으로 지정했기떄문에 두번 리절트를 쓰지 않아도 된다.
			
			if(data%2==0){
			result= data * 100;
			}else{
				result=data *200;
			}

			System.out.printf("%d-->%d\n",data,result);
}

}
/*
	if~else문
	

	if(조건문){
		조건문이 참일떄 실행;
	}else{
		조건문이 거짓일떄 실행;
	}

*/

/*		if(data%2==0){
				int result =data*100;
					System.out.printf("%d-->%d\n",data,result);
		}
			else{
				int result =data*200;
					System.out.printf("%d-->%d\n",data,result);
	}*/