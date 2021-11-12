
public class Arraybubbleshort {

	public static void main(String[] args) {
	//1.데이터 준비 먼저 
		//1~100사이의 난수를 10개 생성하여 배열에 대입후 오름차순 (작은수->높은수) 정렬하여 출발하라.
		//난수를 만든다
		
		int [] num = new int[10];  //10개의 정수를 사용할수 있는 공간
		
		//배열의 길이까지 0~9까지 구하는거
		for(int i=0; i<num.length;i++) {      //i=0,1,2,3,4,5,6,7,8,9
			int random=(int)(Math.random()*(100-1+1))+1;
			num[i]=random;   //난수생성법
		}

		//1.정렬전 데이터 출력
		System.out.println("정렬전데이타==============");
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+",");
			
		}
		System.out.println(); //랜덤인 1개의 수가 계속 수들이랑 싸워서 마지막에 최대값을 차지하게 된다.
		for(int j=0; j<num.length-1; j++) {
		//값들의 순서를 어떻게 바꾸는가? 아까 얘기하길 두수를 비교해서 바꾸고 바꾸고 하는거
		//index8이랑index9로 바꾸는거 .index9랑10은 못바꿈
		//10-1보다 작을때 까지 9아님 8부터 시작
			for(int i=0; i<num.length-1-j;i++) {//0,1,2,3,4,5,6,7,8 //배열의 i번쨰 있는수왜 1을빼냐 차차 오른쪽에서 왼쪽에서 고정되어서 비교한값이 되니까
				
				if(num[i] > num[i+1]) {
					//0번째있는게 1번째 데이터 보다 클때만 교환한다. //num[i]자리에 있는 값들을 비교해준다.num[i+1]은i옆자리애 있는애 
					
					//교환하기
					int temp = num[i]; //= temp i 값을 잠깐 보관
					num[i] =num[i+1];
					num[i+1]=temp;
				}
			}
			
		} //for
		
		System.out.println("정렬후 데이타===== ");//타이틀이니깐 반복안할게,/,
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+",");
		} //for
				
	} //main

} //class
