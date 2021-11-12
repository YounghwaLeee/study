import java.util.Scanner;

public class ArrayEx03_Money {

	public static void main(String[] args) {
		
		int [] num= new int[10];
		Scanner scan = new Scanner(System.in);
		
		
		
		do {
			System.out.println("금액=");
			int money =scan.nextInt();
			
			
			//화폐단위
			//화폐단위와 갯수를 2차원에 초기화하여 생성한다.
							//=5만원은0.0열에있음//행번호는 계쏙 바껴야함
			int result[][]= {{50000,0},{10000,0},{5000,0},{1000,0},{500,0},
							{100,0},{50,0},{10,0},{5,0},{1,0}};
			
			//화폐단위 계산
			for(int row=0; row<result.length;row++) {//0~9까지 만들어 진다.
				result[row][1]=money/ result[row][0]; 
			money-= result[row][1]*result[row][1];	//현재 단위의 화폐금액만큼 차감 작업을 해야함
				
				
			}//출력 //1000원이상일때 
			for(int row=0;row<result.length;row++) {
				if(result[row][1]>0) {
				System.out.print(result[row][0]+"="+result[row][1]);
				if(result[row][0]>=1000) {
					System.out.println("장");
				}else {
					System.out.println("개");
				}
			}
		}	
		//종료확인
			System.out.print("계속 하시겠습니까?(1.예2.아니오)");//아니오가 들어가면 stop
			if(scan.nextInt()==2) {
				break;
			}
		
		}while(true); 
		
	
	
	} 



}


//for(  배열의 데이터형  :  배열 .컬렉션   )
//      	해당변수의 선언
