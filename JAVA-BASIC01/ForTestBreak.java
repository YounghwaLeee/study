class ForTestBreak 
{
	public static void main(String[] args) 
	{
		//for문 시작하기 전에 : 콜론만 부쳐주면됌 브레이크를 걸때 한깐띄운다음에 라벨을 적어주면 된다. aaa:라벨을 쓰는것도 한가지 방법이다.
		//반복문 제어
		//break : 반복문을 중지
		//continue : 반복문을 한번 건너뛰기

		//1+2+3+4+5......
		//합이 2021을 최초로 초과하는 경우 어디까지 더해야 하는지 구하라. 
		//1.합을 구해서 저장할 변수 하나를 만들어 준다

		int sum=0;
		for (int i=1;  ;   i++ ){//조건식이 없으면 무한루프 i에 값을 줬으니 1씩증가하게 된다.
			sum+=i;
			if(sum>=2021){
				System.out.println("1~"+i+"까지의합은"+sum);
				break;

			}
				
		}//for 반복문 끝
		System.out.println("THE END....");

	}
}
