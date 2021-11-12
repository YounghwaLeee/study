import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
	//로또 번호 생성기 
		Scanner scan=new Scanner(System.in);
		
		do {
			//게임수 입력 받기
			System.out.println("게임수");
			int cnt= scan.nextInt();//cnt 1~7 123456 몇번까지 돌릴거니깐 
		
			//입력받은 게임수 만큼 게임 만들기
			for(int game=1; game<=cnt;game++) {//입력받은 게임수까지 1씩증가//ex 3 cnt =3 
					//(게임한개 만들기 (이걸 여러번 돌리는것이다) 7개의 공간을 선언함
				int []lotoo= new int[7]   ;    //로또번호+보너스를 난수로 생성하여 저장할 배열이 필요하다 . //7개의 배열필요 
				for(int i=0; i< lotoo.length;i++) {//---
					lotoo[i]=(int)(Math.random()*45)  +1;       //곱한다음 정수합 처음에는 중복이 안됨 첫번째랑 비교할 값 현재만들고[4] 있는 번호랑0번1,2,3비교
					////i가 나자신 여기서 중복검사 //c는 내가 포문을 몇번 돌릴지 정하는거다.
					for(int c=0; c<i;c++) {// i가 4면은 0123을 반복해서 비교한다음 중복값이 있으면 제거한다.
						if(lotoo[i] == lotoo[c]) {
							i--; //i가 3이였는데 같은 데이터가 나오면2로바뀜 . 줄마다 비교해서 계속 다르게해준다.
						}
						//방금만든 번호i 그전에 만든건c 
					}
				
		
				}
				//lotoo = i[0]=1,  i[1]=2   3.4,5,7    x=8         
				
				//정렬
				//i=5-0;  //
				for(int i=0; i<lotoo.length-2;i++) { //0일떄는 1번째꺼 비교 1일때는 2번째꺼 비교
					for(int j=0; j<lotoo.length-2-i;j++) {//하나를 정렬시키면 나머지만 정렬 시키면 되는거니까 별 떠올리면 되는데 하나 정렬을 이미 해줬으니까 그 나머지만정렬해주면됌//
						if(lotoo[j]>lotoo[j+1]) {//-2지만 -1(보너스) -1 내자신 인거 처음에는 아이가 영이니깐 빼주지 않음 이미 하나를 빼놓고 정렬시킬거니까 빼주고 뺴주고 뺴주고 아이를 뺴주고 
							int temp=lotoo[j];
							lotoo[j]=lotoo[j+1];
							lotoo[j+1]=temp;
						}
					}
				}
				System.out.print(game+"게임=");
				for(int i=0; i<lotoo.length;i++) {
					System.out.print(lotoo[i]+",");
				}
				System.out.println("bonus="+lotoo[6]);
						
			}
			
			
			int check=scan.nextInt();
			if(check==2) break;  //반복문 중단 이러면서 프로그램이 중단된다
		
			System.out.println("계속 하시겠습니까?[1.예,2.아니오]");
		}while(true);
		
	}
}

//		int []lotto= new int[6];
//		for(int i=0; i<lotto.length; i++) {
//		int random=(int)(Math.random()*45)+1;
//		
//		lotto[i]=random;
//		for(int j=0; j<i;j++) {
//			if(random==lotto[j]) {
//				i--; break;
//				
//		
//			}
//			System.out.printf(lotto[i]+"%t");
//		}
//		}
//		
//		int k=0;
//		for(int i=0;i<lotto.length;i++) {
//			for(int j=0; j<i; j++) { //ㅓ= i1<j2   j2>i1 )
//				if (lotto[i]<lotto[j]) {
//					k= lotto[j];   //j의값을k로보내고 그럼j값이 비어있으니 거기에 i를 넣고 i값이 비어있으니 k값을 넣는다 저장할 공간이 필요해서 그럼
//					lotto[j]=lotto[i];
//					lotto[i]=k;
//					
//					//중복 (i==j)가 같을때 제거 하기
//					
//				}
//			}
//	
//
//}
//
//}

/*
로또번호는 : 1~45까지 번호 6개 
보너스 번호 1
난수로 로또 번호를 생성해서 //
게임수= 3 입력을 받음
1게임(첫번쨰 난수)5,13,26,32,33, 보너스 11           //크기 순서대로 정리되어 있음. 중복처리도 해줘야함
2게임(첫번쨰 난수)5,13,26,32,33, 보너스 9
3게임(첫번쨰 난수)5,13,26,32,33, 보너스 23

계속하시겠습니까?(1.예,2.아니오)?1
게임수=5
1게임(첫번쨰 난수)5,13,26,32,33, 보너스 11
1게임(첫번쨰 난수)5,13,26,32,33, 보너스9
1게임(첫번쨰 난수)5,13,26,32,33, 보너스 23
1게임(첫번쨰 난수)5,13,26,32,33, 보너스 27
1게임(첫번쨰 난수)5,13,26,32,33, 보너스 45
계속하시겠습니까?(1.예,2.아니오)?2 아니고 
*/