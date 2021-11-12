class  Operator2
{
	public static void main(String[] args) 
	{
		//오퍼레이트 2에 저장되는거
		//2진수로 계산할 수 있는 연산자
		//논리연산자 비트연산자 &,|,^(XOR),~ -> 2진수 데이터를 이용한 연산자 
		//단항연산자 비트연산자~
		
		int a=12;
		int b=4;
		
		int result = a&b;// 1:true,0:false
		System.out.println("result"+result); //값4

		int result2 = a|b;// 1:true,0:false
		System.out.println("result2="+result2); //값12

		int result3 = a ^ b;// 1:true,0:false
		System.out.println("result3="+result3); //값 8

		// ~ (부정) 이진수중에서 음수로 계산됐을때 확인하는 방법
		//음수데이터를 확인하는 방법 : 2보수 -> 1의보수 +1
		//1의 보수는 0은 1로 1은 0으로 바꾸는 것이다.
		//1의 보수를 바꾼다음에 +1을 해주면 2의 보수가 된다
		//8+3+1=13 값은 -13이 나온다 2의보수
		//2의 보수로 바꾸어서 계산하기!!
		int result4 =~a;
		System.out.println("result4="+result4);


		//쉬프트 연산자 : 비트의 이동
		// << : 비트가 왼쪽으로 이동한다. 곱하기기능 *
		// << (부호로 채워짐),>>>(0으로 채워짐) : 비트가 오른쪽으로 이동한다./기능
		
		int result5= a<< 2; //왼쪽으로 2bit 이동 오른쪽은 0으로 채움 
		System.out.println("result5="+result5); //값은 48
		
		int result6 =a>>2; //오른쪽으로 2bit 이동 왼쪽에 남는 자리는 부호로 채워짐
		int result7 = result4>>2;  //-4
		System.out.println("result6="+result6); //3
		System.out.println("result7="+result7); //-4
		
		int result8 = result4 >>>2;
		System.out.println("result8="+result8);
		
		//이런 연산자가 자바에 있다 ! 이런 비트 연산자는 다 하지는 않는다 .


	}
}
