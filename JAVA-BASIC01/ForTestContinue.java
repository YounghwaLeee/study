import java.util.Scanner;

class ForTestContinue 
{
	public static void main(String[] args) 
	{
		
			Scanner scan= new Scanner(System.in);
			
			System.out.print("홀수(1~49)입력=");
			int max =scan.nextInt(); 
			
			if(max%2==0){
				max++;
			}
			//출력할 문자 초기값
			char txt ='A';
			
			for(int row=1; row<=max; row+=2) {//줄에해당 2씩증가)
				//공백을 입력해야함
				for(int s=1; s<=(max-row)/2; s++){
					System.out.print(" ");
				}
				//1줄문자출력
				for(int cnt=1; cnt<=row; cnt++) {//1,1까지 
					System.out.print(txt++);
					if(txt>'Z') {//'z'를 출력하고 나면 'A'로 되돌리기
						txt='A';
					}
				}
				System.out.println();
			}
			for(int row=max-2; row>=1; row-=2) { //13이들어오면 11,9,7,5,3,1
				//공백
				for(int s=1; s<=(max-row)/2; s++) {
					System.out.print("  ");
				}
				//1줄문자
				for(int cnt=1; cnt<=row; cnt++) {
					System.out.print(txt++);
					if(txt>'Z') {
						txt ='A';
					}
				}
				System.out.println();
					//줄바꿈
			}
				
		}

	}