public class ArrayTest01 {

	public static void main(String[] args) {
		// 1.배열은 같은 데이터형의 변수를 여러개 선언할때 필요하다.
		// 2.배열은 한번 생성되면 크기를 변경할 수 없다.
		
		//배열의 선언 (11차원의 배열) 타입은 제한을 받지 않는다
		int num[]= new int [50];//정수를 선언하는 대괄호 정의하는순간 초기값0
		// 초기값 정수:0, 실수:0.0, 논리형 false  
		
		String name[] = new String[5]; //null -존재하지 않는 정보
		
		num[2] =100;
		name[1] = "홍길동";
		
		System.out.println("num[1]=>" +num[1]);
		System.out.println("name[1]=>" +name[1]);
		
		//num 배열의 모든 값을 출력하라.
		//index가 0~4씩 1씩증가 반복문
		// num[0], num[1] num[2] num[3] num[4]
		
		//배열명.length (개수를 구하여 주는거)배열의 개수를 구하여 준다.
		
		for(int idx=0; idx<num.length; idx++) {
			System.out.println("num["+idx+"]="+ num[idx]);
		}
		
		
		//배열 생성시 초기값 설정하는 방법 원하는 데이터로 생성된다
		int[] data2= new int[]{20,65,74,5,87,2};//0 1 2 3 4 5 순서대로뱇
		for(int i=0; i<data2.length;i++) {
			System.out.println("data2["+i+"]="+data2[i]);
		}
		
		//배열 생성시 초기값 설정하는 방법2
		int[] data3= {8,7,5,37,75};
		for(int i=0; i<data3.length;i++) {
			System.out.println("data3["+i+"]="+ data3[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
